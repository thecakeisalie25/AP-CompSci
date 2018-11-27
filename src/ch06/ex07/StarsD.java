package ch06.ex07;

import java.util.Scanner;

public class StarsD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(Math.abs(i-5)<=j-1&&Math.abs(i - 5)<=Math.abs(j-5)?"*":" ");
            }
            System.out.println();
        }

        input.close();
    }
}