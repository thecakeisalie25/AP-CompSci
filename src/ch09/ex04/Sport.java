package ch09.ex04;

import java.util.ArrayList;

/**
 * Sports
 */
public abstract class Sport {
    public static void main(String[] args) {
        ArrayList<Sport> arr = new ArrayList<Sport>();
        arr.add(new Basketball());
        arr.add(new Baseball());
        for (Sport e : arr) {
            System.out.println(e.toString());
        }
    }
    public abstract int playSports();
    public String toString(){
        return playSports() + " " + this.getClass().getSimpleName();
    }
}