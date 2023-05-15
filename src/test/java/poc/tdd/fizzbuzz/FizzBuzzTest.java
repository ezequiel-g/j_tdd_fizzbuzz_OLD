package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void test1() {
        assertEquals(1, new FizzBuzz().get(1));
    }

}
