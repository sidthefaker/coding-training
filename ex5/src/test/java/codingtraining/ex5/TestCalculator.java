package codingtraining.ex5;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {
    public static final int FIRST = 10;
    public static final int SECOND = 5;

    @Test
    public void testAdd() {
        int result = Calculator.add(FIRST, SECOND);
        assertEquals(FIRST + SECOND, result);
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(FIRST, SECOND);
        assertEquals(FIRST - SECOND, result);
    }

    @Test
    public void testMultiply() {
        int result = Calculator.multiply(FIRST, SECOND);
        assertEquals(FIRST * SECOND, result);
    }

    @Test
    public void testDivde() {
        int result = Calculator.divide(FIRST, SECOND);
        assertEquals(FIRST / SECOND, result);
    }
}
