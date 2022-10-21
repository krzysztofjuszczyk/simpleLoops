package com.company.mosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Mosh1 {
    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 23;
        System.out.println(point2);

//        String message = new String("hello World");
        String  message ="CZESC SWIECIE" + " !!";

        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.length());
        String znakP ="CZ";
        System.out.print("starts with " + znakP +" ");
        System.out.println(message.startsWith(znakP));

        String znakK ="!";
        System.out.print("ends with " + znakK + " ");
        System.out.println(message.endsWith(znakK));

        int [] tablica = {3,4,2,6,4,5,6};
        System.out.println(Arrays.toString(tablica));
        System.out.println("ilość elementów: " + tablica.length);
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));

        int[][] tablica2x3 = new int [2][3];
        tablica2x3[0][0]= 3;
        tablica2x3[0][1]= 2;
        tablica2x3[0][2]= 1;
        tablica2x3[1][0]= 6;
        tablica2x3[1][1]= 5;
        tablica2x3[1][2]= 4;

        final float PI=3.14F;
        String x ="1";
        int y= Integer.parseInt(x)+2;
        System.out.println("x:"+x);
        System.out.println("y:"+y);

        int result = Math.round(1.49F); // zaokrągla .5 w górę!
        System.out.println(result);

        double result2 = Math.random(); // random od 0 do 1
        System.out.println(result2);

        int result3 =(int) /* Math.round*/ (Math.random()*100); // random od 1 do 100 zaokr i rzucony na int
        System.out.println(result3);


        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String waluta = currency.format(12532.66643);
        System.out.println(waluta);

        // long version
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String wynikProcentowy = percentInstance.format(0.23);
        System.out.println(wynikProcentowy);

        //short version
        String wynikProcentowyLong = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(wynikProcentowyLong);

        // READING INPUT            Scanner + next method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        byte age = scanner.nextByte();
        System.out.println("Masz" + age + "lat");

        String ageInStringFormat = scanner.next();
            // next.Line   cała linia (wcześniej spacja przerywa)
        String name = scanner.nextLine().trim();
        System.out.println("You are: "+ name);


    }
}
