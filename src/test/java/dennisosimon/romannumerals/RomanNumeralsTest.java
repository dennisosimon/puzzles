package dennisosimon.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "I", 1 }, {"V", 5}, {"X", 10}, {"L", 50}, {"C", 100}, {"D", 500}, {"M", 1000},
                { "II", 2}, {"III", 3}, {"VI", 6}, {"XVI", 16},
                { "IV", 4 }, {"XL", 40}, { "XC", 90}, {"CD", 400}, { "CM", 900 },
                {"DCCLXXXIV", 784},  {"MDCCCCLXXXIIII", 1984}
        });
    }

    private final String input;
    private final int expected;
    private final RomanNumerals romanNumerals = new RomanNumerals();

    public RomanNumeralsTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertThat(romanNumerals.toInteger(input)).isEqualTo(expected);
    }
}