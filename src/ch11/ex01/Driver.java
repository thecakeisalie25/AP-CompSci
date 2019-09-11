package ch11.ex01;
        
import java.util.Scanner;
        
public class Driver
{
    public static void main(String[] args) throws StringTooLongException
    {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Input a string less than 20 chars.");
            System.out.print("> ");
            String varname = input.nextLine();
            if(varname.length() >= 20 ){
                input.close();
                throw new StringTooLongException();
            }
        }
    }
}