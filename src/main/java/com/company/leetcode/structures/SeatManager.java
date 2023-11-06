package com.company.leetcode.structures;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * 1845. Seat Reservation Manager
 Design a system that manages the reservation state of n seats that are numbered from 1 to n.

 Implement the SeatManager class:

 SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n.
 All seats are initially available.
 int reserve() Fetches the smallest-numbered unreserved seat, reserves it,
 and returns its number.
 void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.

 Constraints:

 1 <= n <= 105
 1 <= seatNumber <= n
 For each call to reserve, it is guaranteed that there will be at least one unreserved seat.
 For each call to unreserve, it is guaranteed that seatNumber will be reserved.
 At most 105 calls in total will be made to reserve and unreserve.

 Idea: easy to get, but slow and memory-greed solution:
 use 2 Order Sets to store reserved and free spaces

 Optimized:
 Use only available seats set and marker with first available place.
 Use .first() method for reserve
 */
public class SeatManager {
    NavigableSet<Integer> reserved;
    NavigableSet<Integer> unreserved;

    int marker;
    NavigableSet<Integer> availableSeats;
    public SeatManager(int n) {
        // Set marker to the first unreserved seat.
        marker = 1;
        // Initialize the sorted set.
        availableSeats = new TreeSet<>();

        reserved = new TreeSet<Integer>();
        unreserved = new TreeSet<Integer>();
        for (int i = 1; i<n+1; i++) {
            unreserved.add(i);
        }
    }

    public int reserve() {
        int place = unreserved.pollFirst();
        reserved.add(place);
        return place;
    }

    public void unreserve(int seatNumber) {
        unreserved.add(seatNumber);
        reserved.remove(seatNumber);
    }

    public int reserve1() {
        // If the sorted set has any element in it, then,
        // get the smallest-numbered unreserved seat from it.
        if (!availableSeats.isEmpty()) {
            int seatNumber = availableSeats.first();
            availableSeats.remove(seatNumber);
            return seatNumber;
        }

        // Otherwise, the marker points to the smallest-numbered seat.
        int seatNumber = marker;
        marker++;
        return seatNumber;
    }

    public void unreserve2(int seatNumber) {
        // Push the unreserved seat in the sorted set.
        availableSeats.add(seatNumber);
    }
}
