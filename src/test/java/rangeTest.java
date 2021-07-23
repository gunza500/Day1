import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class rangeTest {
    @Test
    @DisplayName("[1,5] นั้นจะขึ้นต้นด้วย [")
    public void startWithInclude() {
        Range range = new Range("[1,5]");
        boolean result = range.isStartWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("[1,5] นั้นจะขึ้นเลขด้วย 1")
    public void startNumWithInclude() {
        Range range = new Range("[1,5]");
        int result = range.isStartNumWithInclude();
        assertEquals(1,result);
    }
   /* @Test
    @DisplayName("[1,5] นั้นจะขึ้นจบด้วย )")
    public void endWithInclude() {
        Range range = new Range("[1,5]");
        boolean result = range.isStartWithInclude();
        assertTrue(result);
    }*/
    @Test
    @DisplayName("(1,5] นั้นจะขึ้นต้นด้วย (")
    public void startWithExclude() {
        Range range = new Range("(1,5]");
        boolean result = range.isStartWithExclude();
        assertTrue(result);
    }
}