package ch03.ex1;
        
import java.util.Random;
import java.util.Scanner;
        
public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("First name");
        String fname = input.nextLine();
        System.out.println("Last name");
        String lname = input.nextLine();

        String result = fname.substring(0, 1);
        result += lname.substring(0, 5);
        result += new Random().nextInt(100 - 10) + 10;
        
        System.out.println(result);
        input.close();
    }
}