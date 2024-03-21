package com.baeldung;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] v = {14, 10}
        boolean actual = App.isMaxHeap(v);
        assertTrue( actual );
    }
}
