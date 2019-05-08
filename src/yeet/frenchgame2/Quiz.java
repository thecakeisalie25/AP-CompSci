package yeet.frenchgame2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
        
public class Quiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Category[] categoriesList = {new Numbers(), new Conjugation()};
        ArrayList<Category> categories = new ArrayList<Category>();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
        for (Category e : categoriesList) {
            int checkCat = JOptionPane.showConfirmDialog(null, e.getDescription(), "Add this category?", JOptionPane.YES_NO_OPTION);
            if (checkCat == 0) {
                categories.add(e);
            }
        }
        int[] scores = new int[Integer.decode(JOptionPane.showInputDialog("How many players?"))];
        int questions = Integer.decode(JOptionPane.showInputDialog("How many questions per player?"));
        for (int i = 0; i < questions; i++) {
            for (int j = 0; j < scores.length; j++) {
                int categoryIndex = rand.nextInt(categories.size());
                Category category = categories.get(categoryIndex);

                Question askedQuestion = category.askQuestion();
                
                String answer = JOptionPane.showInputDialog(null, askedQuestion.getQuestion(),
                    "For player " + j,
                    JOptionPane.QUESTION_MESSAGE);

                if(category.testAnswer(askedQuestion, answer))
                {
                    scores[j] += askedQuestion.getPoints();
                    JOptionPane.showMessageDialog(null, "You got it right, player " + j + "! Your score is now " + scores[j]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sorry, player " + j + "! Your score is still " + scores[j]);
                }
            }
        }
        String scorelist = "";
        for (int i = 0; i < scores.length; i++) {
            scorelist += "Player " + i + ": " + scores[i] + ".\n";
        }
        int winner = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[winner] < scores[i]) {
                winner = i;
            }
        }
        JOptionPane.showMessageDialog(null, scorelist, "Congrats, player " + winner + "!" , JOptionPane.INFORMATION_MESSAGE);
        input.close();
    }
}