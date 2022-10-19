package com.company.hexadecimal;

import java.util.Scanner;

public class AnySystemConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Integer to convert it to any system (from BIN to HEX");
        int input = scanner.nextInt();

        System.out.println("Convert to x-system. from 2 to 16");
        int system = scanner.nextInt();

        int pow=0;              // do której potęgi
        double b=0.0;

        // na piechote sprawdzam ile znaków ma mieć tablica charow z wynikiem
        do {    pow = (int)b;
            b++;
        }        while (Math.pow(system,b)<input);          // każdy system od binarnego od 16-kowego
        int maxSize = pow +1;
        char[] wynik = new char[maxSize];

        // zaczynamy dzielić przez liczbę określoną w system
        for (int i = 0; i < maxSize; i++) {
            if (input>0) {                  // kończymy budowanie tablicy gdy wynk dzielenia to zero
                wynik[wynik.length - 1 - i] = jakiZnak(input%system);     // przypisujemy od ost. znaku wyniku
                input /= system;            // dzielimy przez odpowiednią liczbę w zależności od systemu
            }
            else { break;}
        }


        for (int i=0; i<wynik.length; i++){
            System.out.print(wynik[i]+ " ");
        }

    }

    public static char resztaZDzieleniaHex (int a, int system){
        return jakiZnak(a%system);
    }


    public static char jakiZnak(int a){                 // dałem 16 przypadków
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
