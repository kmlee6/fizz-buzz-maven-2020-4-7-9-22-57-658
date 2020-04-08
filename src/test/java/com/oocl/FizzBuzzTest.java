package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_value_when_input_is_normal(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String returnValue=  fizzBuzz.play(1);
        assertEquals("1", returnValue);
    }
}
