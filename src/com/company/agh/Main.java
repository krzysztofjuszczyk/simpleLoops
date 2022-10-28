package com.company.agh;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //laborki 1
//        easyEx(); // run easy ones
        additionalEx(); // run harder


    }

    public static void easyEx() {

        int iterator = 0;
        System.out.println(iterator++);
        System.out.println(iterator);
        iterator = 0;
        System.out.println(++iterator);
        System.out.println(iterator);
        System.out.println("Wynik zadania:");
        int iteratorExercise = 0;
        System.out.println(iteratorExercise++);
        System.out.println(--iteratorExercise);
        System.out.println(iteratorExercise);

        System.out.println("Zad. 7");
        System.out.println("Podaj inta: ");
        int number = getInt();
        if (isEven(number)) {
            System.out.println("jest parzysta");
        } else System.out.println("nieparzysta");

        System.out.println("zad.8");
        int one = getInt();
        int two = getInt();
        if (one > 0 && two > 0) {
            System.out.println("Większa: " + getBigger(one, two));
        } else if (one < 0 && two < 0) {
            System.out.println("Mniejsza: " + getSmaller(one, two));
        } else System.out.println("Nic nie wypisuję!");
    }

    public static void additionalEx() {
        // dodatkowe
        // F to C conv
        // ex 1
        double tempF = 96;
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempC);

        // ex.4
        System.out.println("Ex. 4 / int: ");
        int a = getInt();
        int sum = 0;
        for (int i = 0; i <= a; i += 2) {
            sum += i;
        }

        // ex.5
        System.out.println("Sum of even: " + sum);
        System.out.println("Silnia: " + silnia(a));

        //ex.6
        System.out.println("Ex 06: ");
        System.out.println("result: " + ex6(100, 30));

        //ex. 7
        System.out.println("Ex 07");
        System.out.print("int1: ");
        int int1 = getInt();
        System.out.print("int2: ");
        int int2 = getInt();
        int result = 0;
        if (int1 > 0 && int2 > 0) {
            result = int1 + int2;
        }
        System.out.println("Ex. 07 result: " + result);

        //ex/8
        int result2 = 1;
        if (int1 != 0 && int2 != 0) {
            result2 = Math.abs(int1 * int2);
        }
        System.out.println("Ex.9 result: " + result2);

        // Ex 9
        int[] values = {19, 4, 5};
        //check if any is below 0
        int option = 0;
        for (int value : values) {
            if (isNegative(value)) {
                option = 1;
                break;
            }
        }
        int sumTable = 0;

        if (option == 1) {
            for (int value :
                    values) {
                System.out.print(value + " + ");
                sumTable += value;
            }
        } else {
            int length = values.length;
            for (int value :
                    values) {
                System.out.print(value + " - " + length + " + ");
                sumTable += value - length;
            }

        }
        System.out.print("=" + sumTable);
        System.out.println();

        //Ex 10
        int[] array10 = {2, 3,0, 1, 4};
        System.out.println("Result 10: " + ex10(array10));

        // Ex11
        int[] array11a = {2, 3,0, 1, 4};
        int[] array11b = {12,5,63,2, 3,0, 1, 4};
        System.out.println("Result 11: " + Arrays.toString(ex11(array11a, array11b)));
        System.out.println("Result 11b: " + Arrays.toString(ex11b(array11a, array11b)));

        //Ex 12


    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getBigger(int a, int b) {
        int bigger = (a > b) ? a : b;
        return bigger;
    }

    public static int getSmaller(int a, int b) {
        int smaller = (a < b) ? a : b;
        return smaller;
    }

    public static int silnia(int a) {
        if (a >= 0) {
            int silnia = 1;
            for (int i = 1; i <= a; i++) {
                silnia *= i;
            }
            return silnia;
        } else return -1;
    }

    // ex.6
    public static int ex6(int value, int decrementValue) {
        int result = 0;
        while (value > 0) {
            value -= decrementValue;
            result++;
        }
        return result;
    }

    //ex.10
    public static boolean ex10(int[] array) {
        if (array.length % 2 != 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length / 2; i++) {
            left += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            right += array[i];
        }
        if (left == right) {
            return true;
        } else return false;
    }

    public static int[] ex11 (int[] array1, int[] array2){
        // rozwiązanie podstawowe, na piechotę, brzydko
        int lengthResult = array1.length;
        int longer = 1;
        if (array2.length> array1.length) {
            lengthResult = array2.length;
            longer = 2;
        }
        int[] result = new int[lengthResult];
            if (longer == 1) {
                for (int i = 0; i < array2.length; i++) {
                    result[i] = array1[i] + array2[i];
                }
                for (int i = array2.length; i < lengthResult ; i++) {
                    result[i] = array1[i];
                }
            }
            else {
                for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }
                for (int i = array1.length; i < lengthResult ; i++) {
                    result[i] = array2[i];
                }

            }
        return result;
    }

    // wersja na operatorze trójargumentowym
    public static int[] ex11b (int[] array1, int[] array2){
        int[] result = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < result.length; i++) {
            if (i>=array1.length || i>= array2.length){
                result[i] = array1.length> array2.length ? array1[i]  : array2[i];
            continue;}
                result[i] = array1[i]+array2[i];
        }

        return result;
    }
}
