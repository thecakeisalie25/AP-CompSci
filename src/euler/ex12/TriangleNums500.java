package euler.ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriangleNums500 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int factors = 0;
        int current = 1;
        while(factors < 500){
            factors = findFactors((int) tringle(current)).size();
            current++;
        }
        System.out.println(factors + "|" + current + "|" + tringle(current-1));
        // System.out.println(tringle(2));
        input.close();
    }

    public static long tringle(long n) {
        return n <= 1 ? 1 : n + tringle(n - 1);
    }
    
    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        // Skip two if the number is odd
        int incrementer = num % 2 == 0 ? 1 : 2;

        for (int i = 1; i <= Math.sqrt(num); i += incrementer) {

            // If there is no remainder, then the number is a factor.
            if (num % i == 0) {
                factors.add(i);

                // Skip duplicates
                if (i != num / i) {
                    factors.add(num / i);
                }

            }
        }

        // Sort the list of factors
        Collections.sort(factors);

        return factors;
    }
}