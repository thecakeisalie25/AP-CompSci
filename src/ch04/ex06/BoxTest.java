package ch04.ex06;
        
import java.util.Scanner;
        
public class BoxTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Box box1 = new Box(100, 100, 100, true);
        Box box2 = new Box(10, 30, 24, false);
        Box box3 = new Box(0, 0, -4.12395);

        box2.setIsFull(true);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        
        input.close();
    }
}