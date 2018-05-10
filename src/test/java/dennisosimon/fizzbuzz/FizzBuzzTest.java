package dennisosimon.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final FizzBuzz fizzBuzz = new FizzBuzz(new PrintStream(outputStream));

    @Test
    public void onePrintsOne() {
        fizzBuzz.print(1);
        assertEquals(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroThrowsException() {
        fizzBuzz.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeThrowsException() {
        fizzBuzz.print(-1);
    }

    @Test
    public void threePrintsFizz() {
        fizzBuzz.print(3);
        assertEquals("Fizz");
    }

    @Test
    public void sixPrintsFizz() {
        fizzBuzz.print(6);
        assertEquals("Fizz");
    }

    @Test
    public void fivePrintsBuzz() {
        fizzBuzz.print(5);
        assertEquals("Buzz");
    }

    @Test
    public void tenPrintsBuzz() {
        fizzBuzz.print(10);
        assertEquals("Buzz");
    }

    @Test
    public void fifteenPrintsFizzBuzz() {
        fizzBuzz.print(15);
        assertEquals("FizzBuzz");
    }

    @Test
    public void thirtyPrintsFizzBuzz() {
        fizzBuzz.print(30);
        assertEquals("FizzBuzz");
    }

    private void assertEquals(Object actual) {
        String s = String.format("%s%n", actual);
        Assertions.assertThat(outputStream.toString()).isEqualTo(s);
    }
}