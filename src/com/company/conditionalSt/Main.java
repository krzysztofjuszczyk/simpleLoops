package com.company.conditionalSt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Excercise number: ");
//        int ex= scanner.nextInt();
        Basic zadanie = new Basic();
        ConditionalStatement cse = new ConditionalStatement();

//        System.out.println("Input an int to check if positive: ");
//        int a = scanner.nextInt();
//        boolean check = cse.isPositive(a);
//        if (check==true){
//            System.out.println("nr is positive");}
//
//        else System.out.println("nr is NEG");

//          //ex 03
//        cse.quadraticEq(1,5,2);


        //ex 03
//        System.out.println(cse.cse03GreatestNumber(13,1222,167));
//
//        //ex 04
//        System.out.println("input a float number: ");
//        float inputFloat = scanner.nextFloat();
//        cse.cse04(inputFloat);
//
//        //ex05
//        cse.cse05();

        //ex06
//        cse.cse06Same(1.234f, 1.2345f);

//        System.out.println(zadanie.ex153());

        zadanie.ex154();

        int[][] tablicaIN = {{10,20,30,40},{40,50,60,70}};
        zadanie.ex155(tablicaIN);


//                int[] array = {1, 4, 17, 7, 25, 3, 100};
//                System.out.println("Original Array:\n[1, 4, 17, 7, 25, 3, 100]");
//                System.out.println("3 largest elements of the said array are:");
//                int maxi = array[0];
//                int k = 0;
//                for (int j = 0; j < 3; j++) {
//                    for (int i = 0; i < array.length; i++) {
//                        if (array[i] > maxi){
//                            maxi = array[i];
//                            k = i;
//                        }
//                    }
//                    System.out.print(maxi+" ");
//                    array[k] = 0;
//                    maxi = Integer.MIN_VALUE;
/*        }
        int[] inputArray= new int[]{1, 4, 12, 15, 159, 99, 12};
        zadanie.ex159(inputArray,4);
        System.out.println();
        System.out.println(Arrays.toString(inputArray));
*/
        int[] inputArray= new int[]{1, 4, 12, 15, 159, 99, 12, -5 , -100, 0};
        System.out.println("EX 160 - k min elements");
        System.out.println(Arrays.toString(inputArray));
        zadanie.ex160(inputArray,4);


    }
}
