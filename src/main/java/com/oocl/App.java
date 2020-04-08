package com.oocl;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String letsPlayAGame(int i) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        return IntStream
                .range(1, i+1)
                .mapToObj(student -> fizzbuzz.play(student)+"\n")
                .collect(Collectors.joining());
    }
}
