package yeet.childages;
        
import java.util.Scanner;
        
public class ChildAges
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a, b, c; // Define 3 numbers, a, b, and c.
        /**
         * The code below runs whatever is in the brackets once for every number 2-36.
         * The same is true for the other 2 as well.
         * 
         * We start at 2, instead of 1, because since the prompt asks for years (plural)
         * we know that a child with age 1 would result in year (singular) which fails
         * the prompt.
         * 
         * This ends up running the inside code for every combination of i, j, and k
         * from 2 to 36.
         */
        for (int i = 1; i <= 36; i++) {
            for (int j = 1; j <= 36; j++) {
                for (int k = 1; k <= 36; k++) {
                    /**
                     * If the product of the kids ages doesn't equal 36, skip this 
                     * iteration of the loop.
                     */
                    if(i * j * k != 36) continue;
                    if(i < j || j < k) continue;
                    System.out.println(i + " + " + j + " + " + k + " = " + (i+j+k));
                }
            }
        }

        
        input.close();
    }
}