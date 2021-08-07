package com.company.talabat;

import static org.junit.jupiter.api.Assertions.*;

class PoweringTest {

    @org.junit.jupiter.api.Test
    void power() {
        Powering p = new Powering();

        assertEquals(4, p.power(2,2));
        assertEquals(1, p.power(2, 0));
        assertEquals(1024, p.power(2, 10));
    }
}