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
        for (long e : numFactors(TEST_NUM)) {
            if (e > r && isPrime(e)) {
                r = e;
            }
        }
        System.out.println(r);
        input.close();
    }
    
    private static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0 || n <= 1) {
                System.out.println("Checking prime: " + i + " of " + n);
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<Long> numFactors(long n) {
        ArrayList<Long> r = new ArrayList<Long>();
        for (long i = 1; i <= n; i++) {
            System.out.println("Checking factor: " + i + " of " + n);
            if (n % i == 0) {
                r.add(i);
            }
        }
        return r;
    }
}