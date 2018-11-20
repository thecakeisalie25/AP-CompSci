package ch05.ex12;
        
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class GolfScores
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("src/ch05/ex12/scores.gss"));
        System.out.println("PAR\tGOLF1\tGOLF2\tGOLF3\tGOLF4");
        System.out.println("-------------------------------------");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int par = 0;
        int numGolfers = 4; // arbitrary number of golfers
        for (int i = 0; i < numGolfers; i++) {
            scores.add(0);
        }
        while(input.hasNext()) // arbitrary number of holes will work.
        {
            for (int i = -1; i < numGolfers; i++) {
                String next = input.next();
				System.out.print(next + "\t");
                if(i == -1)
                {
                    par = Integer.decode(next);
                }
                else
                {
                    scores.set(i, scores.get(i) + (Integer.decode(next) - par));
                }
            }
            System.out.print("\n");
        }
        int lowest = Integer.MAX_VALUE;
        for (int i = 1; i <= numGolfers; i++) {
            Integer integer = scores.get(i-1);
			System.out.println("Golfer " + i + "'s score is " + integer + ".");
            if(integer < lowest) lowest = integer;
        }
        System.out.println(lowest + " is the best score.");
        System.out.print("Golfer ");
        System.out.println(scores.lastIndexOf(lowest) + 1 + " Wins!");
        input.close();
    }
}