package ch03.ex4;
        
import java.util.Scanner;
        
public class ex4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("hey give me a number thx");
        double num = input.nextDouble();
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
        
        input.close();
    }
}