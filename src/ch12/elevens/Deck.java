package ch12.elevens;

import java.util.ArrayList;

/**
 * Deck
 */
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>(52);
    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                cards.add(new Card(i, j));
            }
        }
        shuffle();
    }
    public void shuffle() {
        cards.sort(null);
    }
    public Card pop() {
        Card e = cards.get(0);
        cards.remove(0);
        return e;
    }
    public int getCount() {
        return cards.size();
    }
}