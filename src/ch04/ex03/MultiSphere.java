package ch04.ex03;
        
import java.util.Scanner;
        
public class MultiSphere
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Sphere sphere1 = new Sphere(12.3);
        Sphere sphere2 = new Sphere(45.6);
        Sphere sphere3 = new Sphere(78.9);

        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println(sphere3);

        sphere1.setDiameter(6.0);
        System.out.println();
        System.out.println(sphere1);
        
        input.close();
    }
}