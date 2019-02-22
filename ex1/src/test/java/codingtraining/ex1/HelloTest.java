package codingtraining.ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testGetHello() {
        String expected = "Hello, Brian, nice to meet you!";
        assertEquals(expected, Hello.getHello("Brian"));
    }
}
