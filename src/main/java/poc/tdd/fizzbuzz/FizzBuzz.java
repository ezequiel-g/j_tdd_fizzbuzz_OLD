package poc.tdd.fizzbuzz;

public class FizzBuzz {
    public String get(final int position) {
        if (position % 3 == 0) {
            return "fizz";
        }

        return Integer.toString(position);
    }

}
