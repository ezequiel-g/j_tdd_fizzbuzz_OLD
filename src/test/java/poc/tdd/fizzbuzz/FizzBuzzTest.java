package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void test1() {
        final int input = 1;
        final String expected = "1";
        assertEquals(expected, fizzBuzz.get(input));
    }

    @Test
    void test2() {
        final int input = 2;
        final String expected = "2";
        assertEquals(expected, fizzBuzz.get(input));
    }

}
