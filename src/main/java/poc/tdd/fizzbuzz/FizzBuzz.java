package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String get(final int position) {

        if (position % 3 == 0 && position % 5 == 0) {
            return FIZZ + BUZZ;
        }

        if (position % 3 == 0) {
            return FIZZ;
        }

        if (position % 5 == 0) {
            return BUZZ;
        }

        return Integer.toString(position);
    }

}
