package ch02.ex12;
        
import java.util.Scanner;
        
public class ex12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Length of a square's side?");
        int length = input.nextInt();
        System.out.println("Area: " + (length * length));
        System.out.println("Perimiter: " + (length * 4));
        
        input.close();
    }
}