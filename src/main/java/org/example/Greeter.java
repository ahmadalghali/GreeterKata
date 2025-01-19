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
        var hour = this.localTime.getHour();
        String sanitizedInput = sanitize(input);
        if (hour >= 6 && hour <= 12) {
            return "Good morning " + sanitizedInput;
        } else if (hour >= 18 && hour <= 22) {
            return "Good evening " + sanitizedInput;
        } else {
            return "Hello " + sanitizedInput;
        }
    }

    private String sanitize(String input) {
        String trimmedInput = input.trim();

        return trimmedInput.substring(0, 1).toUpperCase() + trimmedInput.substring(1, trimmedInput.length());
    }
}
