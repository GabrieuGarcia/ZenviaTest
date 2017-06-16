package com.example.gabriel.zenviatest;

import junit.framework.Assert;

import org.testng.annotations.Test;

/**
 * Created by Gabriel on 15/06/17.
 */

public class FizzBuzzTeste {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz.getResult(5));
        Assert.assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));
    }
}
