package com.company;

import com.company.zadania.Zadania;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a question (int 1 - 20): ");
        int wyborZadania = scanner.nextInt();
        Zadania zadania = new Zadania();

        switch (wyborZadania){
            case 1:
                zadania.zadanie1();
                break;

            case 2:
                zadania.zadanie2();
                break;

            case 3:
                zadania.zadanie3();
                break;

            case 4:
                zadania.zadanie4silnia();
                break;

            case 5:
                zadania.zadanie5();
                break;

            case 6:
                zadania.zadanie6();
                break;

            case 7:
                zadania.zadanie7();
                break;

            case 8:
                zadania.zadanie8();
                break;

            case 9:
                zadania.zadanie9();
                break;

            case 10:
                zadania.zadanie10();
                break;

            case 11:
                zadania.zadanie11();
                break;

            case 12:
                zadania.zadanie12();
                break;

            case 13:
                zadania.zadanie13();
                break;

            case 14:
                zadania.zadanie14();
                break;

            case 15:
                zadania.zadanie15();
                break;

            case 16:
                zadania.zadanie16();
                break;

            case 17:
                zadania.zadanie17();
                break;

            case 18:
                zadania.zadanie18();
                break;

            case 19:
                zadania.zadanie19();
                break;

            case 20:

            case 21:    //random number generator
                zadania.zadanie21random(30, 2, 10);
                break;

        }
    }
}
