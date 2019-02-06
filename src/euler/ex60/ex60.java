package euler.ex60;

import java.math.BigInteger;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class ex60 {
    public static ArrayList<Long> primes = new ArrayList<Long>();
    public static ArrayList<Long> antiprimes = new ArrayList<Long>();

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int[] solution = new int[5];
        boolean foundSolution = false;
        int starting = 6;
        if (args.length != 0) {
            starting = Integer.decode(args[0]);
        }
        Time start = new Time(System.currentTimeMillis());
        Time end;
        for (int i = starting; !foundSolution; i++) {
            if (!isPrime(i)) {
                continue;
            }
            // System.out.println(i);
            for (int j = i - 1; j != 5; j--) {
                if (!isPrime(j) || !concatPrimes(i, j)) {
                    continue;
                }
                for (int k = j - 1; k != 4; k--) {
                    if (!isPrime(k) || !concatPrimes(i, j, k)) {
                        continue;
                    }
                    for (int l = k - 1; l != 3; l--) {
                        if (!isPrime(l) || !concatPrimes(i, j, k, l)) {
                            continue;
                        }
                        for (int m = l - 1; m != 2; m--) {
                            if (!isPrime(m)) {
                                continue;
                            }
                            if (concatPrimes(i, j, k, l, m)) {
                                solution[0] = i;
                                solution[1] = j;
                                solution[2] = k;
                                solution[3] = l;
                                solution[4] = m;
                                // SUCCEEDED: {8389, 6733, 5701, 5197, 13}
                                // ENTER INTO PE: 26033
                                foundSolution = true;
                                end = new Time(System.currentTimeMillis());
                                System.out.println(end.getTime() - start.getTime() + " ms to execute.");
                                System.out
                                        .println("SUCCEEDED: {" + i + ", " + j + ", " + k + ", " + l + ", " + m + "}");
                                System.out.println("ENTER INTO PE: " + (i + j + k + l + m));

                            } else {
                                // System.out.println("Failed: {" + i + ", " + j + ", " + k + ", " + l + ", " +
                                // m + "}");
                                // Thread.sleep(1);
                            }
                        }
                    }
                }
            }
        }
        input.close();
    }

    /**
     * Determines if five primes satisfy PE60's condition.
     * 
     * @param a Prime 1
     * @param b Prime 2
     * @param c Prime 3
     * @param d Prime 4
     * @param e Prime 5
     * @return true if this satisfies the problem, otherwise false.
     */
    private static boolean concatPrimes(int a, int b, int c, int d, int e) {
        // if (!isPrime(a) || !isPrime(b) || !isPrime(c) || !isPrime(d) || !isPrime(e))
        // {
        // return false;
        // }
        if (a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e) {
            return false;
        }
        if (!isPrime(Integer.decode("" + a + b)))
            return false;
        if (!isPrime(Integer.decode("" + a + c)))
            return false;
        if (!isPrime(Integer.decode("" + a + d)))
            return false;
        if (!isPrime(Integer.decode("" + a + e)))
            return false;

        if (!isPrime(Integer.decode("" + b + a)))
            return false;
        if (!isPrime(Integer.decode("" + b + c)))
            return false;
        if (!isPrime(Integer.decode("" + b + d)))
            return false;
        if (!isPrime(Integer.decode("" + b + e)))
            return false;

        if (!isPrime(Integer.decode("" + c + a)))
            return false;
        if (!isPrime(Integer.decode("" + c + b)))
            return false;
        if (!isPrime(Integer.decode("" + c + d)))
            return false;
        if (!isPrime(Integer.decode("" + c + e)))
            return false;

        if (!isPrime(Integer.decode("" + d + a)))
            return false;
        if (!isPrime(Integer.decode("" + d + b)))
            return false;
        if (!isPrime(Integer.decode("" + d + c)))
            return false;
        if (!isPrime(Integer.decode("" + d + e)))
            return false;

        if (!isPrime(Integer.decode("" + e + a)))
            return false;
        if (!isPrime(Integer.decode("" + e + b)))
            return false;
        if (!isPrime(Integer.decode("" + e + c)))
            return false;
        if (!isPrime(Integer.decode("" + e + d)))
            return false;
        return true;
    }

    private static boolean concatPrimes(int a, int b, int c, int d) {
        // if (!isPrime(a) || !isPrime(b) || !isPrime(c) || !isPrime(d) || !isPrime(e))
        // {
        // return false;
        // }
        if (a == b || a == c || a == d || b == c || b == d) {
            return false;
        }
        if (!isPrime(Integer.decode("" + a + b)))
            return false;
        if (!isPrime(Integer.decode("" + a + c)))
            return false;
        if (!isPrime(Integer.decode("" + a + d)))
            return false;

        if (!isPrime(Integer.decode("" + b + a)))
            return false;
        if (!isPrime(Integer.decode("" + b + c)))
            return false;
        if (!isPrime(Integer.decode("" + b + d)))
            return false;

        if (!isPrime(Integer.decode("" + c + a)))
            return false;
        if (!isPrime(Integer.decode("" + c + b)))
            return false;
        if (!isPrime(Integer.decode("" + c + d)))
            return false;

        if (!isPrime(Integer.decode("" + d + a)))
            return false;
        if (!isPrime(Integer.decode("" + d + b)))
            return false;
        if (!isPrime(Integer.decode("" + d + c)))
            return false;
        return true;
    }

    private static boolean concatPrimes(int a, int b, int c) {
        // if (!isPrime(a) || !isPrime(b) || !isPrime(c) || !isPrime(d) || !isPrime(e))
        // {
        // return false;
        // }
        if (a == b || a == c || b == c) {
            return false;
        }
        if (!isPrime(Integer.decode("" + a + b)))
            return false;
        if (!isPrime(Integer.decode("" + a + c)))
            return false;

        if (!isPrime(Integer.decode("" + b + a)))
            return false;
        if (!isPrime(Integer.decode("" + b + c)))
            return false;

        if (!isPrime(Integer.decode("" + c + a)))
            return false;
        if (!isPrime(Integer.decode("" + c + b)))
            return false;
        return true;
    }

    private static boolean concatPrimes(int a, int b) {
        if (a == b)
            return false;
        // if(!isPrime(a) || !isPrime(b))
        // return false;
        if (!isPrime(Integer.decode("" + a + b)))
            return false;
        if (!isPrime(Integer.decode("" + b + a)))
            return false;
        return true;
    }

    private static boolean isPrime(long n) {
        return BigInteger.valueOf(n).isProbablePrime(7);
    }
}