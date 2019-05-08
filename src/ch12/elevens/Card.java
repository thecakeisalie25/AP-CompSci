package ch12.elevens;

import java.util.Random;

import javax.swing.ImageIcon;

public class Card implements Comparable<Card>
{
    public final int JACK       = 11;
    public final int QUEEN      = 12;
    public final int KING       = 13;

    public final int SPADE      = 1;
    public final int HEART      = 2;
    public final int CLUB       = 3;
    public final int DIAMOND    = 4;
    private int value, suit;
    private int seed;
    public static void main(String[] args) {
        Elevens.main(args);
    }
    public Card(int value, int suit) {
        Random random = new Random();
        seed = random.nextInt();
        setSuit(suit);
        setValue(value);

    }

    /**
     * @return the seed
     */
    public int getSeed() {
        return seed;
    }

    /**
     * @return the suit
     */
    public int getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suit) {
        this.suit = suit;
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

    /**
     * x + y = 11
     * x + y + z = 336
     * @return points that should add up as above
     */
    public int getPoints() {
        if(value <= 10){
            return value;
        }
        return value + 100;
    }

    //! Fix method.
    public ImageIcon name() {
        return new ImageIcon();
    }
    public boolean isRoyal(){
        switch (value) {
            case KING:
            case QUEEN:
            case JACK:
                return true;
            default:
                return false;
        }
    }

    @Override
    public int compareTo(Card e) {
        return new Integer(seed).compareTo(e.getSeed());
    }

    @Override
    public String toString() {
        String string = "The ";
        switch (value) {
            case 1:
                string += "ace";
            break;
            case JACK:
                string += "jack";
            break;
            case QUEEN:
                string += "queen";
            break;
            case KING:
                string += "king";
            break;
            default:
                string += String.valueOf(value);
        }
        string += " of ";
        switch (suit) {
            case SPADE:
                string += "spades";
            break;
            case HEART:
                string += "hearts";
            break;
            case CLUB:
                string += "clubs";
            break;
            case DIAMOND:
                string += "diamonds";
            break;
        }
        return string;
    }
}