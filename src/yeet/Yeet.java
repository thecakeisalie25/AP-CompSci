package yeet;

/**
 * Yeet
 */
public class Yeet {

    private int yeet1;
    public Yeet(int yeet1) {
        this.yeet1 = yeet1;
    }
    public Yeet returnY2() {
        return new Yeet(yeet1+1);
    }
    public String toString() {
        return "yeet = " + yeet1;
    }
}