package ch04.ex02;
        
import java.util.Scanner;
        
public class ex02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Bulb b1 = new Bulb();
        Bulb b2 = new Bulb();

        System.out.println("B1: " + b1.getStatus());
        System.out.println("B2: " + b2.getStatus());
        b1.toggleStatus();
        System.out.println("B1: " + b1.getStatus());
        System.out.println("B2: " + b2.getStatus());        
        
        input.close();
    }
}