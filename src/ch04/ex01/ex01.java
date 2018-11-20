package ch04.ex01;
        
import java.util.Scanner;
        
public class ex01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.click();
        c1.click();
        System.out.println("C1:");
        System.out.println(c1.getCount());
        System.out.println("C2:");
        System.out.println(c2.getCount());
        c1.reset();
        System.out.println("C1:");
        System.out.println(c1.getCount());
        input.close();
    }
}