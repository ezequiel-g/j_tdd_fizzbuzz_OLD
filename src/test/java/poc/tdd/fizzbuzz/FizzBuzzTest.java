package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void test1() {
        assertEquals(1, fizzBuzz.get(1));
    }

    @Test
    void test2() {
        assertEquals(2, fizzBuzz.get(2));
    }

}
