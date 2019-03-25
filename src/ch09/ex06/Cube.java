package ch09.ex06;

import java.awt.Point;

/**
 * Cube
 */
public class Cube extends Shape {

    public Cube(Point cornerA, Point cornerB) {
        super();
        setP1(cornerA);
        setP3(cornerB);
        setP2(new Point(0,0));
    }
}