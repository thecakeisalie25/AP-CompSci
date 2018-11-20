package ch04.project;

import java.awt.geom.Point2D;
// import java.text.DecimalFormat;

/**
 * Line
 */
public class Line {

    private Point2D.Double p1, p2;

    // private DecimalFormat truncate = new DecimalFormat("0.########");

    public Line(Point2D.Double p1, Point2D.Double p2) {
        setP1(p1);
        setP2(p2);
    }
    
    public static double calculateDistance(Point2D.Double p1, Point2D.Double p2) { // Working
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double calculateDistance() { // Working
        return Math.sqrt( Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double calculateDistance(Point2D.Double p0) { // I don't know how this works but sure why not
        return Math.abs((p2.getY()-p1.getY()) * p0.getX() - (p2.getX() - p1.getX()) * p0.getY() + (p2.getX()*p1.getY()) - (p2.getY()*p1.getX())) / Math.sqrt(Math.pow((p2.getY()-p1.getY()), 2) + Math.pow((p2.getX()-p1.getX()),2));
    }

    public double CalculateSlope() { // Working
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public double CalculateYIntercept() { // Working
        return p1.getY() - (this.CalculateSlope() * p1.getX());
    }

    public String getEquation() { // Working
        return "Y = " + this.CalculateSlope() + "X + " + this.CalculateYIntercept();
    }

    public String toString() { // hmm i wonder if this works uh yes it does duh
        return getEquation();
    }

    public Line getParallel(Point2D.Double p0) {
        return new Line(new Point2D.Double(p0.getX(), p0.getY()), new Point2D.Double((int)p0.getX() + 1, (p0.getY() + this.CalculateSlope())));
    }

    public Line getPerpendicular(Point2D.Double p0) {
        double reciprocal = 1.0 / this.CalculateSlope();
        reciprocal = 0-reciprocal;
        return new Line(new Point2D.Double(p0.getX(), p0.getY()), new Point2D.Double(p0.getX() + 1, p0.getY() + reciprocal));
    }

    public String getTangentCircle(Point2D.Double p0) {
        double distance = this.calculateDistance(p0);
        return Math.pow(distance, 2) + " = (X - " + p0.getX() + ")^2 +  (Y - " + p0.getY() + ")^2";
        
        
    }
    /**
     * @return the p2
     */
    public Point2D.Double getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point2D.Double p2) {
        this.p2 = p2;
    }

    /**
     * @return the p1
     */
    public Point2D.Double getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Point2D.Double p1) {
        this.p1 = p1;
    }


}