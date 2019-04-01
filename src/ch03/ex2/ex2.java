package ch03.ex2;
        
import java.util.Scanner;
        
public class ex2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("first num");
        int first = input.nextInt();
        System.out.println("second num");
        int second = input.nextInt();

        System.out.println(Math.pow(first, 3) + Math.pow(second, 3));
        
        input.close();
    }
}