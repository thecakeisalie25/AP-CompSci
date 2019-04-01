package ch05.ex09;
        
import java.util.Scanner;
        
public class DieDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Die yeet = new Die();
        yeet.setFaceValue(4);
        System.out.println(yeet.getFaceValue());
        yeet.setFaceValue(0);
        System.out.println(yeet.getFaceValue()); // no
        yeet.setFaceValue(6);
        System.out.println(yeet.getFaceValue());
        yeet.setFaceValue(20);
        System.out.println(yeet.getFaceValue()); // no
        
        input.close();
    }
}