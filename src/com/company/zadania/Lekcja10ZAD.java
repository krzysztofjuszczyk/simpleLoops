package com.company.zadania;

public class Lekcja10ZAD {
    public static void main(String[] args) {


//        for(int a=0; a<31; a+=2){
//            System.out.print(a + " ");
//        }
//        for (int a=30; a>=0; a-=2){
//            System.out.print(a + " " );
//        }
////ZAD 3
//        System.out.println("zadanie 3");
//        int a = 2;
//        int b = 10;
//        if (a < b) {
//            for (int wartosc = a; wartosc <= b; wartosc++) {
//                System.out.print(wartosc + " ");
//            }
//        } else {
//            System.out.println("błąd a>b");
//        }
//        System.out.println();
//        System.out.println("zadanie 3");
//        int[] tablica = {5, 2, 5, 7, 2, 1, 9, 19, 44, 23};
//        System.out.println(tablica.length);
//        for (a = 0; a < tablica.length; a++) {
//            System.out.println("tablica [" + a + "]" + tablica[a]);
//        }
//        for (a = tablica.length - 1; a >= 0; a--) {
//            System.out.println("tablica [" + a + "]" + tablica[a]);
//        }
//
//        //zadanie 5
//        int suma = 0;
//        for (a = 0; a < tablica.length; a++) {
//            suma = suma + tablica[a];
//        }
//        System.out.println("suma elementów = " + suma);
//
//        //zadanie 6
//        System.out.println("zadanie 6");
//        a = 25;
//        int silnia = 1;
//        if (a > 0) {
//            for (int i = 1; i <= a; i++) {
//                silnia = silnia * i;
//                System.out.print(i +"*");
//            }
//            System.out.print(" = " + silnia);
//        } else {
//            System.out.println("Błąd: liczba ujemna");
//        }

        //zadanie 7
        System.out.println("zadanie 7");
        int n=5;
        System.out.println("podana liczba to: "+n);
        if (n>0){
            for (int i=1; i<=n; i++){
                for (int j=1;j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            System.out.println("błąd, podaj liczbę >0");
        }

        //zadanie 8 odbicie lustrzane trojkata
        System.out.println("Zadanie 8 odbicie lustrzane trójkąta");
        int liczba=6;
        System.out.println("podana liczba to: " + liczba);
        if (liczba>0){

//                int gwiazdka=1;   //gwiazdki
//                int spacje=liczba - 1;
                for (int i=1;i<liczba;i++){
                        for (int j = 1; j <= liczba - i; j++) {  //pętla spacji
                                System.out.print(" ");}
                        for (int j = 1; j<=i; j++){
                            System.out.print("*");
                        }
                    System.out.println();
//                    gwiazdka++;
//                    spacje--;
                }
            }
         else {
            System.out.println("błąd, podaj liczbę >0");}

        //zadanie 9
        System.out.println("Zadanie 9 choinka o wysokości n");
        n=4;
        System.out.println("podana liczba to: " + n);

                int ileSp=n-1;
                int ileGw=0;


            for (int i=1;i<=n;i++){                  // pętla główna POZIOM

                for (int j = 1; j <= ileSp; j++) {  //pętla lewych spacji
                    System.out.print(" ");
                }
                for (int j = 1; j<=ileGw; j++){         // pętla lewych gwiazdek
                    System.out.print("*");
                }
                System.out.print("*");              //gw w środku
                for (int j = 1; j<=ileGw; j++){          // pętlka pr. gw.
                    System.out.print("*");
                }
                for (int j= 1; j <= ileSp; j++){       //pętlka pr. spacji
                    System.out.print(" ");
                }
                System.out.println();
                ileSp--;
                ileGw++;
            }
        }
}
