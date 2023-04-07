import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();
        String expectedOutput = "Hello and welcome!";
        String actualOutput = main.getGreeting();
        assertEquals(expectedOutput, actualOutput);
    }
}
