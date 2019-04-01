package ch04.ex03;

public class Sphere {
    private double diameter;
    private double volume;
    private double sArea;

    public Sphere(double diamIn) {
        diameter = diamIn;
        calcVol();
        calcSArea();
    }
    
    private void calcVol() {
        volume = Math.pow(diameter/2, 3.0) * Math.PI * (4.0/3.0);
    }

    private void calcSArea() {
        sArea = 4.0 * Math.PI * Math.pow(diameter/2, 2);
    }

    public double getVolume() {
        calcVol();
        return volume;
    }

    public double getSArea() {
        calcSArea();
        return sArea;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diamIn) {
        diameter = diamIn;
        calcVol();
        calcSArea();
    }

    public String toString() {
        return "A Sphere with diameter:" + getDiameter() + " and surface area of:" + getSArea() + " And volume of:" + getVolume();
    }
}