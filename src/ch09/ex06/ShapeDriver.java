package ch09.ex06;

import java.util.Scanner;

public class ShapeDriver
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Cube cube = new Cube(2);
        System.out.println(cube.calcVolume());
        System.out.println(cube.calcSArea() );
        System.out.println(cube.calcCircum());
        
        input.close();
    }
}