package ch06.ex02;
        
import java.util.Scanner;
        
public class StringLine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a line of text.");
        System.out.print("> ");
        String thing = input.nextLine();

        Scanner thingScan = new Scanner(thing);
        thingScan.useDelimiter("");
        while (thingScan.hasNext()) {
            System.out.println(thingScan.next());
        }
        thingScan.close();
        input.close();
    }
}