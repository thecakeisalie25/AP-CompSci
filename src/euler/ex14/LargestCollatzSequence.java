package euler.ex14;
        
import java.util.Scanner;
        
public class LargestCollatzSequence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        long num = 0;
        long length = 0;

        for (long i = 1; i < 1000000; i++) {
            long collatz = collatz(i);
            System.out.println(collatz);
			if(collatz > length)
            {
                num = i;
                length = collatz;
            }
        }
        System.out.println(num);
        System.out.println(collatz(num));

        // collatz(837799);
        
        input.close();
    }
    public static long collatz(long n) {
        return collatz(n, 1);
    }
    public static long collatz(long n, long depth) {
        if (n <= 1) {
            return depth;
        }
        else if (n % 2 == 0) {
            // System.out.println(n / 2);
            return collatz(n / 2, depth + 1);
        }
        // System.out.println((n * 3) + 1);
        return collatz((n * 3) + 1, depth + 1);
    }
}