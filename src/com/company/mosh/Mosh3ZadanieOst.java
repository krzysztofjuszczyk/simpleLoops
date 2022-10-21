package com.company.mosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mosh3ZadanieOst {
    public static void main(String[] args) {
        // "Principal ($1K - $1M) min - max jezeli nie to pyta
        //Annual Interest rate  = 0- 30
        //Period (Years) 1-30
        // wynik Mortgage

        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        int principal = 0;
        double annualIntRate =0;
        double monthlyInterestRate=0;
        int numberOfPayments =0;

        while (true) {
        System.out.print("Principal ($1K - $1M): ");
        principal = scanner.nextInt();
        if (principal >= 1000 && principal <= 1_000_000) {
            System.out.println("Principal value = "+ principal);
            break;
            }
            System.out.println("Enter a valid value");
        }


        while (true) {
           System.out.print("Annual interest rate (0-30): ");
           String annualIntRateInput = scanner.next();
           annualIntRate = Double.parseDouble(annualIntRateInput);

           if (annualIntRate > 0 && annualIntRate <= 30){
                   System.out.println("Annual interest rate = "+ annualIntRate);
                   monthlyInterestRate = annualIntRate / PERCENT / MONTHS_IN_YEAR ;
                   break;}
            System.out.println("Enter a valid value");

        }


        while (true) {
            System.out.print("Mortgage period in years (1-30): ");
            int period = scanner.nextInt();
            if (period > 0 && period <= 30) {
                System.out.println("Mortgage period = " + period);
                numberOfPayments = period*MONTHS_IN_YEAR;
                break;
                }
            System.out.println("Enter a valid value");
            }




        // obliczenie mortgage value

        double wynik = principal
                * (monthlyInterestRate * Math.pow((1+monthlyInterestRate),numberOfPayments))
                / (Math.pow((1+monthlyInterestRate),numberOfPayments) - 1);

        String wynikFormatted = NumberFormat.getCurrencyInstance().format(wynik);
        System.out.println("Monthly mortgage = " + wynikFormatted);


    }
}
