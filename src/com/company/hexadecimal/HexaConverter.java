package com.company.hexadecimal;

import java.util.Scanner;

public class HexaConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to convert it to HEX");
        int input = scanner.nextInt();
        int pow = 0;
        double b = 0.0;

        // na piechote sprawdzam ile znaków ma mieć tablica charow z wynikiem
        do {
            pow = (int) b;
            b++;
        } while (Math.pow(16, b) < input);

        int maxSize = pow + 1;

        char[] wynikHex = new char[maxSize];

        for (int i = 0; i < maxSize; i++) {
            if (input > 0) {
                wynikHex[wynikHex.length - 1 - i] = resztaZDzieleniaHex(input);     // przypisujemy od ost. znaku wyniku
                input /= 16;
            } else {
                break;
            }
        }


        for (int i = 0; i < wynikHex.length; i++) {              //drukujemy tablicę
            System.out.print(wynikHex[i] + " ");
        }

    }

    public static char resztaZDzieleniaHex(int a) {
        return jakiZnak(a % 16);

    }


    public static char jakiZnak(int a) {
        char wynik = ' ';
        switch (a) {
            case 0:
                wynik = '0';
                break;
            case 1:
                wynik = '1';
                break;
            case 2:
                wynik = '2';
                break;
            case 3:
                wynik = '3';
                break;
            case 4:
                wynik = '4';
                break;
            case 5:
                wynik = '5';
                break;
            case 6:
                wynik = '6';
                break;
            case 7:
                wynik = '7';
                break;
            case 8:
                wynik = '8';
                break;
            case 9:
                wynik = '9';
                break;
            case 10:
                wynik = 'A';
                break;
            case 11:
                wynik = 'B';
                break;
            case 12:
                wynik = 'C';
                break;
            case 13:
                wynik = 'D';
                break;
            case 14:
                wynik = 'E';
                break;
            case 15:
                wynik = 'F';
                break;
            default:
                wynik = 'X';            // jako błąd
                break;
        }
        return wynik;
    }
}
