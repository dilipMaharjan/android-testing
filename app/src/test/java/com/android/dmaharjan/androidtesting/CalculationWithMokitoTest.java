package com.android.dmaharjan.androidtesting;

import com.android.dmaharjan.util.Calculations;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

/**
 * Created by dmaharjan on 2/27/17.
 */

public class CalculationWithMokitoTest {

    @Rule
    public MockitoRule mokitoRule = MockitoJUnit.rule(); //initializes annotations and verifies correct use of mockito
    @Mock
    private Calculations calculations;

    @Test
    public void testSum() {
        //Calculations calculations = mock(Calculations.class);
        when(calculations.sum(2, 3)).thenReturn(5);
    }

    @Test
    public void testProfit() {
        //  Calculations calculations = mock(Calculations.class);
        when(calculations.profit(300, 500)).thenReturn(true);
    }

}
