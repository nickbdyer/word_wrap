package word_wrap;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WrapperTest {
    @Test
    public void emptyString() {
        assertEquals("", Wrapper.wrap("", 1));
    }

    @Test
    public void stringShorterThanCol() {
        assertEquals("this", Wrapper.wrap("this", 10));
    }

    @Test
    public void splitOneWord() {
        assertEquals("wo\nrd", Wrapper.wrap("word", 2));
    }

    @Test
    public void splitOneWordManyTimes() {
        assertEquals("abc\ndef\nghi\nj", Wrapper.wrap("abcdefghij", 3));
    }

    @Test
    public void wrapOnWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 5));
    }

    @Test
    public void wrapOnMultipleWordBoundaries() {
        assertEquals("word\nword\nword", Wrapper.wrap("word word word", 5));
    }

    @Test
    public void wrapAfterWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 6));
    }

    @Test
    public void wrapBeforeWordBoundary() {
        assertEquals("wor\nd\nwor\nd", Wrapper.wrap("word word", 3));
    }

    @Test
    public void wrapJustBeforeWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 4));
    }
}
