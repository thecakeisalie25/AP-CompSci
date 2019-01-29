package ch08.ex07;

/**
 * Card
 */
public class Card {
    String suit;
    String place;

    public Card(int state) {
        switch (state / 4) {
            case 0:
                place = "A";
                break;
            case 1:
                place = "2";
                break;
            case 2:
                place = "3";
                break;
            case 3:
                place = "4";
                break;
            case 4:
                place = "5";
                break;
            case 5:
                place = "6";
                break;
            case 6:
                place = "7";
                break;
            case 7:
                place = "8";
                break;
            case 8:
                place = "9";
                break;
            case 9:
                place = "10";
                break;
            case 10:
                place = "J";
                break;
            case 11:
                place = "Q";
                break;
            case 12:
                place = "K";
                break;
        }
        switch (state % 4) {
            case 0:
                suit = "Hearts";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Spades";
                break;
            case 3:
                suit = "Clubs";
                break;
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }
    @Override
    public String toString() {
        return "The " + place + " of " + suit + ".";
    }
}