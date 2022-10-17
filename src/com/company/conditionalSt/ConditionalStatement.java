package com.company.conditionalSt;

import java.util.Scanner;

public class ConditionalStatement {
    Scanner scanner = new Scanner(System.in);

    public boolean isPositive(int a){
        return a>0 ? true : false;
    }

    public void quadraticEq (double a, double b , double c){        // 02
        double podPierwiastkiem = b*b - 4*a*c;
        double wynik1 = 0, wynik2 = 0;

        if (podPierwiastkiem >0){
            wynik1 = (-b + (Math.pow(podPierwiastkiem,0.5)))/2*a;
            wynik2 = (-b - (Math.pow(podPierwiastkiem,0.5)))/2*a;
            System.out.println("The roots are: " + wynik1 + " and " + wynik2    );

        }
                else if (podPierwiastkiem ==0){
                    wynik1 = -b/2*a;
            System.out.println("The root is: " + wynik1);

        }
                else System.out.println("No real roots");

    }

    public int cse03GreatestNumber (int a, int b, int c) {
        int greatestNum = a;
        if (b > a) {
            greatestNum = b;
            if (c > b) {
                greatestNum = c;
            }
        }

            else if (c > a) {
                greatestNum = c;
            }
            return greatestNum;
        }

    //Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
    // or "large" if it exceeds 1,000,000.
    public void cse04 (float a){
        if (a == 0) {
            System.out.println("zero");
        }
        else if (a>0){
            if(a>1000000){
                System.out.print ("large ");}
                else if (a<1){
                System.out.print("small ");
            }
            System.out.println("positive");
        }
        else {
            if (a>-1){
                System.out.print("small ");
            }
            else if (a<-1000000){
                System.out.print("large ");
            }
            System.out.println("negative");
        }
    }

//5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
    public void cse05 (){
        int a=0;
        do {
        System.out.println("Input a number 1-7: ");
        a = scanner.nextInt();
        }
        while (a<1 || a>7);
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("ok");
        }
    }

    //6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
    public boolean cse06Same (float a, float b){
        boolean areTheySame = false;
        String convertedA = Float.toString(a);
        String convertedB = Float.toString(b);
        System.out.println(convertedA);
        System.out.println(convertedB);

        for (int i = 0; i<=4; i++){
            if (convertedA.charAt(i)!=convertedB.charAt(i)){
                areTheySame=false;
                break;
            }
            else areTheySame=true;
        }
        System.out.println("Are they same? " + areTheySame);
        return areTheySame;
    }




}


