package org.example;

public class Greeter {

    public String greet(String input) {
        String greeting = "Hello " + sanitize(input);
        System.out.println(greeting);
        return greeting;
    }

    private String sanitize(String input) {
        String trimmedInput = input.trim();

        return trimmedInput.substring(0, 1).toUpperCase() + trimmedInput.substring(1, trimmedInput.length());
    }
}
