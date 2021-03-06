package ch05.ex11;

/**
 * PairOfDice
 * @author Larson Ashcroft
 * @see Die.java
 * @see RollingDice2.java
 */

public class PairOfDice {

    Die die1 = new Die();
    Die die2 = new Die();

    public int getDie1() {
        return die1.getFaceValue();
    }
    
    public int getDie2() {
        return die2.getFaceValue();
    }

    public int roll() {
        die1.roll();
        die2.roll();
        return getDie1() + getDie2();
    }

    public int getCombo() {
        return die1.getFaceValue() + die2.getFaceValue();
        
    }

    /**
     * @param die1 the die1 to set
     */
    public void setDie1(int faceval) {
        if(faceval > 6)
        {faceval = 6;}
        while (faceval != die1.getFaceValue()) {
            die1.roll();
        }
    }

    /**
     * @param die2 the die2 to set
     */
    public void setDie2(int faceval) {
        if(faceval > 6)
        {faceval = 6;}
        while (faceval != die2.getFaceValue()) {
            die2.roll();
        }
    }

}