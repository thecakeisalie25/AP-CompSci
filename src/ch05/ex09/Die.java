package ch05.ex09;

// This class isn't mine. Any errors are the result of the original @author.

public class Die 
{
    private int faceValue;

    public void setFaceValue(int thingy) {
        faceValue = thingy>6||thingy<1?faceValue:thingy;
    }

    public Die() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "faceValue: " + faceValue;
    }

}