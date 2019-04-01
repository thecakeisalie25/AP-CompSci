package ch03.ex5;
        
import java.util.Scanner;
        
public class ex5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("x");
        double x  = input.nextDouble();
        System.out.println("y");
        double y  = input.nextDouble();
        System.out.println("x2");
        double x2 = input.nextDouble();
        System.out.println("y2");
        double y2 = input.nextDouble();
        System.out.println(Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2)));

        
        input.close();
    }
}