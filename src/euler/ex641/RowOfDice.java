package euler.ex641;

import java.util.Scanner;

public class RowOfDice {
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        int f = 0;
        byte[] dice = new byte[100000000+1];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = 1;
            System.out.println("Making die " + i);
            // Thread.sleep(1);
        }

        for (int i = 2; i < dice.length; i++) {
            for (int j = i; j < dice.length; j += i) {
                dice[j] = flip(dice[j]);
                System.out.println("Flipping " + j + " \tto " + dice[j] + " \t(i = " + i + ")");
            }
        }
        
        for (byte e : dice) {
            if(e == 1)
            {
                f++;
            }
        }
        System.out.println(f - 1);
        input.close();
    }
    public static byte flip(byte n) {
        if (n == 6)
        {
            n = 0;
        }
        n++;
        return n;
    }
}