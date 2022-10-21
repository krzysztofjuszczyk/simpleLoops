package com.company.veryBasisEx;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        boolean czyGramy = true;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wyraz: ");
            String slowo = scanner.nextLine();
            System.out.println("Sprawdzamy słowo: " + slowo);


            System.out.println("ile liter: " + slowo.length() + ", ile iteracji: " + slowo.length() / 2);

//            if (isPalindrome(slowo)) System.out.println("słowo " + slowo + " JEST palindromem");
//            else System.out.println("słowo " + slowo + " nie jest palindromem");
//
//            System.out.println("Czy gramy dalej? litera T oznacza tak ");

//        }
//    }
//    static boolean isPalindrome(String slowo) {
//        for (int i = 0; i < slowo.length() / 2; i++)
//            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i))
//                return false;
//        return true;

            // PIERWOTNA WERSJA
            boolean czyJestP=false;
            for (int i = 0; i < slowo.length() / 2; i++) {

                if (slowo.charAt(i) == slowo.charAt(slowo.length() - 1 - i)) {
                    System.out.println("Litera na poz. " + (i+1) + " oraz " + (slowo.length()-i) + " ok");
                    czyJestP = true;
                } else {
                    System.out.println("Litera na poz. " + (i+1) + " oraz " + (slowo.length()-i) + " nie jest taka sama");
                    czyJestP=false;
                    break;
                }
            }

                if (czyJestP) System.out.println("słowo " + slowo + " JEST palindromem");
                else System.out.println("słowo " + slowo + " NIE jest palindromem");


                System.out.println("Czy gramy dalej? litera T oznacza tak ");
                String gramy = scanner.next();
                Character gram = gramy.trim().charAt(0);
                if (gram == 't') czyGramy = true;
                else czyGramy = false;

                if (!czyGramy) break;

            }
        System.out.println("Bye bye");
        }

    }
