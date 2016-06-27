package word_wrap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperTest {
    
    @Test
    public void emptyString() {
        assertEquals("", Wrapper.wrap("", 1));
    }

}
