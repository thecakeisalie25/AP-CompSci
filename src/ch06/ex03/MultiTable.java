package ch06.ex03;
        
import java.util.Scanner;
        
public class MultiTable
{
    /**
     * Program that outputs a multiplication table from one to 12.
     * @author Larson Ashcroft
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
        
        input.close();
    }
}