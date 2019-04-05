package ch09.ex06;

import java.awt.Point;

/**
 * Shape
 */
public abstract class Shape {

    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * @return the p3
     */
    public Point getP3() {
        return p3;
    }

    /**
     * @param p3 the p3 to set
     */
    public void setP3(Point p3) {
        this.p3 = p3;
    }

    /**
     * @return the p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * @return the p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    

}