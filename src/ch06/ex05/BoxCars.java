package ch06.ex05;
        
import java.util.Scanner;

import ch04.ex09.PairOfDice;
        
public class BoxCars
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PairOfDice pod = new PairOfDice();
        
        int c = 0;
        for (int i = 0; i < 1000; i++) {
            pod.roll();
            c+=pod.getCombo()==12?1:0;
        }
        System.out.println("It rolled a \"Box Car\" " + c + " times.");
        
        input.close();
    }
}