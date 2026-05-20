import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void testAddition() {
        int expected = 10;
        int actual = 5 + 5;

        assertEquals(expected, actual);
    }
}