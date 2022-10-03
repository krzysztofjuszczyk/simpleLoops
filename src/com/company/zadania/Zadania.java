package com.company.zadania;
//http://www.beginwithjava.com/java/loops/questions.html

import java.util.Scanner;

public class Zadania {
    Scanner scanner = new Scanner(System.in);


    public void zadanie1() {
        System.out.println("Metoda zadanie1");

    }

    public void zadanie2(){

    }

    public void zadanie3() {
//        Write        a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        System.out.print("input a positive integer: ");
        int in = scanner.nextInt();
        System.out.println();
        System.out.println("Multiplication table of : " + in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(in + " * " + i + " = " + in * i);
        }
    }
    public void zadanie4silnia(){         // factorial - silnia
        System.out.println("Input an integer to get factorial");
        int in = scanner.nextInt();
        int silnia=1;
        for(int i=1; i<=in; i++){
            silnia *=i;
        }
        System.out.println("Factorial of "+ in + " = " + silnia);
    }

    public int zadanie4silnia(int x){         // factorial - silnia
        int in = x;
        int silnia=1;
        for(int i=1; i<=in; i++){
            silnia *=i;
        }
        System.out.println("Factorial of "+ in + " = " + silnia);
        return silnia;
    }

    public void zadanie5(){             // x to the power of y
        System.out.println("Input x & y , to get x to the power of y");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        int wynik = x;
        if (y==0){
            wynik=1;
        } else {
            for (int i=1; i<y; i++){
                wynik *=x;
            }
        }

        System.out.println(x+ " to the power of "+y+ " = " + wynik);
    }

    public void zadanie6(){
        System.out.println("Input integer to ge it in reverse");
        System.out.print("x = ");
        int x = scanner.nextInt();

        int remainder;
        int temp = x;
        int reverse=0;
        while (temp>0){
            remainder = temp %10;
            temp = temp/10;
            reverse = reverse*10+remainder;
        }
        System.out.println(reverse);
    }

    public void zadanie7(){
        int sumOdd = 0;
        int sumEven = 0;
        int x=1;
        System.out.println("Input numbers to calculate sums (odd/even). 0 ends");
        while (x!=0){
            System.out.print("enter number ");
            x= scanner.nextInt();
            if (x%2==0){             //parzyste
                sumEven += x;
            }else {                 //nieparzyste
                sumOdd += x;
            }
        }
        System.out.println("sum of odds = " + sumOdd);
        System.out.println("sum of evens = " + sumEven);
    }

    public void zadanie8() {       // is X a prime number?

        System.out.print("Input a number to check if it is prime : ");
        int x = scanner.nextInt();
        int reszta = 0;
        boolean isPrime = true;
        for (int i = 2; i < x; i++) {
            System.out.println(x + " / " + i);
            reszta = x % i;
            if (reszta == 0) {
                isPrime = false;
            }
            break;
        }
        if (isPrime == true && x > 0) {
            System.out.println(x + " is a prime number");
        } else if (isPrime == false && x > 0)
            System.out.println(x + " is a NOT prime number");
        else
            System.out.println("enter a POSITIVE integer");
    }

    public void zadanie9(){                     //HCF
        System.out.println("Input 2 integers to calculate HCF");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int rest, hcf, greater, smaller;

        if (x>=y){greater = x;
            smaller=y;
            }
        else {greater=y; smaller=x;
            }

        do {
            hcf = smaller;
            rest = greater % smaller;
            greater = smaller;
            smaller = rest;
        }
        while (rest!=0);

        System.out.println("HCF is " + hcf);
    }

    public void zadanie10(){
        boolean wannaPlay=true;
        do{
            System.out.println("Input 2 numbers to add them :");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x +" + " + y +" = "+ (x+y));

            System.out.println("Do you want to play again? N for no");
            char yesNo = scanner.next().charAt(0);
            if (yesNo == 'n' || yesNo =='N'){ wannaPlay=false;}

        } while (wannaPlay);
        System.out.println("Bye bye");
    }

    public void zadanie11(){
        boolean wannaPlay = true;
        char yesNo;
        int posCount = 0, negCout=0, zeros=0;
        do{
            System.out.print("Enter a number ");
            int x = scanner.nextInt();
            if (x>0)posCount++;
            else if (x<0) negCout++;
            else zeros++;

            System.out.print("next number? Y/N?");
            yesNo= scanner.next().charAt(0);
            if (yesNo=='n' || yesNo=='N')wannaPlay=false;
        }while (wannaPlay==true);
        System.out.println(posCount + " positives");
        System.out.println(negCout + " negatives");
        System.out.println(zeros + " zeros");
        System.out.println("Bye bye");
    }

    public void zadanie12(){
        boolean wannaPlay = true;
        int largest = 0, smallest=0;
        do{
            System.out.print("Enter a number ");
            int x = scanner.nextInt();
            if (x>largest) {largest=x;}
            else if (x<smallest) smallest=x;

            System.out.print("next number? Y/N?");
            char yesNo= scanner.next().charAt(0);
            if (yesNo=='n' || yesNo=='N')wannaPlay=false;
        }while (wannaPlay==true);

        System.out.println("Largest : "+ largest );
        System.out.println("Smallest : "+ smallest);

    }

    public void zadanie13() {
        //Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of
        // the number is equal to the number itself, then the number is called an Armstrong number.
        //For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        System.out.print("Armstrong numbers between 1 and 500");
        int digit1, digit10, digit100, digit1000;
        for (int liczba = 10; liczba <100; liczba++) {         //to the 2nd pow

            int temp = liczba;

            digit1 = liczba % 10;
            digit10 = (liczba / 10) % 10;


            if (digit1 * digit1 + digit10 * digit10 == liczba) {
                System.out.println(liczba);
            }
        }

        for (int liczba = 1; liczba <1000; liczba++) {         //to the 3rd pow

            int temp = liczba;

            digit1 = liczba % 10;
            digit10 = (liczba / 10) % 10;
            digit100 = (liczba / 100) % 10;
            //System.out.println(digit100 + " " + digit10 + " " + digit1);

            if (digit1 * digit1 * digit1 + digit10 * digit10 * digit10 + digit100 * digit100 * digit100 == liczba) {
                System.out.println(liczba);
            }
        }

        for (int liczba = 1000; liczba <10000; liczba++) {         //to the 4th pow

            int temp = liczba;

            digit1 = liczba % 10;
            digit10 = (liczba / 10) % 10;
            digit100 = (liczba / 100) % 10;
            digit1000 = (liczba / 1000) % 10;
            //System.out.println(digit100 + " " + digit10 + " " + digit1);

            if (digit1 * digit1 * digit1 * digit1 + digit10 * digit10 * digit10 * digit10 +digit100 * digit100 * digit100 * digit100
                    + digit1000*digit1000*digit1000*digit1000== liczba) {
                System.out.println(liczba);
            }
        }
    }


    public void zadanie14(){
        //Write a program to print Fibonacci series of n terms where n is input by user :
        //0 1 1 2 3 5 8 13 24 .....
        System.out.println("Fibonacci sequence of n numbers. Input n");
        int n =scanner.nextInt();
        int aktualna, poprzednia = 1, minusDwa=0;
        switch (n)  {
            case 0:

            case 1:
                System.out.println("0");
                break;

            default:
                System.out.print("0 1");
                for (int i = 1; i<n; i++){
                    aktualna = poprzednia + minusDwa;
                    System.out.print(" "+ aktualna);
                    minusDwa=poprzednia;
                    poprzednia=aktualna;
                }

        }

    }

    public void zadanie15(){
        //Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        System.out.println("Input n: ");
        int n= scanner.nextInt();
        double sum=1;
        for (int i=2; i<=n; i++){

            System.out.print(sum + " + " + (1.0/i) + " = ");
            sum=sum+(1.0/i);
            System.out.println(sum);
        }
        System.out.println("sum: "+sum);
    }

    public void zadanie16(){
        //Compute the natural logarithm of 2, by adding up to n terms in the series
        //1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
        //where n is a positive integer and input by user.
        System.out.println("Calculate the natural logarithm of 2 by adding up to n terms. Input n: ");
        int n= scanner.nextInt();
        double sum=1;
        System.out.print("1");
        for (int i=2; i<=n; i++){

            if (i%2==0) {
                System.out.print(" - " + (1.0/i));
                sum=sum-(1.0/i);

            }
            else{
                System.out.print(" + " + (1.0/i));
                sum=sum+(1.0/i);
            }
        }
        System.out.println(" = "+sum);

        /* LEPSZE ROZWIĄZANIE - nie moje  - zna jako osobna zmienna mnożona co cykl *-1
        double sum = 0;
        int sign = 1;

        for(int i = 1; i <= number; i++)
        {
            sum += (1.0 * sign) / i;
            sign *= -1;
        }

        System.out.println("log2: " + sum);
        */

    }

    public void zadanie17(){
        System.out.println("Guess the random number 1-100.  I'll give you hints.");
        int random = (int) (Math.random()*100)+1;
        int guess =0;
        int howManyTries =0;

        do {
            System.out.print("Enter number: ");
            guess= scanner.nextInt();
            howManyTries++;

            if (guess>random){
                System.out.println("too high");
            }
            else {
                System.out.println("too low");
            }
        }

        while (guess!=random);

        System.out.println("Excellent! You guessed the number");
        System.out.println("It was: "+ random);
        System.out.println("You guessed in "+ howManyTries + " tries.");
    }

    public void zadanie18(){
        System.out.println("what version? 1-6");
        int n= scanner.nextInt();
        while (n<1||n>6) {;
            System.out.println("I said 1-6");
            n= scanner.nextInt();}

        switch (n) {
            case 1:
                System.out.println("How many rows?");
                int rows = scanner.nextInt();
                System.out.print("How many colums?");
                int columns = scanner.nextInt();

                for (int i=1; i<=rows;i++){
                    for (int j=1; j<=columns;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:     // trojkat w prawo
                System.out.println("How many rows?");
                rows = scanner.nextInt();
                for (int i=1; i<=rows;i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:     // trojkat w lewo
                System.out.println("How many rows?");
                rows = scanner.nextInt();
                for (int i=1; i<=rows;i++) {

                    for (int j = rows-i; j >0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1;k<=i;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:     // trojkat symetryczny
                System.out.println("How many rows?");
                rows = scanner.nextInt();
                for (int i=1; i<=rows;i++) {

                    for (int j = rows-i; j >0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1;k<i;k++){
                        System.out.print("*");
                    }
                    System.out.print("*");
                    for (int k = 1;k<i;k++){
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;

            case 5:     // trojkat sym liczby
                System.out.println("How many rows?");
                rows = scanner.nextInt();
                for (int i=1; i<=rows;i++) {

                    for (int j = rows-i; j >0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1;k<i;k++){
                        System.out.print(i);
                    }
                    System.out.print(i);
                    for (int k = 1;k<i;k++){
                        System.out.print(i);
                    }

                    System.out.println();
                }
                break;

            case 6:     // trojkat sym liczby v2
                System.out.println("How many rows?");
                rows = scanner.nextInt();
                for (int i=1; i<=rows;i++) {

                    for (int j = rows-i; j >0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1;k<i;k++){                //lewe cyfry
                        System.out.print(i-k+1);
                    }

                    System.out.print("1");

                    for (int k = 1;k<i;k++){                //prawe cyfy
                        System.out.print(k+1);
                    }

                    System.out.println();
                }
                break;

            }
    }

    public void zadanie19(){
        /*
        Write a program to compute sinx for given x. The user should supply x and a positive integer n.
        We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn
        sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
         */
    zadanie4silnia(5);

    }

    public void zadanie20(){
        /*
        Write a program to compute the cosine of x. The user should supply x and a positive integer n.
        We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn
        cos x = 1 - x2/2! + x4/4! - x6/6! .....
         */


    }

    public void zadanie21random(int ileliczb, int min, int max) {

        int random=0;
        for (int i=1;i<=ileliczb; i++){
            random = (int) (Math.random()* (max-min+1))+min;
            System.out.println(random);
        }
    }
}
