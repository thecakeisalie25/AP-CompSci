package ch04.ex05;
        
import java.util.Scanner;
        
public class CarTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Car car1 = new Car(2012, "DriveBeep", "Fast-o");
        Car car2 = new Car(1823, "DriveBeep", "Model B");
        Car car3 = new Car(2024, "DriveBeep", "Futura");

        System.out.println(car1.getAge() + " is car1's age.");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        
        input.close();
    }
}