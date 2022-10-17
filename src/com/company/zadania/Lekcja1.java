package com.company.zadania;

public class Lekcja1 {
    public static void main(String[] args){
        int wiek = 40;
        int wzrost = 183;
        int waga = 73;


        System.out.println("wiek: " +wiek);
        System.out.println("wzrost: " +wzrost);
        System.out.println("waga: " +waga);

        double wzrostwm ;
        wzrostwm = wzrost/100;   // gdy zamienię na: (double) wzrost/100 wszystko wychodzi OK
        System.out.println("wzrost w m: " + wzrostwm);

        double bmi = waga / (wzrostwm * wzrostwm);
        System.out.println("twoje BMI:"+ bmi);
        System.out.println("twoje BMI po konw na całkowitą:" + (int)bmi);

        System.out.println(waga / Math.pow(wzrostwm,2));

        int calkowita= 20;
        System.out.println("liczba: " + calkowita);
        System.out.println(calkowita + "/2 = " + calkowita/2);
        System.out.println(calkowita + "reszta z /2 =" + calkowita%2);
        System.out.println(calkowita + "/3 = " + calkowita/3);
        System.out.println(calkowita + "reszta z /3 = " + calkowita%3);
        System.out.println(calkowita + "/11 = " + calkowita/11);
        System.out.println(calkowita + "reszta z /11 = " + calkowita%11);

        int przekroczonaLiczba=1000000000;
        przekroczonaLiczba = przekroczonaLiczba * 3;
        System.out.println(przekroczonaLiczba);

    }
}
