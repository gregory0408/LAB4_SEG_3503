import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

   /* @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz",FizzBuzz.run(9));
    }*/
    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz",FizzBuzz.run(11));
    }
}