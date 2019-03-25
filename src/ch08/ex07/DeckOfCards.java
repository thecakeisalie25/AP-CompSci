package ch08.ex07;

import java.util.ArrayList;
import java.util.Random;
        
public class DeckOfCards
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Card> shuf = new ArrayList<Card>();
    Random rand = new Random();
    int fresh = 0;

    public static void main(String[] args) {
        DeckOfCards x = new DeckOfCards();
        // System.out.println(x);
        x.shuffle();
        System.out.println(x);
        System.out.println("Top card is: " + x.pop());
        System.out.println("Top card is: " + x.pop());
        System.out.println("Top card is: " + x.pop());
    }

    public DeckOfCards() {
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }
    }

    public Card pop() {
        Card remove = cards.remove(0);
        cards.add(remove);
        fresh--;
        System.out.println(fresh + " cards remaining");
        return remove;
    }

    public void shuffle() {
        fresh = 52;
        for (int i = 0; i < 52; i++) {
            shuf.add(cards.remove(rand.nextInt(cards.size())));
        }
        cards = shuf;
        shuf = new ArrayList<Card>();
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