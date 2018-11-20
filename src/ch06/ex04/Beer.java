package ch06.ex04;
        
import java.util.Scanner;
        
public class Beer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String template = "x bottles of beer on the wall, x bottles of beer, you take one down, pass it around, x bottles of beer on the wall.";

        for (Integer i = 100; i > 0; i--) {
            if (i == 1) {
                template = "x bottle of beer on the wall, x bottle of beer, you take one down, pass it around, x bottle of beer on the wall.";
            }
            System.out.println(template.replace("x", i.toString()));
        }
        
        input.close();
    }
}