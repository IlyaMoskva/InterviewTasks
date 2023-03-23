package com.company.talabat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoweringTest {

    @Test
    void power() {
        Powering p = new Powering();

        assertEquals(4, p.power(2,2));
        assertEquals(1, p.power(2, 0));
        assertEquals(1024, p.power(2, 10));
    }

    @Test
    void pow() {
        Powering p = new Powering();

        assertEquals(9.261000000000001, p.myPow(2.1,3));
        assertEquals(1, p.myPow(2, 0));
        assertEquals(0.25, p.myPow(2, -2));
    }
}