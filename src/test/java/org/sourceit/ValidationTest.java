package org.sourceit;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void testCountDigits1() {
        long result = Validation.countDigits(123456);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testCountDigits2() {
        long result = Validation.countDigits(0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testCountDigits3() {
        long result = Validation.countDigits(-123456);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSumOfNumber() {
        long result = Validation.sumOfNumber(1234);
        Assert.assertEquals("Test positive number", 10, result);
        result = Validation.sumOfNumber(0);
        Assert.assertEquals("Test zero", 0, result);
        result = Validation.sumOfNumber(-123);
        Assert.assertEquals("Test negative number", -6, result);
    }



}
