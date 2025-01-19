import org.example.Greeter;
import org.junit.jupiter.api.Test;

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
        String expected = "Hello peter";
        assertEquals(expected, result);
    }
}
