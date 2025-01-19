import org.example.Greeter;
import org.junit.jupiter.api.Test;

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


    @Test
    void shouldReturnGoodMorningWhenTimeIs06_00_To_12_00() {
//        Given
        Greeter greeter = new Greeter(LocalTime.of(8, 0));
        String name = "peter";

//        When
        String result = greeter.greet(name);

//        Then
        String expected = "Good morning Peter";
        assertEquals(expected, result);
    }

}
