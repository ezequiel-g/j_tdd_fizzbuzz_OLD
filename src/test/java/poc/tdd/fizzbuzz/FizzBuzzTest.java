package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    private void testParametrized(final int input, final String expected) {
        assertEquals(expected, fizzBuzz.get(input));
    }

    @Test
    void test1() {
        final int input = 1;
        final String expected = "1";
        testParametrized(input, expected);
    }

    @Test
    void test2() {
        final int input = 2;
        final String expected = "2";
        testParametrized(input, expected);
    }

}
