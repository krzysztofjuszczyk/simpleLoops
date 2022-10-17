package com.company.conditionalSt;

import java.util.Scanner;

public class Basic {
    Scanner scanner = new Scanner(System.in);

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void ex11() {

        //ex. 11

        System.out.println("input radius");
        double r = scanner.nextDouble();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }

    public void ex12() {
        //ex.12
        System.out.println("Input 3 int to calc average");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Average = " + (a + b + c) / 3);
    }

    public void ex13() {
        //ex.13
        System.out.println("input width = ");
        double a = scanner.nextDouble();
        System.out.println("input height = ");
        double b = scanner.nextDouble();
        double area = a * b;
        double perimeter = 2 * (a + b);
        System.out.printf("Area: %.2f * %.2f = %.1f \n", a, b, area);
        System.out.println("Perimeter = " + perimeter);

    }

//    public void ex17SumOfBinary() {
//        String bin1 = "";
//        String bin2 = "";
//        int temp, result;
//
//        byte rem;
//
//        System.out.print("Input binary: ");
//        bin1 = scanner.nextLine();
//        System.out.print("Input binary: ");
//        bin2 = scanner.nextLine();
//
//
////        int i=bin1.length();
////        int j=bin2.length();
////        int []sumOfBinary = new int[];
//
//        for (int i = bin1.length() - 1; i >= 0; i--) {
//            a = bin1.charAt(i);
//            System.out.println(a);
//        }
//
//
//    }


//    public void ex19ConvertToBinary() {
//
//        System.out.println("Input int: ");
//        int a=scanner.nextInt();
//        int dzielenie=a; int remainder;
//        while (dzielenie>0){
//            while(dzielenie/=2);
//
//
//        }
//    }

    public void ex152() {
        System.out.println("Input 4 integers to check if equal.");
        System.out.print("Input no.1: ");
        int a = scanner.nextInt();
        System.out.print("Input no.2: ");
        int b = scanner.nextInt();
        System.out.print("Input no.3: ");
        int c = scanner.nextInt();
        System.out.print("Input no.4: ");
        int d = scanner.nextInt();

        if (a == b && c == b && c == d) {
            System.out.println("Numbers are equal");
        } else System.out.println("Numbers are not equal");
    }

    public boolean ex153() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        return (a > 0 && a < 1 && b > 0 && b < 1);
    }

    public void ex154() {
        boolean[][] arrayIn = new boolean[][]{
                {false, false, true},
                {true, true, true}};
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[0].length; j++) {
                if (arrayIn[i][j]) {
                    System.out.print("t ");
                } else System.out.print("f ");
            }
            System.out.println();
        }
    }

    public int[][] ex155(int[][] tablica) {         // zamiana kolumn z wierszami

        // drukuje tablice przed przerobka
        System.out.println("Array IN:");
        printArray(tablica);

        int[][] tablicaPoPrzerobce = new int[tablica[0].length][tablica.length];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                tablicaPoPrzerobce[j][i] = tablica[i][j];
            }
        }
        System.out.println("Array OUT:");
        printArray(tablicaPoPrzerobce);

        return tablicaPoPrzerobce;
    }

    // ex 156
    // ex 157
    // ex 158

    //ex 159    Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order
    public int[] ex159(int[] arrayIn, int k) {
        int[] maxElementsArray = new int[k];                                       // pusta tablica o dł. k
        int[] tempArray = new int[arrayIn.length];                            //klonuję tablicę
        System.arraycopy(arrayIn, 0, tempArray, 0, arrayIn.length);  //j.w
        printArray(arrayIn);                                                    //moja metoda na drukowanie tab
        System.out.println();

        for (int x = 0; x < k; x++) {                     // znajdujemy k maksymalnych elementów
            int pozMax = 0;
            for (int i = 0; i < arrayIn.length; i++) {  //
                if (tempArray[i] > maxElementsArray[x]) {
                    maxElementsArray[x] = tempArray[i];
                    pozMax = i;
                }
            }
            tempArray[pozMax] = Integer.MIN_VALUE;                       //  podmieniamy element i w tablicy temp na 0 żeby nie wychodził za każdym razem
        }
        printArray(arrayIn);            // tablica wejściowa po podmianie maxów na 0
        System.out.println();
        printArray(maxElementsArray);        // tablica wynikowa
        return maxElementsArray;             // zwraca tablicę z k-maksami, (bez tabl. temp oryginalna ulega zmianie)

    }

    //ex 160  find k smallest in an array
    public int[] ex160(int[] arrayIn, int k) {
        System.out.println("ex 160");
        int[] minElementsArray = new int[k];
        for (int i=0; i<minElementsArray.length; i++){
            minElementsArray[i] = Integer.MAX_VALUE;
        }
        int[] tempArray = new int[arrayIn.length];

        System.arraycopy(arrayIn, 0, tempArray, 0, arrayIn.length);
        System.out.println("array in");
        printArray(arrayIn);
        System.out.println();
        System.out.println("temp array");
        printArray(tempArray);

        for (int x = 0; x < k; x++) {
            int pozycjaNaKtorejAktMin = 0;
            for (int i = 0; i < arrayIn.length; i++) {
                if (tempArray[i] < minElementsArray[x]) {
                    minElementsArray[x] = tempArray[i];
                    pozycjaNaKtorejAktMin = i;
                }
            }
            tempArray[pozycjaNaKtorejAktMin] = Integer.MAX_VALUE;

        }
        System.out.println();
        System.out.println("Min elements array");
        printArray(minElementsArray);
        return minElementsArray;

    }

}

    //KONIEC MAINA


