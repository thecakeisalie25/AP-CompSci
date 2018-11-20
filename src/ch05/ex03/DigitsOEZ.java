package ch05.ex03;
        
// import java.util.ArrayList;
import java.util.Scanner;
        
public class DigitsOEZ
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int zero = 0;
        int even = 0;
        int odd = 0;
        System.out.println();
        System.out.println("Please input a number.");
        System.out.print  ("> ");
        String numString = input.nextLine();

        char[] chlist = numString.toCharArray();

        for (char i : chlist)
        {
            switch(i)
            {
                //#region
                case '0':
                    zero++;
                break;

                case '1':
                case '3':
                case '5':
                case '7':
                case '9':
                    odd++;
                break;

                case '2':
                case '4':
                case '6':
                case '8':
                    even++;
                break;
                //#endregion
            }
        }
        System.out.println("Zeroes: " + zero + " Evens: " + even + " Odds: " + odd);
        input.close();
    }
}