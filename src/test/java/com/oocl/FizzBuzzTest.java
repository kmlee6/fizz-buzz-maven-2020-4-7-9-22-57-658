package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_value_when_input_is_normal() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String returnValue = fizzBuzz.play(1);
        assertEquals("1", returnValue);
    }

    @Test
    public void should_return_Fizz_when_input_is_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String returnValue = fizzBuzz.play(3);
        assertEquals("Fizz", returnValue);
    }

    @Test
    public void should_return_Buzz_when_input_is_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String returnValue = fizzBuzz.play(5);
        assertEquals("Buzz", returnValue);
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_multiple_of_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String returnValue = fizzBuzz.play(15);
        assertEquals("FizzBuzz", returnValue);
    }

    @Test
    public void should_answer_correct_for_all_student() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        App peLesson = new App();
        String output = peLesson.letsPlayAGame(15);
        assertEquals(expected, output);
    }
}
