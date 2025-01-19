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
        Greeter greeter = new Greeter(LocalTime.of(15, 0));
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
        Greeter greeter = new Greeter(LocalTime.of(15, 0));
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
        Greeter greeter = new Greeter(LocalTime.of(15, 0));
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

    @ParameterizedTest
    @CsvSource({
            "18, 0",
            "18, 15",
            "18, 30",
            "19, 0",
            "19, 45",
            "20, 10",
            "20, 50",
            "21, 25",
            "21, 59",
            "22, 0"
    })
    void shouldReturnGoodEveningWhenTimeIs18_00_To_22_00(int hour, int minute) {
//        Given
        Greeter greeter = new Greeter(LocalTime.of(hour, minute));
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Good evening Peter";
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({
            "22, 1",
            "22, 30",
            "23, 15",
            "23, 59",
            "0, 0",
            "0, 45",
            "1, 20",
            "2, 10",
            "3, 30",
            "4, 50",
            "5, 5",
            "5, 58",
            "5, 59",
    })
    void shouldReturnGoodEveningWhenTimeIs22_01_To_5_59(int hour, int minute) {
//        Given
        Greeter greeter = new Greeter(LocalTime.of(hour, minute));
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Good night Peter";
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({
            "12, 1",
            "12, 30",
            "13, 0",
            "13, 45",
            "14, 10",
            "14, 55",
            "15, 20",
            "15, 40",
            "16, 0",
            "16, 30",
            "17, 15",
            "17, 59"
    })
    void shouldReturnHelloPlusInputWhenIsAnyOtherTime(int hour, int minute) {
//        Given
        Greeter greeter = new Greeter(LocalTime.of(hour, minute));
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Hello Peter";
        assertEquals(expected, result);
    }

}
