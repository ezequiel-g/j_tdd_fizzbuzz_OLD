package poc.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";

    public String get(final int position) {
        if (position % 3 == 0) {
            return FIZZ;
        }

        return Integer.toString(position);
    }

}
