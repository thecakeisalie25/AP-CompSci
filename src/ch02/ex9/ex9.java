package ch02.ex9;
        
import java.util.Scanner;
        
public class ex9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input seconds");
        int seconds = input.nextInt();
        
        int hours = seconds / (60*60);

        seconds -= hours * 60 * 60;

        int minutes =  seconds / 60;

        seconds -= minutes * 60;

        System.out.println(hours + " Hours, " + minutes + " Minutes, and " + seconds + " Seconds.");

        input.close();
    }
}