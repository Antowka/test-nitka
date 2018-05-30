package ru.antowka;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrickCounterSimpleTest {

    @Test
    public void wight() {
        BrickCounter bc = new BrickCounterSimple();
        assertEquals(0, bc.weight(0, 0), 0.0);

        assertEquals(0.5, bc.weight(1, 0), 0.0);
        assertEquals(0.5, bc.weight(1, 1), 0.0);

        assertEquals(0.75, bc.weight(2, 0), 0.0);
        assertEquals(1.5, bc.weight(2, 1), 0.0);
        assertEquals(0.75, bc.weight(2, 2), 0.0);

        assertEquals(0.875, bc.weight(3, 0), 0.0);
        assertEquals(2.125, bc.weight(3, 1), 0.0);
        assertEquals(2.125, bc.weight(3, 2), 0.0);
        assertEquals(0.875, bc.weight(3, 3), 0.0);

//        double actual = bc.weight(322, 156);
//        System.out.println(actual);
//        assertEquals(306.48749781747574, actual, 0.0);
    }
}
