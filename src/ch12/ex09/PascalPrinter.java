package ch12.ex09;

import java.util.ArrayList;
import java.util.Scanner;
        
public class PascalPrinter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        System.out.print("> ");
        int varname = input.nextInt();
        printFull(varname);
        
        input.close();
    }
    public static void printFull(int lines) {
        // 0 prints nothing, 1 prints line 1, 2 prints 1 and 2.
        if(lines != 1) printFull(lines-1);
        System.out.println(printLine(lines));
    }

    private static ArrayList<Integer> printLine(int e) {
        ArrayList<Integer> line = new ArrayList<Integer>();
        line.ensureCapacity(e);
        if(e == 1) {
            line.add(1);
            return line;
        }
        for (int i = 0; i < e; i++) {
            line.add(null);
        }
        line.set(e-1, 1);
        line.set(0, 1);
        ArrayList<Integer> prev = printLine(e-1);
        for (int i = 1; i < e-1; i++) {
            int b = 0;
            b += prev.get(i);
            b += prev.get(i-1);
            line.set(i, b);
        }
        return line;
    }
}
/*

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
0 1 2 3 4 
 3 = 2 + 3
 4 = 3 + 4(0)
 2 = 1 + 2
 n[x] = n-1[x-1] + n-1[x]

*/