package ch05.ex07;
        
import java.util.Scanner;

import ch05.ex07.HumanPlayer.State;
        
public class RoPaSc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ComputerPlayer cpu = new ComputerPlayer();
        HumanPlayer p1 = new HumanPlayer();
        State cState = State.ERROR;
        State hState = State.ERROR;
        int win = 0, lose = 0, draw = 0;
        
        boolean wantstoplay = true;

        while(wantstoplay)
        {
            cState = cpu.getState();
            hState = p1 .getState();
            System.out.println("Computer picked: " + cState);
            switch(State.matchAgainst(hState, cState))
            {
                case WIN:
                    System.out.println("You win! Play again?");
                    win++;
                break;
                case LOSE:
                    System.out.println("You lose. Play again?");
                    lose++;
                break;
                case DRAW:
                    System.out.println("It's a tie! Play again?");
                    draw++;
                break;
                default:
                    System.out.println("Something has gone terribly, terribly wrong. State = " + State.matchAgainst(hState, cState));

            }
            switch(input.nextLine().toUpperCase().charAt(0))
            {
                case 'Y':
                    break;
                case 'N':
                    wantstoplay = false;
                    break;
                default:
                    System.out.println("Unknown response. Assuming yes.");
                    break;
            }
        }
        System.out.println("Wins: " + win + " Losses: " + lose + " Draws: " + draw);
        input.close();
    }
}