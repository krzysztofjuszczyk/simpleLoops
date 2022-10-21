package com.company.mosh;

import java.util.Scanner;

public class Mosh2polowa {
    public static void main(String[] args) {
        int income = 120_000;
        boolean highIncome = true;
        boolean highIncome2 = (income >100_000);

        boolean goodCredit  = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = (highIncome || goodCredit) & !hasCriminalRecord;
        if (isEligible)
            System.out.println("is eligible");
        else System.out.println("not eligible");

        boolean isEligibleShort = ((highIncome || goodCredit) & !hasCriminalRecord);
        System.out.println("isEligibleShort = " + isEligibleShort);

       /* String jakaKlasaPodrozy;
        if (income>100000)
            jakaKlasaPodrozy = "Pierwsza klasa";
        else
            jakaKlasaPodrozy = "Druga klasa"; */
        System.out.println("Income " + income);
        String jakaKlasaPodrozy = income>100_000 ?"Pierwsza" :"Druga";
        System.out.println(jakaKlasaPodrozy);



        /* /5 Fizz   /3 buxx  /53 fizbuz   not = number
                 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbe: ");
        int liczba = scanner.nextInt();


       boolean przez5 = liczba%5==0;
       boolean przez3 = liczba%3==0;

       /*
       if (przez5) {
           if (przez3) {
               System.out.println("FizzBuzz");}
           else System.out.println("Fizz");
       }
       else if (przez3) {
           System.out.println("buzz");}
       else System.out.println(liczba);*/

       if (liczba%5==0 && liczba%3==0) System.out.println("Przez 5 i 3");
       else if (liczba%5==0) System.out.println("Przez 5");
       else if (liczba%3==0) System.out.println("Przez3");
       else System.out.println(liczba);

        // FOR = gdy wiemy ile iteracji
        // WHILE gdy nie wiemy ile razy coś się pojawi

        System.out.println("Wpisz coś, będziesz wpisywał dopóki nie wpiszesz quit lub pass");
//        Scanner scanner = new Scanner(System.in);     /zadeklarowana na początku

        String input2 ="";

        // STRING to typ reference -> nie można porównywać wartości, bo przechowują ADRES!!!
//          / WARIANT 1
//        while (!input2.equals("quit")) {
//            System.out.print("Input: ");
//            input2 = scanner.next().toLowerCase();
//            if (input2.equals("pass"))
//                continue;
//            if (input2.equals("quit"))
//                break;
//            System.out.println(input2);
//        }

        while(true){                        // BARDZO POPULARNE! musi być 1 wariant z BREAK
            System.out.print("Input: ");
            input2 = scanner.next().toLowerCase();
            if (input2.equals("pass"))
                continue;
            if (input2.equals("quit"))
                break;
            System.out.println(input2);
            }

        //FOR-EACH loop
        String [] fruits = { "Apple", "Mango", "Pear"};
        System.out.println("Ile owocow w tablicy fruits: " + fruits.length);

        for (int i = 0; i< fruits.length; i++)
        System.out.println(fruits[i]);

        for (String chwilowaWartosczFruits : fruits)
            System.out.println(chwilowaWartosczFruits);

        //FOR EACH LOOP  - zawsze TYLKO do przodu od 1 miejsca w tablicy; i jeżeli do czegoś potrzebujemy indeksu
        }
    }

