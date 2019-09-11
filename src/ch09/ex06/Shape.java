package ch09.ex06;

/**
 * Shape
 */
public abstract class Shape {

    private int length;
    private int width;
    private int heigth;

    public Shape(int l, int w, int h) {
        setLength(l);
        setWidth(w);
        setHeigth(h);
    }

    public abstract int calcVolume();

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}