package codingtraining.ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCountTest {
    @Test
    public void testStringCountCalculate() {
        int length = StringCount.calculateStringCount("Homer");
        assertEquals(5, length);
    }
}
