package ch05.ex02;
        
import java.util.Scanner;
        
public class Leap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int nextInt = 0;
        while(nextInt != 1582)
        {
            System.out.println("Input a year, please, or input 1582 to exit.");
            System.out.print("> ");
            nextInt = input.nextInt();
            if(nextInt < 1582) System.out.println("Leap years don't exist yet, but if they did I would say:");
            System.out.println(java.time.Year.isLeap(nextInt) ? "Yes, it's a leap year." : "Nope. Not a leap year.");
        }
        System.out.println("Thank you.");

        input.close();
    }
}