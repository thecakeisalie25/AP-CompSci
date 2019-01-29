package ch08.ex07;

import java.util.ArrayList;
import java.util.Random;
        
public class DeckOfCards
{
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> shuf = new ArrayList<Card>();
    Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(new DeckOfCards());
    }

    public DeckOfCards() {
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            
        }
    }

    @Override
    public String toString() {
        String r = "";
        for (Card e : cards) {
            r+=e.toString() + "\n";
        }
        return r;
    }
}