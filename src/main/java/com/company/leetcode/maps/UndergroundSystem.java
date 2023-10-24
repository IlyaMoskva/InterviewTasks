package com.company.leetcode.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;

/**
 * LC 1396. Design Underground System

 An underground railway system is keeping track of customer travel times between different stations.
 They are using this data to calculate the average time it takes to travel from one station to another.

 Implement the UndergroundSystem class:

 void checkIn(int id, string stationName, int t)
 A customer with a card ID equal to id, checks in at the station stationName at time t.
 A customer can only be checked into one place at a time.
 void checkOut(int id, string stationName, int t)
 A customer with a card ID equal to id, checks out from the station stationName at time t.
 double getAverageTime(string startStation, string endStation)
 Returns the average time it takes to travel from startStation to endStation.
 The average time is computed from all the previous traveling times from startStation to endStation
 that happened directly, meaning a check in at startStation followed by a check out from endStation.
 The time it takes to travel from startStation to endStation may be different from the time it takes to travel from endStation to startStation.
 There will be at least one customer that has traveled from startStation to endStation before getAverageTime is called.
 You may assume all calls to the checkIn and checkOut methods are consistent.
 If a customer checks in at time t1 then checks out at time t2, then t1 < t2. All events happen in chronological order.

 *  Your UndergroundSystem object will be instantiated and called as such:
 *  UndergroundSystem obj = new UndergroundSystem();
 *  obj.checkIn(id,stationName,t);
 *  obj.checkOut(id,stationName,t);
 *  double param_3 = obj.getAverageTime(startStation,endStation);
 */
class UndergroundSystem {
    private Map<Integer, SimpleEntry<String, Integer>> checkIns = new HashMap<>();
    private Map<SimpleEntry<String, String>, int[]> times = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new SimpleEntry(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        var startStation = checkIns.get(id).getKey();
        var startTime = checkIns.get(id).getValue();
        checkIns.remove(id);

        var pair = new SimpleEntry(startStation, stationName);
        var totalTime = times.containsKey(pair) ? times.get(pair)[0] : 0;
        var dataPoints = times.containsKey(pair) ? times.get(pair)[1] : 0;

        times.put(pair, new int[] {totalTime + t - startTime, dataPoints + 1});
    }

    public double getAverageTime(String startStation, String endStation) {
        var pair = new SimpleEntry(startStation, endStation);

        return (double) times.get(pair)[0] / times.get(pair)[1];
    }
}
