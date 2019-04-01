package ch02.ex11;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input dollars");
        double dance = input.nextDouble();
        int cents = (int)(dance * 100);

        int tenners = cents / 1000;

        cents -= tenners * 1000;

        int fivers = cents / 500;

        cents -= fivers * 500;

        int dollars = cents / 100;

        cents -= dollars * 100;

        int quarters = cents / 25;

        cents -= quarters * 25;

        int dimes = cents / 10;

        cents -= dimes * 10;

        int nickels = cents / 5;

        cents -= nickels * 5;

        System.out.println(tenners + " tenners");
        System.out.println(fivers + " fivers");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " cents");       

        input.close();
    }
}