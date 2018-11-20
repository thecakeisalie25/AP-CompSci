package ch05.ex06;
import java.util.Random;
/**
 * Coin
 */
public class Coin {

    private boolean state = false; // false = tails
    private Random random = new Random();

    public Coin() 
    {

    }
    public boolean getState() {
        return state;
    }
    public boolean flip() {
        state = random.nextBoolean();
        return state;
    }
}