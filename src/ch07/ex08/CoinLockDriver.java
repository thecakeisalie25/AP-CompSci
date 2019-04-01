package ch07.ex08;
        
import java.util.Scanner;
        
public class CoinLockDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        coin1.setKey(12345);
        coin1.lock(12345);
        coin2.setKey(234);
        coin2.lock(12345);
        System.out.println(coin2.getState());
        System.out.println(coin1.getState());
        
        input.close();
    }
}