package ch04.ex09;
        
import java.util.Scanner;
        
public class RollingDice2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        PairOfDice pod1 = new PairOfDice();
        PairOfDice pod2 = new PairOfDice();
        
        pod1.roll();
        System.out.println(pod1.getDie1());
        pod2.setDie1(4);
        System.out.println(pod2.getDie1());
        System.out.println(pod2.getDie2());
        System.out.println(pod2.getCombo());

        input.close();
    }
}