package ch05.ex08;
        
// import java.util.Random;
import java.util.Scanner;
        
public class SlotMachine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TripleDisplay disp = new TripleDisplay();
        boolean keepgoing = true;
        while (keepgoing) {
            disp.spin();
            System.out.println(disp);
            System.out.println(disp.getResults());
            System.out.println("Do you want to play again?");
            System.out.print("> ");
            switch(input.nextLine().toUpperCase().charAt(0))
            {
                case 'Y':
                    break;
                case 'N':
                    keepgoing = false;
                    break;
                default:
                    System.out.println("Unknown response. Assuming yes.");
                    break;
            }
        }      
        
        input.close();
    }
}