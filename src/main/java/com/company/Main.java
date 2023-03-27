package com.company;

import com.company.others.WaterPump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try{
            WaterPump pump = new WaterPump();
            pump.balanceIt();
        } catch (InterruptedException e) {}
    }
}
