package dennisosimon.fizzbuzz;

import com.google.common.collect.ImmutableMap;

import java.io.PrintStream;
import java.util.Map;

public class FizzBuzz {

    private static final Map<Integer, String> fizzBuzzMap = ImmutableMap.of(
            3, "Fizz",
            5, "Buzz"
    );

    private final PrintStream printStream;
    private final StringBuilder stringBuilder = new StringBuilder();

    public FizzBuzz(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(int x) {
        verifyArgumentOrThrowException(x);
        appendFizzBuzz(x);
        printAndReset(x);
    }

    private void verifyArgumentOrThrowException(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("x has to be greater than 0, x=" + x);
        }
    }

    private boolean isDivisible(int x, int divider) {
        return x % divider == 0;
    }

    private void appendFizzBuzz(int x) {
        fizzBuzzMap.forEach((key, value) -> {
            if (isDivisible(x, key)) {
                stringBuilder.append(value);
            }
        });
    }

    private void printAndReset(int x) {
        if (stringBuilder.length() == 0) {
            printStream.println(x);
        } else {
            printStream.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}

