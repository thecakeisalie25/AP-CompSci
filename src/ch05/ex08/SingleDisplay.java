package ch05.ex08;

import java.util.Random;

/**
 * SingleDisplay
 */
public class SingleDisplay {

    private int display = 0;
    private Random rand = new Random();

    public SingleDisplay() {
        spin();
    }
    
    public int spin() {
        setDisplay(rand.nextInt(10));
        return getDisplay();
    }

    /**
     * @return the display
     */
    public int getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(int display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return String.valueOf(getDisplay());
    }

}