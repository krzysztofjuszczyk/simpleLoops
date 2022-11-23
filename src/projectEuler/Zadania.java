package projectEuler;

public class Zadania {

    // problem 2 sum of even Fibonacci numbers

    public int ex01(int maxFibValue) {
        int poprzednia = 1, minusDwa = 1, suma = 0;
        int aktualna = poprzednia + minusDwa;

        while (aktualna <= maxFibValue) {             // ładny wariant, sumuje co trzecią liczbę; a b c a b c
            suma += aktualna;
            minusDwa = poprzednia + aktualna;
            poprzednia = minusDwa + aktualna;
            aktualna = poprzednia + minusDwa;

            System.out.print(minusDwa + " ");
            System.out.print(poprzednia + " ");
            System.out.print(aktualna + " ");

//        if (aktualna%2==0){
//            suma+=aktualna;
//        }
//        System.out.println("      Suma: of even Fib numbers "+suma);
//        minusDwa = poprzednia;
//        poprzednia = aktualna;
//        aktualna = poprzednia + minusDwa;


        }
        System.out.println("Suma:" + suma);
        return suma;
    }

    public long ex02(int maxValue) {
        long sum = 0;

        // moj kod - na piechote  ale działa wynika dla<1000 = 233168
        for (int i = 1; i < maxValue; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            } else sum += i;
        }


//        int target=maxValue-1;
//        int p3=target/3;
//        int p5=target/5;
//        int p15=target/15;
//        int sum3 = (3*p3*(p3+1))/2;
//        int sum5 = (5*p3*(p5+1))/2;
//        int sum15 = (15*p15*(p15+1))/2;
//        sum =sum3 + sum5 + sum15;


        System.out.println("Sum: " + sum);

        return sum;
    }

    //largest prime of n
    public long ex03(long n) {
        for (long i =  (n / 2); i >= 2; i--) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    return i;
                }
            }
        }
        return -1;
    }

//// Print the number of 2s that divide n
//while (n % 2 == 0) {
//System.out.print(2 + " ");
//n /= 2;
//}
//
//
//for (int i = 3; i <= Math.sqrt(n); i += 2) {
//// While i divides n, print i and divide n
//while (n % i == 0) {
//System.out.print(i + " ");
//n /= i;
//}
//}
//if (n > 2)
//System.out.print(n);
//}


    public long ex05(int number) {
        //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
        boolean res = false;
        long result = 2;

        mainLoop:
        while (!res) {
            result++;
            for (int i = 2; i <= number; i++) {
                if (result % i != 0) {
                    res = false;
                    continue mainLoop;
                }
            }
            res = true;
        }
        return result;
    }

    public static boolean isPrime(long x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
