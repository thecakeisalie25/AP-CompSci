package ch12.ex07;
        
import java.util.Random;
import java.util.Scanner;
        // blurb = whozit + whatzit + [whatzit...]
        //whozit = x + y*+
        //whatzit = q + [z|d] + whoozit
public class BlurbMaker
{
    private static final int LENGTH = 10;
    public static Random rand;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        rand = new Random();
        System.out.println(blurb());
        input.close();
    }

    public static String whoozit() {
        String x = "x";
        for (int i = 0; i < rand.nextInt(LENGTH); i++) {
            x+='y';
        }
        return x;
    }
    public static String whatzit() {
        String x = "q";
        x += rand.nextBoolean()?"z":"d";
        x += whoozit();
        return x;
    }
    public static String blurb() {
        String x = whoozit();
        for (int i = 0; i < rand.nextInt(LENGTH) + 1; i++) {
            x += whatzit();
        }
        return x;
    }
}