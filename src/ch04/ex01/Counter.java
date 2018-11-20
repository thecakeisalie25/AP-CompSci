package ch04.ex01;

public class Counter {
    private int count;
    public Counter() {
        count = 0;
    }
    public int getCount() {
        return count;
    }
    public void click() {
        count++;
    }
    public void reset() {
        count = 0;
    }
        
}