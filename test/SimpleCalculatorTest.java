import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private int x = 10;
    private int y = 10;

    SimpleCalculator sc = new SimpleCalculator();

    @Test
    void add() {
        assertEquals(20, sc.add(x,y));
    }

    @Test
    void sub() {
        assertEquals(0, sc.sub(x,y));
    }

    @Test
    void div() {
        assertEquals(1, sc.div(x,y));
    }

    @Test
    void mul() {
        assertEquals(100, sc.mul(x,y));
    }

    @Test
    void clear() {

    }

    @Test
    void version() {
    }

    @Test
    void on() {
    }

    @Test
    void off() {
    }
}