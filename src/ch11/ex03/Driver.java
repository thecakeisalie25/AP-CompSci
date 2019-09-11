package ch11.ex03;
        
import java.util.Scanner;
        
public class Driver
{
    public static void main(String[] args) throws InvalidDocumentCodeException
    {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Input a 2 char document code.");
            System.out.print("> ");
            String varname = input.nextLine();
            if(!varname.matches("^[UCPucp].$")){
                input.close();
                throw new InvalidDocumentCodeException();
            }
        }
    }
}