package ch07.project;
        
import java.util.Scanner;
        
public class DieDriverTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        DieCup cheat = new DieCup(true);

        cheat.roll();
        System.out.println(cheat);
        cheat.holdSame();
        System.out.println(cheat);
        System.out.println(cheat.getScore());
   
        input.close();
    }
}