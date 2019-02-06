package euler.ex10;

import java.util.ArrayList;
import java.util.Scanner;
        
public class PrimeSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Long> foo = new ArrayList<Long>();
        for (long i = 0; i < 2000000; i++) {
            if (isPrime(i)) {
                foo.add(i);
                // System.out.println(i);
            }
        }
        long s = 0;
        for (long e : foo) {
            s+=e;
            // System.out.println(e);
        }
        System.out.println(s);
        
        input.close();
    }
    
    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }
        return true;
    }
}