package com.company.veryBasisEx;

import java.util.Locale;

public class Lekcja13i14String {
    public static void main(String[] args) {
       /*
        String string = "  maslo  i chleb  ";
        System.out.println(string.length());         // wywolanie metody length
        System.out.println(args.length);            // tablica args => odwolanie się do zmiennej length , bez ()!!
        System.out.println(string.isEmpty());

        char literaZMiejscaI = string.charAt(3);
        System.out.println(string.substring(1,3));   // start index inclusive, end index exclusive
        String obciety = string.trim();
        System.out.println(obciety);


         .startsWith
         .endsWith
         .contains      czy zawiera
         .trim
         .replace

         .equals  (w obiektach nie używamy operatorów!)
         */

        String imie = "jan";
        String nazwisko = "Juszczyk";
        String imiePlusNazwisko = imie + " " + nazwisko;

        System.out.println(imie.length());
        System.out.println(nazwisko.length());
        System.out.println(imiePlusNazwisko.length()   );
        //b
        System.out.println(imie.toLowerCase().equals("alicja") || imie.toLowerCase().equals("jan") );
        //c
        System.out.println(nazwisko.toUpperCase(Locale.ROOT));
        //d
        String zmienione = nazwisko.replace('a','e');
        System.out.println(zmienione);

        //ZADANIE 2
        String zdanie = "Potrafię coraz więcej z programowania";

        for (int i=0; i<zdanie.length();i++){
            System.out.println(zdanie.charAt(i));
        }
        System.out.println();
        for (int i=zdanie.length() -1; i>=0;i--){
            System.out.println(zdanie.charAt(i));
        }

    }
}
