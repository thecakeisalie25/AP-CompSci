package ch06.ex01;

import java.util.Scanner;

public class IntsTwo
{
/**
 * Write a program that reads an integer value and prints the sum of all even integers between 2 and the input value,
 * inclusive. Print an error message if the input value is less than 2. Prompt accordingly.
 * @author Larson Ashcroft
 */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please, kind sir, give me an {INTEGER_VALUE} over {2} please.");
        
        System.out.print("> ");
        int count2 = input.nextInt();
        int total  = 0;
        boolean conti = true;
        if (count2 < 2 ) {
            System.out.println("You had one job.");
            conti = false;
        }
        if(conti)
        for (int i = 2; i <= count2; i+=2) {
            total+=i;
        }
        System.out.println(total);
        input.close();
    }
}