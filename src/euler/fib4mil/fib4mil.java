package euler.fib4mil;

import java.util.Scanner;

public class fib4mil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = 1, b = 1, c = 0;
        while (b < 4000000) {
            System.out.println(a);
            b += a;
            a = b - a;
            if (b % 2 == 0) {
                c += b;
            }
        }
        System.out.println("----------");
        System.out.println(c);
        input.close();
    }
}