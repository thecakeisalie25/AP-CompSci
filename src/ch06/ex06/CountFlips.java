package ch06.ex06;
        
import java.util.Scanner;

import ch05.ex06.Coin;
        
public class CountFlips
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Coin coin = new Coin();
        int h = 0, t = 0;
        for (int i = 0; i < 100; i++) {
            if(coin.flip())
            {
                h++;
            }
            else
            {
                t++;
            }
        }
        System.out.println("Heads: " + h + ".");
        System.out.println("Tails: " + t + ".");
        
        input.close();
    }
}