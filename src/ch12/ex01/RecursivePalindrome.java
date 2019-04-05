package ch12.ex01;
        
import java.util.Scanner;
        
public class RecursivePalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string to be tested");
        String checked = input.nextLine().replaceAll("[\\., \\n\\t!@#$%^&*()?]", "").toUpperCase();
        System.out.println(check(checked));
        input.close();
    }
    // True if and only if the string is a palindrome.
    private static boolean check(String name) {
        if(name.length() == 1)
        {
            return true;
        }
        if(name.charAt(0) != name.charAt(name.length() - 1))
        {
            return false;
        }
        return check(name.substring(1, name.length() - 1));
    }
}