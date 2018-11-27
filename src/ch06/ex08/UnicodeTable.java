package ch06.ex08;
        
import java.util.Scanner;
        
public class UnicodeTable
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        for (int i = 36; i < 127; i++) {
            System.out.print(i + " = " + Character.toChars(i)[0] + "\t");
            if(i % 5 == 0)
            {
                System.out.println();
            }
        }
        
        input.close();
    }
}