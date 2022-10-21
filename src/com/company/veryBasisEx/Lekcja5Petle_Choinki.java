package com.company.veryBasisEx;

import java.util.Scanner;

public class Lekcja5Petle_Choinki {
    public static void main(String[] args) {
        // choinka MOJA
        System.out.println("How many stars at the bottom?");
        int starsAtTheBottom = getInt();

        int iterations;
        if (starsAtTheBottom %2 == 0) iterations = starsAtTheBottom/2;
        else iterations = starsAtTheBottom/2 +1;

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < iterations -1 - i; j++) {  //spacje z lewej
                System.out.print(" ");
            }
            if (starsAtTheBottom %2 == 0){                  // parzysta ilość gw.
                for (int j = 0; j < 2 * i + 2; j++) {
                    System.out.print("*");
                }
            }
            else {                                          // nieparzysta
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }
            for (int j = 0; j < iterations -1 - i; j++) {
            }
            System.out.println();
        }


        // WARIANT II z rozwiązań
        System.out.print("Podaj liczbe gwiazdek w podstawie: ");
        int liczbaGwiazdekWPodstawie = getInt();

        int liczbaGwiazdekNaSzczycie = liczbaGwiazdekWPodstawie % 2 == 0 ? 2 : 1;
// petla rozpoczyna dzialania od wypisania tylu gwiazdek, ile jest na szczycie
        // petla dziala dopoki, liczba gwiazdek do wypisania w rzedzie  nie przekroczy liczby gwiazdek w podstawie
        // na koncu kazdego obiegu, zwiekszamy liczbe gwiazdek o 2,  bo w kazdym kolejnym rzedzie sa o 2 gwiazdki wiecej,  niz w poprzednim

        for (int gwiazdkiWRzedzie = liczbaGwiazdekNaSzczycie;               // spacje
             gwiazdkiWRzedzie <= liczbaGwiazdekWPodstawie;
             gwiazdkiWRzedzie += 2) {
            int liczbaSpacji = (liczbaGwiazdekWPodstawie - gwiazdkiWRzedzie) / 2;
            for (int i = 0; i < liczbaSpacji + gwiazdkiWRzedzie; i++) {
                System.out.print(i < liczbaSpacji ? " " : "*");
            }
            System.out.println();
            }
        }


    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
