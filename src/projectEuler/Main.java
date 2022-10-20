package projectEuler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a question (int 1 - 20): ");
        int wyborZadania = scanner.nextInt();
        Zadania zadania = new Zadania();

        switch (wyborZadania) {
            case 1:         //sum of Fibonacci numbers
                zadania.ex01(144);
                break;
            case 2:  //Multiples of 3 or 5
                zadania.ex02(1000000000);
                break;

        }
    }
}



