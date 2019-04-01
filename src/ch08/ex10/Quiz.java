package ch08.ex10;

import java.util.ArrayList;
import java.util.Scanner;
        
public class Quiz
{
    public static void main(String[] args) {
        Quiz foo = new Quiz();
        foo.add(new Question("Yeet", "Yank", 10));
        foo.add(new Question("q", "a", 1));
        foo.add(new Question("how many is purple", "e", 1000));
        foo.add(new Question("q2", "a2", 20));
        foo.add(new Question("aaa", "bbb", 30));
        foo.add(new Question("c", "d", 40));
        foo.giveQuestions(5, 50);
    }
    Scanner input = new Scanner(System.in);
    ArrayList<Question> questions;
    public Quiz() {
        questions = new ArrayList<Question>();
    }
    public void add(Question q) {
        questions.add(q);
    }
    public void giveQuestions(){
        giveQuestions(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void giveQuestions(int minValue, int maxValue) {
        int score = 0;
        for (Question e : questions) {
            // if (1 == 1){
                System.out.println("Q: " + e.getQuestion());
                if(input.nextLine().equalsIgnoreCase(e.getAnswer())){
                    score++;
                }
            // }
        }
        System.out.println("Score: " + score + ".");
    }
    
}