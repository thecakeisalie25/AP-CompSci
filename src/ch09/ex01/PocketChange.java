package ch09.ex01;
        
import java.util.Scanner;
        
public class PocketChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        MonetaryCoin nickel = new MonetaryCoin(5);
        nickel.flip();
        System.out.println(nickel.getWorth());
        System.out.println(nickel.isHeads());
        
        input.close();
    }
}