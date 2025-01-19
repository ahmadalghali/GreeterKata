import org.example.Greeter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    void shouldReturnHelloPlusInput() {
//        Given
        Greeter greeter = new Greeter();
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Hello Peter";
        assertEquals(expected, result);
    }

    @Test
    void shouldTrimInput() {
//        Given
        Greeter greeter = new Greeter();
        String name = "   peter  ";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Hello Peter";
        assertEquals(expected, result);
    }

    @Test
    void shouldCapitalizeFirstLetter() {
        //        Given
        Greeter greeter = new Greeter();
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Hello Peter";
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({
            "6, 0",
            "7, 15",
            "8, 30",
            "9, 45",
            "10, 50",
            "11, 59",
            "12, 0"
    })
    void shouldReturnGoodMorningWhenTimeIs06_00_To_12_00(int hour, int minute) {
//        Given
        Greeter greeter = new Greeter(LocalTime.of(hour, minute));
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Good morning Peter";
        assertEquals(expected, result);
    }

}
