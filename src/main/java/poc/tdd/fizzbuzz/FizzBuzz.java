package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    public String get(final int position) {

        final boolean isFizz = hasRemainder(position, FIZZ_VALUE);
        final boolean isBuzz = hasRemainder(position, BUZZ_VALUE);

        if (isFizz && isBuzz) {
            return FIZZ + BUZZ;
        } else if (isFizz) {
            return FIZZ;
        } else if (isBuzz) {
            return BUZZ;
        }

        return Integer.toString(position);
    }

    private static boolean hasRemainder(final int position, final int fizzValue) {
        return position % fizzValue == 0;
    }

}
