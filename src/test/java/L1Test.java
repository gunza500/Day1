import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L1Test {
    @Test
    @DisplayName("ทดสอบ การ เทส เฉยๆ")
    public void case1(){
        //Arrange เตรียม
        L1 hello = new L1();
        String name = "Gun";
        //Act กการระทำ
        String re = hello.sayhi(name);
        //Assert เช็คผล
        assertEquals("Hello_Gun",re);
    }
}