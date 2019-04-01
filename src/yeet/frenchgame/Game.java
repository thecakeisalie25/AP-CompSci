package yeet.frenchgame;
        
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
        
public class Game
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Player> players = new ArrayList<Player>();
        int numPlayers, numQuestions;

        try {
            numPlayers = Integer.decode(JOptionPane.showInputDialog(null, "How many players?", "Player Count", JOptionPane.PLAIN_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n\nError description:\nPlease enter a number.");
            numPlayers = 1000;
            System.exit(1);
        }

        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(JOptionPane.showInputDialog(null, "Player " + (i+1) + "'s name?")));
        }

        try {
            numQuestions = Integer.decode(
                    JOptionPane.showInputDialog(null, "How many questions per player?", "Question Count", 
                        JOptionPane.PLAIN_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n\nError description:\nPlease enter a number.");
            numQuestions = 1000;
            System.exit(1);
        }

        for (int i = 1; i <= numQuestions; i++) {
            for (Player e : players) {
                e.poseQuestion();
            }
            String leaderboard = "Scores so far:\n";
            for (Player e : players) {
                leaderboard+= "\n" + e;
            }
            JOptionPane.showMessageDialog(null, leaderboard);
        }
        players.sort(new Player());
        String leaderboard = "Final Scores:\n";
        int c = 1;
        for (Player e : players) {
            leaderboard += "\n" + c++ + ". " + e;
        }
        JOptionPane.showMessageDialog(null, leaderboard);
        input.close();
    }
}