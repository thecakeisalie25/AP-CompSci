package ch03.ex8;
        
import java.util.Scanner;
import java.util.Random;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int base = new Random().nextInt(21) + 20;
        System.out.println(base);
        System.out.println("sin");
        System.out.println(Math.sin(Math.toRadians(base)));
        System.out.println("cos");
        System.out.println(Math.cos(Math.toRadians(base)));
        System.out.println("tan");
        System.out.println(Math.tan(Math.toRadians(base)));

        input.close();
    }
}