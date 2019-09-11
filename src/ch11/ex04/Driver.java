package ch11.ex04;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input a 2 char document code.");
            System.out.print("> ");
            String varname = input.nextLine();
            if (!varname.matches("^[UCPucp].$")) {
                // input.close();
                try {
                    input.close();
                    throw new InvalidDocumentCodeException();
                } catch (InvalidDocumentCodeException e) {
                    System.out.println("Nope.");
                }
            }
        }
    }
}