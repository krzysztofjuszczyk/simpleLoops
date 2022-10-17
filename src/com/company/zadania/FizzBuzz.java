package com.company.zadania;

public class FizzBuzz {
    public static void main(String[] args) {
        int test = 15;
        System.out.println(fizzBuzz(test));
        fizzBuzz2();
    }

    //Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    //For numbers which are multiples of both three and five return 'FizzBuzz'.
    //For numbers that are neither, return the input number.
    public static String fizzBuzz(int i) {
        String result = "";
        if (i % 15 == 0) {
            return result = "fizzbuzz";
        } else if (i % 5 == 0) {
            return result = "buzz";
        } else if (i % 3 == 0) {
            return result = "fizz";
        }
        return String.valueOf(i);

    }

    // variation = multipliers of 3,5,15
    public static void fizzBuzz2() {

        for (int i = 1; i <= 100; i++) {
            System.out.print((i % 15 == 0) ? "fizzbuzz " :
                    ((i % 3 == 0) ? "fizz "
                            : ((i % 5 == 0) ? "buzz " : i + " ")));
        }
    }
}
