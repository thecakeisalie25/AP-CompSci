package ch03.ex9;
        
import java.util.Scanner;
import java.util.Random;

public class ex9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int rad = new Random().nextInt(20) + 1;
        int had = new Random().nextInt(20) + 1;
        System.out.println("radius: " + rad);
        System.out.println("height: " + had);
        System.out.println("Volume");
        System.out.println(Math.PI * Math.pow(rad, 2) * had);
        System.out.println("s.area");
        System.out.println(Math.PI * 2 * rad * had);

        input.close();
    }
}