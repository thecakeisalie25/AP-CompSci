package ch10.ex03;
        
import java.util.Scanner;
        
public class Drv
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Speaker[] b = {new HomelessMan(), new Obama(), new MLK()};
        for (Speaker e : b) {
            e.speak();
        }
        input.close();
    }
}