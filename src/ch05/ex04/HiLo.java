package ch05.ex04;
        
import java.util.Random;
import java.util.Scanner;
        
public class HiLo
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        
        boolean wantstoplay = true;
        String upperCase2;
        int guesses;
        int num = 0, guess = 0;
        while(wantstoplay)
        {
            guess = 0;
            guesses=0;
            System.out.println("Guess the number, 1-100.");
            num = new Random().nextInt(100) + 1;
            while(num != guess)
            {
                System.out.println("Take a guess.");
                System.out.print("> ");
                guess = input.nextInt();
                if(guess > num)
                {
                    System.out.println("You're too high.");
                }
                else if(guess < num)
                {
                    System.out.println("You're too low.");
                }
                guesses++;
            }
            System.out.println("You got it. Nice. Want to play again?");
            System.out.println("Guesses: " + guesses);
            System.out.println("Y/N");
            // System.out.print("> ");

            input.nextLine(); // Mr jackson you are cruel for not helping me with this
            upperCase2 = input.nextLine().toUpperCase();
            // System.out.println(upperCase2);

            if (upperCase2.equals("N"))
            {
                wantstoplay = false;
            }
        }
        
        input.close();
    }
}