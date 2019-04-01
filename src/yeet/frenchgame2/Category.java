package yeet.frenchgame2;

import java.util.Random;

/**
 * Category
 */
public abstract class Category {

    protected Random rand;
    protected static String description;

    public Category() {
        rand = new Random();
    }

    public abstract Question askQuestion(int Difficulty);
    public static String getDescription() {
        return description;
    }
    public static boolean testAnswer(Question question, String answer){
        return question.getAnswer() == answer;
    }
}