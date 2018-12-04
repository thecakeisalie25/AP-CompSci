package ch06.ex10;
        
import java.util.ArrayList;
import java.util.Scanner;
        
public class ChristmasSong
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner("you shouldn't see this|first|second|third|fourth|fifth|sixth|seventh|eighth|ninth|tenth|eleventh|twelth");
        ArrayList<String> firstsecond = new ArrayList<String>();
        input.useDelimiter("\\|");
        while (input.hasNext()) {
            firstsecond.add(input.next());
        }
        for (int i = 1; i <= 12; i++) {
            System.out.println("On the " + firstsecond.get(i) + " day of christmas my true love gave to me...");
            switch(i)
            {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("eleven pipers piping,");
                case 10:
                    System.out.println("ten lords a-leaping,");
                case 9:
                    System.out.println("nine ladies dancing,");
                case 8:
                    System.out.println("eight maids a-milking,");
                case 7:
                    System.out.println("seven swans a-swimming,");
                case 6:
                    System.out.println("six geese a-laying,");
                case 5:
                    System.out.println("five golden rings.");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("three French hens,");
                case 2:
                    System.out.println("two turtle doves and");
                case 1:
                    System.out.println("a partridge in a pear tree!");

            }
        }
        
        input.close();
    }
}