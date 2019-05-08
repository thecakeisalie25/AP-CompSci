package ch12.ex02;
        
import java.util.Scanner;
        
public class Euclid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        System.out.println(gcd(input.nextInt(), input.nextInt()));
        input.close();
    }

    public static int gcd(int num1, int num2) {
        if(num2%num1 == 0)
        {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}