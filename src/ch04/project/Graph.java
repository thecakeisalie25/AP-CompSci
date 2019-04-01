package ch04.project;

import java.awt.geom.Point2D;
import java.util.Scanner;
        
public class Graph
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Line l1 = new Line(new Point(5, -7), new Point(0, 3));
        // System.out.println(l1.calculateDistance());
        // System.out.println(l1.calculateDistance(new Point(-6, -5)));

        Line l1 = new Line(new Point2D.Double(1, 5), new Point2D.Double(6, 17));
        Point2D.Double p0 = new Point2D.Double(50, 5);
        System.out.println(l1.getEquation());
        System.out.println(l1.calculateDistance());
        System.out.println(l1.calculateDistance(p0));
        System.out.println(l1.getParallel(p0));
        System.out.println(l1.getPerpendicular(p0));
        System.out.println(l1.getTangentCircle(p0));
        
        input.close();
    }
}