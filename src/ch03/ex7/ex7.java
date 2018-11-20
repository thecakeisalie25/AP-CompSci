package ch03.ex7;
        
import java.util.Scanner;
import java.text.DecimalFormat;
public class ex7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.###");
        
        System.out.println("the side of a triangle that we have arbitratily called a");
        double a = input.nextDouble();
        System.out.println("the side of a triangle that we have arbitratily called b");
        double b = input.nextDouble();
        System.out.println("the side of a triangle that we have arbitratily called c");
        double c = input.nextDouble();
        double s = (a+b+c)/2;

        System.out.println(format.format(Math.sqrt(s * (s-a) * (s-b) * (s-c))));
        
        input.close();
    }
}