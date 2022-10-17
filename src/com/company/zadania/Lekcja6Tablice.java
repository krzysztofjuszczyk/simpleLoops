package com.company.zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Lekcja6Tablice {
    public static void main(String[] args){

        //metodaWiekPacjenta();

        //sortowanie przez wstawianie

        metodaSortowaniePrzezWstawianie ();


    }

    private static void metodaSortowaniePrzezWstawianie() {
        System.out.println("ile liczb chcesz wprowadzić? ");
//        int howMany = getInt();
//        int[] numbers = new int[howMany];
                    int [] numbers = {5,4,2,4,1,8,3,9,99,0,45,23,77,33,132,14};

//        for (int i = 0; i < howMany - 1; i++) {
//            System.out.println("Podaj liczbę nr " + (i+1));
//            numbers[i] = getInt();
//        }
//        for (int i = 1; i <numbers.length ; i++) {
//            int current = numbers[i];
//            if (current >= numbers[i-1]){continue;};
//
//            for (int j = 0; j<i; j++){
//                if (numbers[i-j]> numbers[i-1-j]) break;
//                int temp = numbers[i-1-j];
//                numbers[i-1-j] = current;
//                numbers[i -j] = temp;
//            }
//        }
        // rozwiązanie 2 bez zmiennej current
        int count = 1;
        for (int i = 1; i <numbers.length ; i++) {

            if (numbers[i] >= numbers[i-1]){continue;}

            for (int j = 0; j<i; j++){
                if (numbers[i-j]> numbers[i-1-j]) break;
                int temp = numbers[i-1-j];
                numbers[i-1-j] = numbers[i -j];
                numbers[i -j] = temp;

                for (int n: numbers
                ) {
                    System.out.print(n + " ");
                }
                System.out.println(" count: " + count++);
            }
        }


        System.out.println("");
        System.out.println("rozw. z kursu");

        // rozwiązanie 3 z kursu
        numbers = new int[]{5, 4, 2, 4, 1, 8, 3, 9, 99, 0, 45, 23, 77, 33, 132, 14};
        count= 1;
        for (int i = 1; i < numbers.length; i++) {
            int aktualnaLiczba = numbers[i];
            int j = i -1 ;
            while (j >= 0 && numbers[j] > aktualnaLiczba) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = aktualnaLiczba;

            for (int n: numbers
            ) {
                System.out.print(n + " ");
            }
            System.out.println(" count: " + count++);
        }


        System.out.println("posortowana tablica to:");
        for (int n: numbers
             ) {
            System.out.print(n + " ");
        }
    }

    public static void metodaWiekPacjenta() {
        int[] wiekPacjenta;
        wiekPacjenta = new int[]{8, 10, 12, 14, 16};

        int[] wagaPacjenta = {50, 60, 80, 90, 60};
        System.out.println(wagaPacjenta.length);

        System.out.println(wiekPacjenta);

        wiekPacjenta[0] = 8;
        wiekPacjenta[1] = 10;
        wiekPacjenta[2] = 15;
        wiekPacjenta[3] = 20;

        System.out.println(wiekPacjenta[4]);

        double[] tablicaD = new double[10];
        tablicaD[0] = 1.1;
        tablicaD[1] = 2.2;
        System.out.println(tablicaD[0]);
        System.out.println(tablicaD[1]);
        System.out.println(tablicaD[2]);

        int[][] tab2w = new int[5][5];

        int[] tablica1w = new int[5];
        tablica1w[0] = 5;
        tablica1w[1] = 7;
        tablica1w[2] = 2;
        tablica1w[3] = 1;
        tablica1w[4] = 9;

        int sumaT1w;
        sumaT1w = tablica1w[0] + tablica1w[1] + tablica1w[2] + tablica1w[3] + tablica1w[4];
        System.out.print(tablica1w[0] + " + ");
        System.out.print(tablica1w[1] + " + ");
        System.out.print(tablica1w[2] + " + ");
        System.out.print(tablica1w[3] + " + ");
        System.out.print(tablica1w[4] + " = ");
        System.out.print(sumaT1w);
        System.out.println();

        int[] tablica1w2 = {3, 5, 1, 9, 8};

        int sumaT1w2;
        sumaT1w2 = tablica1w2[0] + tablica1w2[1] + tablica1w2[2] + tablica1w2[3] + tablica1w2[4];
        System.out.print(tablica1w2[0] + " + ");
        System.out.print(tablica1w2[1] + " + ");
        System.out.print(tablica1w2[2] + " + ");
        System.out.print(tablica1w2[3] + " + ");
        System.out.print(tablica1w2[4] + " = ");
        System.out.print(sumaT1w2);

        double[][] Tab2wD = {
                {3.1, 5.2, 1.56, 6.012, 1.1},
                {1.8, 6.7, 5.7, 1.8, 4.4},
                {3.99, 2.1, 2.9, 7.7, 5.11},
        };
        System.out.println();
        System.out.println(Arrays.deepToString(Tab2wD));

        System.out.print("suma 1w = ");
        double suma1w = Tab2wD[0][0] + Tab2wD[0][1] + Tab2wD[0][2] + Tab2wD[0][3] + Tab2wD[0][4];
        System.out.print(suma1w);
        System.out.println();

        System.out.print("suma 2w = " + Tab2wD[1][0] + "+" + Tab2wD[1][1] + "+" + Tab2wD[1][2] + "+" + Tab2wD[1][3] + "+" + Tab2wD[1][4] + "=");
        double suma2w = Tab2wD[1][0] + Tab2wD[1][1] + Tab2wD[1][2] + Tab2wD[1][3] + Tab2wD[1][4];
        System.out.println(suma2w);

        System.out.print("suma 3w = " + Tab2wD[2][0] + "+" + Tab2wD[2][1] + "+" + Tab2wD[2][2] + "+" + Tab2wD[2][3] + Tab2wD[2][4] + "=");
        double suma3w = Tab2wD[2][0] + Tab2wD[2][1] + Tab2wD[2][2] + Tab2wD[2][3] + Tab2wD[2][4];
        System.out.println(suma3w);
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

}
