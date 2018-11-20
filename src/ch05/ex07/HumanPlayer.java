package ch05.ex07;

import java.util.Scanner;

/**
 * HumanPlayer
 */
public class HumanPlayer {

    Scanner input = new Scanner(System.in);
    enum State 
    {
        ROCK, PAPER, SCISSORS, ERROR, WIN, LOSE, DRAW;
        public static State matchAgainst(State p1, State p2) {
            switch(p1)
            {
                case ROCK:
                    switch(p2)
                    {
                        case ROCK:
                            return DRAW;
                        case PAPER:
                            return LOSE;
                        case SCISSORS:
                            return WIN;
                        default:
                            return ERROR;
                    }
                case PAPER:
                    switch(p2)
                    {
                        case ROCK:
                            return WIN;
                        case PAPER:
                            return DRAW;
                        case SCISSORS:
                            return LOSE;
                        default:
                            return ERROR;
                    }
                case SCISSORS:
                    switch(p2)
                    {
                        case ROCK:
                            return LOSE;
                        case PAPER:
                            return WIN;
                        case SCISSORS:
                            return DRAW;
                        default:
                            return ERROR;
                    }
                default:
                    return ERROR;
            }
        }
    };

    public HumanPlayer(){}
    public State getState() {
        System.out.println("Rock (R), Paper (P), or Scissors (S)?");
        switch (input.nextLine().toLowerCase().charAt(0))
        {
            case 'r':
                return State.ROCK;
            case 'p':
                return State.PAPER;
            case 's':
                return State.SCISSORS;
            default:
                System.out.println("Try again. R, P, or S.");
                return getState();
        }
    }
}