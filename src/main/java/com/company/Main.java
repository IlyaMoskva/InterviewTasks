package com.company;

import com.company.others.WaterPump;

public class Main {
    public static void main(String[] args) {
        try{
            WaterPump pump = new WaterPump();
            pump.balanceIt();
        } catch (InterruptedException e) {}
    }
}
