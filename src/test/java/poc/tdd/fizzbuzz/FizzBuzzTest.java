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
                Arguments.of(3, FizzBuzz.FIZZ),
                Arguments.of(2, "2"),
                Arguments.of(1, "1")
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void testParametrized(final int input, final String expected) {
        assertEquals(expected, fizzBuzz.get(input));
    }

}
