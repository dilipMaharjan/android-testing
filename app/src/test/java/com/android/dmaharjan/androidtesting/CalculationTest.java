package com.android.dmaharjan.androidtesting;

import com.android.dmaharjan.util.Calculations;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by dmaharjan on 2/27/17.
 */

public class CalculationTest {
    private Calculations calculations;
    @Before
    public void before(){
        calculations=new Calculations();
    }
    @Test
    public void testSum(){
        assertEquals(5,calculations.sum(2,3));
    }
    @Test
    public void testProfit(){
        assertTrue(calculations.profit(500,500));
    }
}
