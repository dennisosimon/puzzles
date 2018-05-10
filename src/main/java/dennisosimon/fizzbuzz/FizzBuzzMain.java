package dennisosimon.fizzbuzz;

import java.util.Scanner;

class FizzBuzzMain {

    @SuppressWarnings("squid:S106")
    public static void main(String[] args) {
        System.out.println("Please enter amount of numbers for FizzBuzz : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz(System.out);
        for (int i = 1; i <= n; i++) {
            fizzBuzz.print(i);
        }
    }
}