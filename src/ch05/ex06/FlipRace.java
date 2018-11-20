package ch05.ex06;
        
import java.util.Scanner;
        
public class FlipRace
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        int hc1 = 0, hc2 = 0;
        int i = 0;
        boolean done = false;
            
        while(!done)
        {
            i++;
            c1.flip();
            c2.flip();
            System.out.println("Flipcount: " + i);
            System.out.println("C1: " + (c1.getState() ? "Heads" : "Tails"));
            System.out.println("C2: " + (c2.getState() ? "Heads" : "Tails"));

            hc1 = c1.getState() ? hc1+1 : 0;
            hc2 = c2.getState() ? hc2+1 : 0;
            if (hc1==3 && hc2==3) 
            {
                done = true;
                System.out.println("It's a tie.");
            }
            else if (hc1 == 3)
            {
                done = true;
                System.out.println("C1 Wins.");
            }
            else if (hc2 == 3)
            {
                done = true;
                System.out.println("C2 Wins.");
            }
            if(done == true)
            {
                System.out.println("Final Flip Count: " + i);
            }
        }
        input.close();
    }
}