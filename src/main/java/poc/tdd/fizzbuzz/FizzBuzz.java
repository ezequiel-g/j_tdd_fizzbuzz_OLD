package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String get(final int position) {

        final boolean isFizz = position % 3 == 0;
        final boolean isBuzz = position % 5 == 0;

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
