package ch08.ex06;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static ArrayList<Account> accounts = new ArrayList<Account>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainScreen();
    }

    public static void mainScreen() {
        System.out.println("Welcome to L&L Bank!\nPlease type your PIN, or type \"new\" to create an account.");
        System.out.print("> ");
        String pinOrName = input.nextLine();
        // System.out.println(pinOrName);
        if (pinOrName.toLowerCase().contains("new")) {
            createAccount();
        }
        else if(pinOrName == "int")
        {
            for (Account e : accounts) {
                e.calculateInterest();
            }
            System.out.println("Interest applied.");
            mainScreen();
        }
        else {
            // System.out.println("hit else");
            try{

                login(Integer.decode(pinOrName));
            }
            catch(Exception e)
            {
                System.out.println("Sorry! Didn't get that. Try again.");
                mainScreen();
            }
            
        }
    }

    public static void createAccount() {
        System.out.println("What is your name?");
        System.out.print("> ");
        String name = input.nextLine();
        System.out.println("Initial deposit?");
        System.out.print("> ");
        double cash = input.nextDouble();
        System.out.println("Set a PIN");
        System.out.print("> ");
        int inpin = input.nextInt();
        boolean a = false;
        for (Account e : accounts) {
            a = e.tryPin(inpin) ? true : a;
        }
        if (a) {
            System.out.println("Sorry, that PIN is taken. Please try again with a different PIN.");
            return;
        }
        accounts.add(new Account(cash, inpin, name));
        System.out.println("Account created.");
        input.nextLine();
        mainScreen();
    }

    public static void login(int pin)
    {
        for (Account e : accounts) {
            if(e.tryPin(pin))
            {
                System.out.println("Welcome! What would you like to do?");
                System.out.println("You can type 'deposit', 'withdraw', or 'balance'.");
                System.out.print("> ");
                String inputnext = input.nextLine();
                switch (inputnext.toLowerCase()) {
                    case "deposit":
                        System.out.println("How much would you like to deposit?");
                        System.out.print("> ");
                        double deposit = input.nextDouble();
                        e.deposit(deposit);
                        input.nextLine();
                        break;
                    case "withdraw":
                        System.out.println("How much would you like to withdraw?");
                        System.out.print("> ");
                        double withdraw = input.nextDouble();
                        e.withdraw(withdraw);
                        input.nextLine();
                        break;
                    case "balance":
                        System.out.println("Your balance is " + e.getAccountBalance());
                        break;
                    default:
                        System.out.println("Sorry, didn't catch that.");
                        break;
                }
                System.out.println("Please come back next time!");
                mainScreen();
            }
        }
        System.out.println("Sorry, Wrong pin.");
        mainScreen();
    }
}