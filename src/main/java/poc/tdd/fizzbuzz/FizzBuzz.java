package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    public String get(final int position) {

        final boolean isFizz = position % FIZZ_VALUE == 0;
        final boolean isBuzz = position % BUZZ_VALUE == 0;

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
