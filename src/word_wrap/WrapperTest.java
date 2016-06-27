package word_wrap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperTest {
    
    @Test
    public void emptyString() {
        assertEquals("", Wrapper.wrap("", 1));
    }

    @Test
    public void wordShorterThanWrapColumn() {
        assertEquals("word", Wrapper.wrap("word", 7));
    }

    @Test
    public void anotherWordShorterThanWrapColumn() {
        assertEquals("another", Wrapper.wrap("another", 9));
    }

    @Test
    public void wrapsOneWord() {
        assertEquals("wo\nrd", Wrapper.wrap("word", 2));
    }

    @Test
    public void wrapsAnotherFourLetterWord() {
        assertEquals("fo\nur", Wrapper.wrap("four", 2));
    }

    @Test
    public void wrapsYetAnotherFourLetterWord() {
        assertEquals("fi\nve", Wrapper.wrap("five", 2));
    }
}
