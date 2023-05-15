package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void test1() {
        final int input = 1;
        assertEquals(1, fizzBuzz.get(input));
    }

    @Test
    void test2() {
        final int input = 2;
        assertEquals(2, fizzBuzz.get(input));
    }

}
