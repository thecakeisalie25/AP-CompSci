package ch02.ex13;
        
import java.util.Scanner;
        
public class ex13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Neumerator?");
        int neum = input.nextInt();
        System.out.println("Denominator?");
        int denom = input.nextInt();
        System.out.println(neum / (double)denom);
        
        input.close();
    }
}