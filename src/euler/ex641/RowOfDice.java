package euler.ex641;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RowOfDice {
    public static void main(String[] args) throws IOException {
        // ArrayList<String> a = new ArrayList<String>();
        FileWriter file = new FileWriter("test.txt");
        PrintWriter fWrite = new PrintWriter(file);
        for (int i = 5; i <= 1000000; i+=5) {
            fWrite.println(mainInt(i));
        }
        fWrite.close();
    }

    private static String mainInt(int i) {
        return main2(new String[]{Integer.toString(i)});
    }
    public static String main2(String[] args){
        Scanner input = new Scanner(System.in);
        int f = 0;
        int size = 1002;
        if (args.length != 0) {
            size = Integer.decode(args[0]);
        }
        byte[] dice = new byte[size];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = 1;
            // System.out.println("Making die " + i);
            // Thread.sleep(1);
        }

        for (int i = 2; i < dice.length; i++) {
            for (int j = i; j < dice.length; j += i) {
                dice[j] = flip(dice[j]);
                // System.out.println("Flipping " + j + " \tto " + dice[j] + " \t(i = " + i + ")");
            }
        }
        
        for (byte e : dice) {
            if(e == 1)
            {
                f++;
            }
        }
        String answer = size + "," + (f - 1);
        // System.out.println(answer);
        input.close();
        return answer;
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