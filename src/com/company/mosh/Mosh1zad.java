package com.company.mosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mosh1zad {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();


        System.out.print("Annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();                // annual ir
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS_IN_YEAR;                         // monthly interest rate

        System.out.print("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //obliczenia
                double wynik = principal
                        * (monthlyInterestRate * Math.pow((1+monthlyInterestRate),numberOfPayments))
                        / (Math.pow((1+monthlyInterestRate),numberOfPayments) - 1);


        String wynikFormatted = NumberFormat.getCurrencyInstance().format(wynik);
        System.out.println("Mortgage (monthly): " + wynikFormatted);
        //System.out.println("Mortgage (monthly): " + NumberFormat.getCurrencyInstance().format(wynik));


    }
}
