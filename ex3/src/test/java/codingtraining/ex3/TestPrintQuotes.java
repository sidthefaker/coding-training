package codingtraining.ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrintQuotes {
    private static final String EXPECTED = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
    @Test
    public void testPrintQuotes() {
        String name = "Obi-Wan Kenobi";
        String quote = "These aren't the droids you're looking for";
        String result = PrintQuotes.printQuotes(name, quote);
        assertEquals(result, EXPECTED);
    }
}
