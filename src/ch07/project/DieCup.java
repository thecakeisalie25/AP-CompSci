package ch07.project;

import java.util.ArrayList;

/**
 * DieCup
 */
public class DieCup {
    private ArrayList<Die> dice;

    public DieCup(boolean cheatMode) {
        dice = new ArrayList<Die>(5);
        for (int i = 0; i < 5; i++) {
            dice.add(new Die(cheatMode));
        }
    }

    public void roll() {
        for (Die e : dice) {
            e.roll();
        }
    }

    public void holdSame() {
        for (Die e : dice) {
            for (Die f : dice) {
                if (e.equals(f)) {
                    continue;
                } else if (e.getValue() == f.getValue()) {
                    e.setSaved(true);
                    f.setSaved(true);
                }
            }
        }
    }

    public void unHold() {
        for (Die e : dice) {
            e.setSaved(false);
        }
    }

    public ArrayList<Die> getHeldDice() {
        ArrayList<Die> held = new ArrayList<Die>();
        for (Die e : dice) {
            if (e.isSaved()) {
                held.add(e);
            }
        }
        return held;
    }

    public ArrayList<Integer> getHeldInts() {
        ArrayList<Integer> held = new ArrayList<Integer>();
        for (Die e : getHeldDice()) {
            held.add(e.getValue());
        }
        return held;
    }

    public static int calculateScore(ArrayList<Integer> held) {
        int score = 0;
        for (int e : held) {
            score += e;
        }
        return score * 10;
    }

    public int getScore() {
        return calculateScore(getHeldInts());
    }

    @Override
    public String toString() {
        String r = "";
        for (Die e : dice) {
            r += "[" + e.getValue() + "]";
            r += e.isSaved() ? "* " : "  ";
        }
        return r;
    }
}