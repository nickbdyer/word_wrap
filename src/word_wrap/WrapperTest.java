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

}
