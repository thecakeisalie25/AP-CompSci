package ch09.ex06;

import java.awt.Point;
import java.util.Scanner;
        
public class ShapeDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Cube cube = new Cube(new Point(2, 3), new Point(3, 2));
        System.out.println(cube.getP1());
        
        input.close();
    }
}