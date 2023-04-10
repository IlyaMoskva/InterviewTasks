package com.company.others;

/**
 * Water pump emulator.
 * Drill - consumption of water, small and big pumps - to add water into tank.
 * Idea is to emulate station, where pumps enabling by minimum level of water is reached and until High level achieved.
 */
public class WaterPump {

    private final int LOW_LEVEL = 50;
    private final int HIGH_LEVEL = 80;

    private class Tank {
        int waterLevel;
        Tank(int level) {
            waterLevel = level;
        }
    }

    private Tank tank;
    Pump smallPump;
    Pump bigPump;
    Pump drill;

    private class Pump extends Thread {

        private int volume;
        public Pump(int volume, String name) {
            super(name);
            this.volume = volume;
        }

        @Override
        public void run() {
            synchronized (tank) {
                tank.waterLevel += volume;
                printLevel(this.getName());
            }
        }
    }
    private void printLevel(String name) { System.out.println(name + ": " + tank.waterLevel); }


    public WaterPump() {
        tank = new Tank(100);
        smallPump = new Pump(10, "small");
        bigPump = new Pump(20, "big");
        drill = new Pump(-25, "drill");
    }

    public synchronized void balanceIt() throws InterruptedException {
        synchronized (tank) {
            while (true) {
                drill.run();
                if (tank.waterLevel < HIGH_LEVEL) {
                    smallPump.run();
                }
                if (tank.waterLevel < LOW_LEVEL) {
                    bigPump.run();
                }
            }
        }
    }
}
