package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {
    @Test
    public void then_15_get_FizzBuzz() {
        int testValue = 15;
        Assert.assertEquals("FizzBuzz", FizzBuzz.getText(testValue));
    }
    @Test
    public void then_6_get_Fizz() {
        int testValue = 6;
        Assert.assertEquals("Fizz", FizzBuzz.getText(testValue));
    }
    @Test
    public void then_10_get_Buzz() {
        int testValue = 10;
        Assert.assertEquals("Buzz", FizzBuzz.getText(testValue));
    }
    @Test
    public void then_any_other_number_get_number() {
        int testValue = 8;
        Assert.assertEquals(Integer.toString(testValue), FizzBuzz.getText(testValue));
    }
}
