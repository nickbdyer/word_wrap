package word_wrap;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WrapperTest {

    @Test
    public void emptyString() {
        assertEquals("", Wrapper.wrap("", 1));
    }

    @Test
    public void wordShorterThanCol() {
        assertEquals("word", Wrapper.wrap("word", 11));
    }

    @Test
    public void wrapsOneWrod() {
        assertEquals("wo\nrd", Wrapper.wrap("word", 2));
    }

    @Test
    public void wrapsOneWordTwice() {
        assertEquals("abc\ndef\nghi\nj", Wrapper.wrap("abcdefghij", 3));
    }

    @Test
    public void wrapsOnWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 5));
    }

    @Test
    public void wrapsMultipleTimesOnWordBoundary() {
        assertEquals("word\nword\nword", Wrapper.wrap("word word word", 5));
    }

    @Test
    public void wrapsAfterWordBoundary() {
       assertEquals("word\nword", Wrapper.wrap("word word", 6));
    }

    @Test
    public void wrapsBeforeWordBoundary() {
        assertEquals("wor\nd\nwor\nd", Wrapper.wrap("word word", 3));
    }

    @Test
    public void wrapsJustBeforeWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 4));
    }

}
