package euler.ex03;
        
import java.util.ArrayList;
import java.util.Scanner;
        
public class LargestPrimeFactor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        final long TEST_NUM = Long.decode("600851475143");
        long r = 0;
        System.out.println(TEST_NUM);
        ArrayList<Long> factors = getFactors(TEST_NUM);
        factors.sort(null);
        System.out.println(factors);
        for (long e : factors) {
            if(isPrime(e))
            {
                r = e;
            }
        }
        System.out.println(r);
        input.close();
    }
    
    private static boolean isPrime(long n) {
        for (long i = 2; i < Math.round(Math.sqrt(n)); i++) {
            // System.out.println("Checking prime: " + i + " of " + n);
            if (n % i == 0 || n <= 1) {
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<Long> getFactors(long n) {
        ArrayList<Long> r = new ArrayList<Long>();
        for (long i = 1; i <= Math.round(Math.sqrt(n)); i++) {
            // System.out.println("Checking factor: " + i + " of " + Math.round(Math.sqrt(n)));
            if (n % i == 0) {
                r.add(i);
                r.add(n/i);
            }
        }
        return r;
    }
}