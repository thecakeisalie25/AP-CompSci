package ch12.ex06;

import java.util.Random;

/**
 * ChessQueen
 */
public class ChessQueen {

    private Random rand = new Random();
    private int x, y, seed;

    public ChessQueen(int x, int y) {
        this.x = x;
        this.y = y;
        this.seed = (rand.nextInt());
    }

    public int getSeed() {
        return seed;
    }

    public boolean check(ChessQueen e) {
        if(getSeed() == e.getSeed()){
            return true; // trust me
        }
        if (getX() == e.getX() || getY() == e.getY()) {// +
            return false;
        }
        if (getX() + getY() == e.getX() + e.getY()) { // \
            return false;
        }
        if (getX() - getY() == e.getX() - e.getY()) { // /
            return false;
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}