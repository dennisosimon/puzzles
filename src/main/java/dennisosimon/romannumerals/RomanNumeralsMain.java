package dennisosimon.romannumerals;

import java.util.Scanner;

public class RomanNumeralsMain {
    @SuppressWarnings("squid:S106")
    public static void main(String[] args) {
        System.out.println("Please enter Roman Numeral : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.toInteger(s);

        System.out.println("Result=" + result);
    }
}
