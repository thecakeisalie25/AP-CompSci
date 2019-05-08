package yeet.frenchgame2;

import java.util.Random;

/**
 * Category
 */
public abstract class Category {

    protected Random rand;
    protected String description;

    public Category() {
        rand = new Random();
    }

    public abstract Question askQuestion();
    public String getDescription() {
        return description;
    }
    public boolean testAnswer(Question question, String answer){
        String fQuestion = question.getAnswer().toUpperCase();
        String fAnswer = answer.toUpperCase();
        return fQuestion.equals(fAnswer);
    }
}