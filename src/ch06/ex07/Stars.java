package ch06.ex07;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}