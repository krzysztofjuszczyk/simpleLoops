package com.company.agh;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main   {
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

    public static void additionalEx (){
        // dodatkowe
        // F to C conv
        // ex 1
        double tempF = 96;
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempC);

        //
        System.out.println("Ex. 4 / int: ");
        int a = getInt();
        int sum = 0;
        for (int i = 0; i <= a; i += 2) {
            sum += i;
        }


        System.out.println("Sum of even: " + sum);
        System.out.println("Silnia: " + silnia(a));

        // Ex 9
        int [] values = {19,4,5};
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
               sumTable+=value;
           }
       }
       else {
           int length = values.length;
           for (int value:
                values) {
               System.out.print(value + " - " + length + " + ");
               sumTable += value -length;
           }

       }
        System.out.print("=" + sumTable);

       //Ex 10

        // Ex11



    }
    public static boolean isNegative(int a){
        return a<0;
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isEven (int number){
        return number%2==0;
    }
    public static int getBigger(int a, int b){
        int bigger = (a > b)? a : b;
        return bigger;
    }

    public static int getSmaller(int a, int b){
        int smaller = (a < b)? a : b;
        return smaller;
    }

    public static int silnia (int a){
        if (a >=0) {
            int silnia = 1;
            for (int i = 1; i <= a; i++) {
                silnia *= i;
            }
            return silnia;
        }
        else return -1;
    }

}
