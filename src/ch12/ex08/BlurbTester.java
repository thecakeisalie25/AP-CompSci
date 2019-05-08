package ch12.ex08;

import java.util.Scanner;
        
public class BlurbTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input blurb");
        System.out.print("> ");
        String tested = input.nextLine();
        System.out.println(tested);
        System.out.println(detectBlurb(tested, 0));
        
        input.close();
    }
    public static boolean detectBlurb(String b, int is) {
        if(is == b.length()) return true;
        if(b.charAt(0) != 'x') return false; // first
        if(b.replaceFirst("xy*", "").charAt(0) != 'q') return false; // first who
        String stg3 = b.replaceAll("q[zd]xy*", "").replaceFirst("xy*", ""); // all who
        if (!stg3.isEmpty()) return false; // after check
        return detectBlurb(b, is+1); // good

    }
}