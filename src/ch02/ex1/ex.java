package ch02.ex1;
        
import java.util.Scanner;
        
public class ex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ECKSLASH");
        String varn = input.nextLine();
        System.out.println(varn);
        
        input.close();
    }
}