import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIdTest {
    @Test
    @DisplayName("ต้องได้ id=userId_1 จาก 0 1 2")
    public void case01() {
        GenerateId uId = new GenerateId();
        String id = uId.getId();
        assertEquals("userId_1", id);
    }
}