package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    public String get(final int position) {

        int fizzValue = FIZZ_VALUE;
        final boolean isFizz = position % fizzValue == 0;
        fizzValue = BUZZ_VALUE;
        final boolean isBuzz = position % fizzValue == 0;

        if (isFizz && isBuzz) {
            return FIZZ + BUZZ;
        } else if (isFizz) {
            return FIZZ;
        } else if (isBuzz) {
            return BUZZ;
        }

        return Integer.toString(position);
    }

}
