package org.example;

public class Greeter {

    public String greet(String input) {
        String trimmedInput = input.trim();
        String greeting = "Hello " + trimmedInput;
        System.out.println(greeting);
        return greeting;
    }
}
