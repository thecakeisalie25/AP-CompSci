package ch09.ex07;
        
import java.util.Scanner;
        
public class TeslaCar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        LED led = new LED();
        System.out.println(led.getVoltage());
        
        input.close();
    }
}