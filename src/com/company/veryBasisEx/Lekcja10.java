package com.company.veryBasisEx;

public class Lekcja10 {
    public static void main(String[] args) {
//        int licznik;
//        for(licznik=1; licznik<=5; licznik++) {
//            System.out.println("tekst " + licznik);
//        }
//        System.out.println("poza " + licznik);
//
//        int l = 1;
//        while (l<=8){
//            System.out.println("tekst while " + l);
//            l++;
//        }
//
//        int a = 1;
//        do {
//            System.out.println("tekst z dowhile " + a);
//            a++;
//        } while (a<10);
//        System.out.println("koniec wartosc a " + a);

//        int zmienna;
//        for (zmienna = 1; zmienna <= 20; zmienna++) {
//            System.out.println("wartość przed cont " + zmienna);
//            if (zmienna == 16) {
//                continue;
//            }
//            System.out.println("wart zmiennej " + zmienna);
//
//        }
//
//        for (zmienna=  1; zmienna <=20; zmienna++) {
//            if (zmienna == 18) {
//                break;
//            }
//            System.out.println("druga pętla"+ zmienna);
//        }

//        // TABLICE
//        int [] tab = new int [100];
//        for (int i=0; i<100; i++){
//            tab[i]=2*i;
//        }
//        for (int i =0; i<tab.length; i++){
//            System.out.println("tab " + i + ":" + tab[i]);
//        }
//
//        int licznik = 0;
//        for(int i = 0; i<5; i++){
//            for (int j=0; j<10; j++) {
//                System.out.println("i = "+i+ "; j= " + j);
//                licznik ++;
//                System.out.println(" licznik ="+ licznik);

    //KONIEC PROGRAMU
        int licznik = 1;
        int [][] tab = new int [5][10];

        for (int i = 0; i < 5 ;i ++){
            for (int j = 0; j <10 ; j++){
                tab[i][j] = licznik;
                licznik ++;
            }
        }

        for (int i = 0; i < 5 ;i ++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + "," + j + "=" + tab[i][j] + "  ");
            }
            System.out.println();
        }


            }
}
