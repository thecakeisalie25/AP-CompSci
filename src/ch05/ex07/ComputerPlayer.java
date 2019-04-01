package ch05.ex07;

import java.util.Random;

import ch05.ex07.HumanPlayer.State;

/**
 * ComputerPlayer
 */
public class ComputerPlayer {

    Random rand = new Random();
    public ComputerPlayer() {
    }
    public State getState() {
        // System.out.println("Rock (R), Paper (P), or Scissors (S)?");
        switch (rand.nextInt(3))
        {
            case 0:
                return State.ROCK;
            case 1:
                return State.PAPER;
            case 2:
                return State.SCISSORS;
            default:
            return State.ERROR;
        }
    }
}