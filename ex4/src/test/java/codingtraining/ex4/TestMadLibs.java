package codingtraining.ex4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMadLibs {
    private static final String FORMAT = "${VERB} ${NOUN} ${ADVERB} ${ADJECTIVE}";
    @Test
    public void testMadLibs() {
        String result = MadLibs.getMadLibs(FORMAT, "a", "b", "c", "d");
        String expected = "b a d c";
        assertEquals(result, expected);
    }
}
