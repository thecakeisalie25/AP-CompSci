package ch02.ex10;
        
import java.util.Scanner;
        
public class ex10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quarters?");
        int quarters = input.nextInt();

        System.out.println("Dimes");
        int dimes = input.nextInt();

        System.out.println("Nickels?");
        int nickels = input.nextInt();

        System.out.println("Pennies?");
        int pennies = input.nextInt();

        quarters *= 25;
        dimes *= 10;
        nickels *= 5;
        pennies *= 1;
        
        System.out.println((quarters + dimes + nickels + pennies) * 0.01);

        input.close();
    }
}