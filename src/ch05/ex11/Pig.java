package ch05.ex11;
        
import java.util.Scanner;
        
public class Pig
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        PairOfDice dice = new PairOfDice();

        int cScore = 0, hScore = 0, rScore = 0;
        boolean cont = true;

        while(cScore < 100 && hScore < 100)
        {
            System.out.println("Scores so far:");
            System.out.println("Human: " + hScore + " CPU: " + cScore + ".");
            cont = true;
            rScore = 0;
            while (cont) {
                System.out.println("Rolling...");
                for (int i = 0; i < 999999999; i++) {
                    for (int j = 0; j < 99999999; j++) {
                    }
                }
                rScore += dice.roll();
                System.out.println("[" + dice.getDie1() + "], [" + dice.getDie2() + "]");
                if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                    System.out.println("What a shame... ");
                    hScore = 0;
                    rScore = 0;
                    cont = false;
                }
                else if (dice.getDie1() == 1 || dice.getDie2() == 1)
                {
                    System.out.println("That's what happens when you get greedy.");
                    rScore = 0;
                    cont = false;
                }
                else
                {
                    System.out.println("Nice! Your score so far is " + rScore + ". Continue?");
                    switch(input.nextLine().toUpperCase().charAt(0))
                    {
                        case 'Y':
                            break;
                        default:
                            System.out.println("I'm just going to assume that was a no, just to be safe. (y/n)");
                        case 'N':
                            hScore += rScore;
                            System.out.println("Good call. Your total score so far is " + hScore + ".");
                            cont = false;
                            break;
                    }

                }

            }
            cont = true;
            rScore = 0;
            while (cont) {
                System.out.println("Rolling...");
                rScore += dice.roll();
                System.out.println("{" + dice.getDie1() + "}, {" + dice.getDie2() + "}");
                if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                    System.out.println("Big oof for CPU.");
                    cScore = 0;
                    rScore = 0;
                    cont = false;
                } else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                    System.out.println("CPU got greedy.");
                    rScore = 0;
                    cont = false;
                } else {
                    System.out.println("CPU's score so far is " + rScore + ".");
                    if(rScore >= 20)
                    {
                        cScore += rScore;
                        System.out.println("CPU takes it easy. Their total score so far is " + cScore + ".");
                        cont = false;
                    }

                }
                for (int i = 0; i < 999999999; i++) {
                    for (int j = 0; j < 99999999; j++) {}
                }

            }


        }
        if(hScore > cScore)
        {
            System.out.println("Human won with a score of " + hScore + ".");
        }
        else{
            System.out.println("CPU won with a score of " + cScore + ".");            
        }
        
        input.close();
    }
}
