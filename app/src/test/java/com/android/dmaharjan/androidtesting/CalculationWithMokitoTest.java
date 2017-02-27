package com.android.dmaharjan.androidtesting;

import com.android.dmaharjan.util.Calculations;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dmaharjan on 2/27/17.
 */

public class CalculationWithMokitoTest {

    @Test
    public void testSum() {
        Calculations calculations = mock(Calculations.class);
        when(calculations.sum(2,3)).thenReturn(5);
        assertEquals(calculations.sum(2, 3),5);
    }

    @Test
    public void testProfit() {
        Calculations calculations = mock(Calculations.class);
        when(calculations.profit(300,500)).thenReturn(true);
        assertTrue(calculations.profit(300, 500));
    }

}
