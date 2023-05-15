package poc.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(2, "2"),
                Arguments.of(1, "1")
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void testParametrized(final int input, final String expected) {
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
