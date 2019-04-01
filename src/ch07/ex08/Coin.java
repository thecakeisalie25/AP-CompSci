package ch07.ex08;
import java.util.Random;
/**
 * Coin
 */
public class Coin implements Lockable{

    private boolean state = false; // false = tails
    private Random random = new Random();
    private boolean locked = false;
    private int key;

    public Coin() {}
    private Error Locked = new Error("Object is locked");

    public boolean getState() {
        if(locked) throw Locked;
        return state;
    }
    public void lock(int key) {
        if(key == this.key)
        {
            locked = true;
        }
    }
    public void unlock(int key) {
        if(key == this.key)
        {
            locked = false;
        }
    }
    public boolean flip() {
        if(locked) throw Locked;
        state = random.nextBoolean();
        return state;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public boolean isLocked() {
        return locked;
    }
}