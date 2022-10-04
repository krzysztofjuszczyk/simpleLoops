package com.company;

import java.util.Scanner;

public class ChoinkiRysowanie {
        public static void main(String[] args) {
            System.out.println("Trojkaty");
            System.out.println("1) trojkat w prawo");
            System.out.println("2) trojkat w lewo");
            System.out.println("3) trojkat w symetryczny");

            // WPROWADZENIE DANYCH
            System.out.println("Jaki trojkat / choinka?");
            int wybor = getInt();
            System.out.println("Ile rzedow?");
            int ileRzedow = getInt();

            System.out.println("Wybrałeś "+ ileRzedow+ " rzędów");

            switch (wybor){
                case 1:
                    System.out.println("w prawo");
                    for (int i=1; i<=ileRzedow;i++){
                        for (int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();}
                    break;

                case 2:
                    System.out.println("w lewo");
                    for (int i=1;i<=ileRzedow;i++){
                        for (int k=1; k<=ileRzedow-i;k++){
                            System.out.print(" ");
                        }
                        for (int k=1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("symetryczny");
                    for (int i=1; i<=ileRzedow;i++){            //RZeDY

                        // lewa część
                        for (int j=1; j<=ileRzedow-i;j++){
                            System.out.print(" ");
                        }

                        for (int j=1;j<i;j++) {
                            System.out.print("*");


                        }
                        System.out.print("*");                // środkowa gwiazdka

                        for (int j=1;j<i;j++){                 // prawa część
                            System.out.print("*");
                        }
                        for (int j=1; j<=ileRzedow-i;j++){
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

                    break;

                default:
                    System.out.println("wpisz poprawną wartość gałganie!");
            }
        }

        public static int getInt() {
            return new Scanner(System.in).nextInt();
        }
    }

