package ch07.project;
        
import java.util.Scanner;

import javax.swing.JOptionPane;
        
public class DiceGame
{
    private static final int SCORE_REQUIRED = 1000;
    private static final int NUM_GAMES = 5;
    private static final boolean CHEAT_MODE = false;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DieCup dice = new DieCup(CHEAT_MODE);
        boolean keepPlaying = true;
        int score = 0;
        

        do {
            score = 0;
            for (int i = 1; i <= NUM_GAMES; i++) {
                dice.roll();
                dice.holdSame();
                JOptionPane.showMessageDialog(null,
                    "Round 1 results:\n" + dice,
                    "Game " + i + ": Round 1",
                    JOptionPane.PLAIN_MESSAGE);
                dice.roll();
                dice.holdSame();
                JOptionPane.showMessageDialog(null,
                    "Round 2 results:\n" + dice,
                    "Game " + i + ": Round 2",
                    JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null,
                    "Score for this game: " + dice.getScore(),
                    "Game " + i + ": Score",
                    JOptionPane.PLAIN_MESSAGE);
                score += dice.getScore();
                JOptionPane.showMessageDialog(null,
                    "Total score so far: "+ score,
                    "Game " + i + ": Total Score",
                    JOptionPane.PLAIN_MESSAGE);
                dice.unHold();
            }
            JOptionPane.showMessageDialog(null,
                "You " + (score >= SCORE_REQUIRED?"win!":"lose."),
                "Total Score: " + score,
                JOptionPane.PLAIN_MESSAGE);
            // Handle if user wants to play game again
            if(JOptionPane.showConfirmDialog(null,
            "Want to play again?",
            "New Game?",
            JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                keepPlaying = false;
            }
        } while (keepPlaying);

        input.close();
    }
}