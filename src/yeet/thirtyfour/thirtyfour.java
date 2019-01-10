package yeet.thirtyfour;

import java.util.ArrayList;

public class thirtyfour {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>(); // create an empty list of numbers
        /**
         * Set a variable called b equal to zero
         */
        int b = 0;
        for (int i = 0; i < 10; i++) { 
            /** 
             * repeat the following code once for each value of i in the range 0-9 .
             */
            for (int j = 0; j < 10; j++) {
                /**
                 * repeat the following code once for each value of j in the range 0-9.
                 */
                for (int k = 0; k < 10; k++) {
                    /**
                     * repeat the following code once for each value of k in the range 0-9.
                     */
                    for (int l = 0; l < 10; l++) {
                        /**
                         * repeat the following code once for each value of l in the range 0-9.
                         * the combination of the above 4 loops ends up running the code in this loop
                         * once for every possible combination of i, j, k, and l for 0-9.
                         * 
                         * the next line adds the sum of i + j + k + l to the list "test".
                         */
                        test.add(i + j + k + l);
                        /**
                         * the next line adds one to "b", by the end this ends up making b = 10,000
                         */
                        b++;
                    }
                }
            }
        }
        /**
         * The following code runs once for every number 0-33
         */
        for (int g = 0; g < 34; g++) { 
            /**
             * remove every instance of g from the list
             * 
             * this code ends up removeing every number less than 34 from the list
             */
            while(test.remove(new Integer(g))){}
        }
        /**
         * print the size of the list, which ends up being 15.
         * print b, which ends up being 10,000
         */
        System.out.println(test.size());
        System.out.println(b);
    }
}

/**
 * Running this code ends up having the following output:
 * 
 * 15
 * 10000
 */