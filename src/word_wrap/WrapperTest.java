package word_wrap;

import org.junit.Ignore;
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

    @Test
    public void doesNotWrapFourWithColumn7() {
        assertEquals("four", Wrapper.wrap("four", 7));
    }

    @Test
    public void doesNotWrapFiveWithColumn7() {
        assertEquals("five", Wrapper.wrap("five", 7));
    }

    @Test
    public void wrapsOneWordWithColumn3() {
        assertEquals("wor\nd", Wrapper.wrap("word", 3));
    }

    @Test
    public void wrapsAnotherFourLetterWordWithColumn3() {
        assertEquals("fou\nr", Wrapper.wrap("four", 3));
    }

    @Test
    public void wrapsLongerWordWithColumn5() {
        assertEquals("fourt\neen", Wrapper.wrap("fourteen", 5));
    }
}
