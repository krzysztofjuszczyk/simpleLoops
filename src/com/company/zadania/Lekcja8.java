package com.company.zadania;

public class Lekcja8 {
    public static void main(String[] args){

        int wiek = 18;
        boolean jestTato= false;

        if(wiek<18) {
            System.out.println("za młody");

        } else if (jestTato==true) {
            System.out.println("Cześć tato! PRoszę chleb");
        }
        else { System.out.println("piwo");}

        int zmienna =4;
        switch (zmienna){
            case 1:
                System.out.println("jeden");break;
            case 2:
                System.out.println("dwa");break;
            case 3:
                System.out.println("trzy");break;
            default:
                System.out.println("nic z tego");
        }

        int miesiac = 1;
        switch (miesiac) {
            case 2:
                System.out.println("happy bday"); break;
            default:
                System.out.println("nie masz urodzin");

        }

        //ZAD DOMOWE czy parzysta?
        int a = 6;
                if (a%2==0){
                    System.out.println("jest parzysta");}
                    else {
                    System.out.println("nieparzysta");
                }
// zad domowe - podatek programisty
                    int dochod = 234234;
                    int kwota=85528;

                    if (dochod<0){
                        System.out.println("mniej niz 0");
                    }
                    else if (dochod<=kwota){
                    double podatek = 0.17*dochod;
        System.out.println(podatek);}
                    else {
                        double pdt2 = 0.17*kwota + (0.32*(dochod - kwota));
                        System.out.println(pdt2);
                    }

        // zad kalkulator
                    int x = 4;
                    int y =3;
                    char dzialanie='/';

                    switch (dzialanie) {

                        case ('+'):
                            int suma = x + y;
                            System.out.println(x + dzialanie + y + " = " + suma);
                            break;
                        case ('-'):
                            int roznica = x - y;
                            System.out.println(x + dzialanie + y + " = " + roznica);
                            break;
                        case ('/'):
                            double iloraz = (double) x / (double) y;
                            System.out.println(x + dzialanie + y + " = " + iloraz);
                            break;
                        default:
                            System.out.println("nie ma takiego dzialania");
                    }

    }
}
