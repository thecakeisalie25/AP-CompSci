package ch04.ex04;
        
import java.util.Scanner;
        
public class Kennel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Dog dog1 = new Dog(10, "Sir Barkington");
        System.out.println(dog1);
        dog1.setAge(30);
        System.out.println(dog1);

        Dog dog2 = new Dog(110, "Peter Barker");
        System.out.println(dog2);
        dog2.setAge(330);
        System.out.println(dog2);
        
        input.close();
    }
}