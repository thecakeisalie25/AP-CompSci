package ch09.ex06;

/**
 * Cube
 */
public class Cube extends Shape {


    public Cube(int sidelength) {
        super(sidelength, sidelength, sidelength);
    }
    @Override
    public int calcVolume() {
        return getLength() * getWidth() * getHeigth();
    }
    
    public int calcCircum() {
        return getLength() * 4;
    }

    public int calcSArea() {
        return 6 * (getLength() * getLength());
    }
}