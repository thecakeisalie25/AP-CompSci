package ch03.ex6;
        
import java.text.DecimalFormat;
import java.util.Scanner;
        
public class ex6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat tofour = new DecimalFormat("0.####");
        System.out.println("radius");
        double r = input.nextDouble();
        System.out.println("volume");
        System.out.println(tofour.format((4.0/3) * Math.PI * Math.pow(r, 3)));
        System.out.println("s.area");
        System.out.println(tofour.format((4.0  ) * Math.PI * Math.pow(r, 2)));
        
        input.close();
    }
}