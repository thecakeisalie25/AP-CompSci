package ch05.ex05;
        
import java.util.ArrayList;
import java.util.Scanner;
        
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> pal = new ArrayList<Character>();
        ArrayList<Character> lap = new ArrayList<Character>();
        for(Character i : input.nextLine().replaceAll("[\\., \\n\\t!@#$%^&*()?]", "").toUpperCase().toCharArray())
        {
            pal.add(i);
        }
        for (int i = pal.size(); i > 0; i--) {
            lap.add(pal.get(i-1));
        }

        System.out.println(pal.equals(lap)?"Yep, Palindrome.":"Nope.");

        input.close();
    }
}