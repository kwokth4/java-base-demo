package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
    @Test
    public void test_sum(){
        BaseDemo sum1 = new BaseDemo();
        int expected = 5;
        assertEquals(expected, sum1.sum(2,3));
    }
    @Test
    public void test_sum2(){
        BaseDemo sum2 = new BaseDemo();
        int expected = -3;
        assertEquals(expected,sum2.sum(3, -6));
    }
}
