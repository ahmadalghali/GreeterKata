package org.example;

import java.time.LocalTime;

public class Greeter {

    private LocalTime localTime;

    public Greeter() {
        this.localTime = LocalTime.now();
    }

    public Greeter(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String greet(String input) {
        String greeting = "Hello";

        String sanitizedInput = sanitize(input);

        if (localTime.isAfter(LocalTime.of(5, 59))
                && localTime.isBefore(LocalTime.of(12, 1))) {
            greeting = "Good morning";
        } else if (localTime.isAfter(LocalTime.of(17, 59))
                && localTime.isBefore(LocalTime.of(22, 1))) {
            greeting = "Good evening";
        } else if (!localTime.isBefore(LocalTime.of(22, 0))
                || !localTime.isAfter(LocalTime.of(6, 0))) {
            greeting = "Good night";
        }

        return greeting + " " + sanitizedInput;
    }

    private String sanitize(String input) {
        String trimmedInput = input.trim();

        return trimmedInput.substring(0, 1).toUpperCase() + trimmedInput.substring(1, trimmedInput.length());
    }
}
