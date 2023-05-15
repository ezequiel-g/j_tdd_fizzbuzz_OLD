package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";

    public String get(final int position) {
        if (position % 3 == 0) {
            return FIZZ;
        }

        if (position % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(position);
    }

}
