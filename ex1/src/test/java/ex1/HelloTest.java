package ex1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testGetHello() {
        String expected = "Hello, Brian, nice to meet you!";
        assertEquals(expected, Hello.getHello("Brian"));
    }
}
