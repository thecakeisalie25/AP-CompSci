package ch11.ex02;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String varname;
        
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input a string less than 20 chars.");
            // System.out.print("> ");
            varname = input.nextLine();
            if (varname.length() >= 20) {
                try {
                    input.close();
                    throw new StringTooLongException();
                } catch (StringTooLongException e) {
                    System.out.println("String too long, try again.");
                }
            }
            // input.close();
        }
    }
}