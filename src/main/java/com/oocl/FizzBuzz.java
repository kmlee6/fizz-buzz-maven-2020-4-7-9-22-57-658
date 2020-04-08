package com.oocl;

public class FizzBuzz {

    public String play(int input) {
        String outputString = "";
        if(input % 3 == 0){
            outputString += "Fizz";
        }
        if(input % 5 == 0){
            outputString += "Buzz";
        }
        return outputString.length()>0 ? outputString : ""+input;
    }
}
