import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

   /* @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz",FizzBuzz.run(9));
    }*/
   /* @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz",FizzBuzz.run(10));
    }*/
  /* @Test
   public void testDivisibleBy3et5() {
       assertEquals("FizzBuzz",FizzBuzz.run(15));
   }*/
   @Test
   public void testNegativeNumber() {
       assertEquals("Fizz", FizzBuzz.run(-4));
   }
}