package ch07.project;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Die
 */
public class Die {
    private int value;
    private boolean isSaved = false, cheatMode;
    private Random rand = new Random();
    private long seed;

    public Die(boolean cheatMode) {
        setValue(0);
        setSeed(System.nanoTime());
        setCheatMode(cheatMode);
    }
    //#region Getters, Setters, Equals.
    /**
     * @return the cheatMode
     */
    public boolean isCheatMode() {
        return cheatMode;
    }

    /**
     * @param cheatMode the cheatMode to set
     */
    public void setCheatMode(boolean cheatMode) {
        this.cheatMode = cheatMode;
    }

    public boolean equals(Die die) {
        if (seed == die.seed) {
            return true;
        }
        return false;
    }

    /**
     * @return the seed
     */
    public long getSeed() {
        return seed;
    }

    /**
     * @param seed the seed to set
     */
    public void setSeed(long seed) {
        this.seed = seed;
    }

    /**
     * @return the isSaved
     */
    public boolean isSaved() {
        return isSaved;
    }

    /**
     * @param isSaved the isSaved to set
     */
    public void setSaved(boolean isSaved) {
        this.isSaved = isSaved;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
//#endregion
    
    public void roll() {
        if(!isSaved){
            setValue(rand.nextInt(6) + 1);
            if(cheatMode){
                setValue(Integer.decode(JOptionPane.showInputDialog("Set die value", value)));
            }
        }
    }

    public void flip() {
        if(value == 6)
        {
            value = 0;
        }
        value++;
    }
    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}