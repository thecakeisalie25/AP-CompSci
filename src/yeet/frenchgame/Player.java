package yeet.frenchgame;

import javax.swing.JOptionPane;

import java.util.Comparator;
import java.util.Random;
/**
 * Player
 */
public class Player implements Comparable<Player>, Comparator<Player> {

    private int score, difficulty;
    private String name;
    private Random rand = new Random();
    private static final String DIFFICUTY_TEXT = "Please choose a difficulty:\n\nEasy: 1-69 (10 pts)\nMedium: 1-999 (15 pts)\nHard: 1-999,999 (25 pts)\n\nYou can change this later.";
    
    public Player(String name) {
        setScore(0);
        setName(name);
        changeDifficulty();
    }
    public Player(){ // ONLY FOR SORTING

    }
    public int compare(Player p1, Player p2) {
        return p2.getScore() - p1.getScore();
    }
    public int compareTo(Player p2) {
        return score - p2.getScore();
    }
    public void changeDifficulty() {
        String[] options = {"Easy","Medium","Hard"};
        difficulty = JOptionPane.showOptionDialog(null, DIFFICUTY_TEXT, "Select Difficulty: ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
    }
    public void poseQuestion() {
        int question;
        String difficultyString;
        difficultyString = diff2String();
        String message = getName() + "'s difficulty: " + difficultyString + ". Change difficulty?";
        if(JOptionPane.showConfirmDialog(null, message, "Want to change difficulty?",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {
            changeDifficulty();
        }
        difficultyString = diff2String();
        switch(difficulty)
        {
            case 0:
                question = rand.nextInt(69) + 1;
                break;
            case 1:
                question = rand.nextInt(999) + 1;
                break;
            case 2:
                question = rand.nextInt(999999) + 1;
                break;
            default: question = 1024; System.err.println("Error in question");
        }
        String answer = JOptionPane.showInputDialog(null, getName() + ": Please translate the following into numerals:\n" + Converter.convert6Digit(question), difficultyString + " question for " + getName() + ".", JOptionPane.QUESTION_MESSAGE);
        if(Integer.toString(question).equals(answer))
        {
            score += difficulty == 0 ? 10 : difficulty == 1 ? 15 : 25;
            JOptionPane.showMessageDialog(null, "You got it right!\nYour score is now " + getScore() + ".");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry. The answer was " + question + ".\nYour score is still " + getScore() + ".");            
        }
    }
	private String diff2String() {
		String difficultyString;
		switch(difficulty)
        {
            case 0: difficultyString = "Easy"; break; // 10
        case 1:
            difficultyString = "Medium";
            break; // 15
        case 2:
            difficultyString = "Hard";
            break; // 25
        default:
            difficultyString = "Error";
        }
        return difficultyString;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return getName() + ": " + getScore();
    }
}