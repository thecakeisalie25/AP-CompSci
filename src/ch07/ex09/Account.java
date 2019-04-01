package ch07.ex09; // This line was modified by me to make the package function
//********************************************************************
//  Account.java       Author: Lewis/Loftus
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

/**
 * I take no responsibility for anything within this class
 * @author Lewis/Loftus
 */
import java.text.NumberFormat;

public class Account implements Lockable {
    private final double RATE = 0.035; // interest rate of 3.5%
    private Error Locked = new Error("Object is locked");

    private boolean locked = false;
    private int key;
    private long acctNumber;
    private double balance;
    private String name;

    // -----------------------------------------------------------------
    // Sets up the account by defining its owner, account number,
    // and initial balance.
    // -----------------------------------------------------------------
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public Account(String owner, long account) {
        name = owner;
        acctNumber = account;
        balance = 0;
    }
    
    public void lock(int key) {
        if (key == this.key) {
            locked = true;
        }
    }
    
    public void unlock(int key) {
        if (key == this.key) {
            locked = false;
        }
    }
    
    public void setKey(int key) {
        this.key = key;
    }

    public boolean isLocked() {
        return locked;
    }

    // -----------------------------------------------------------------
    // Deposits the specified amount into the account. Returns the
    // new balance.
    // -----------------------------------------------------------------
    public double deposit(double amount) {
        if(locked) throw Locked;
        if(amount < 0) System.out.println("Cannot deposit negitave.");
            else balance = balance + amount;
        return balance;
    }

    // -----------------------------------------------------------------
    // Withdraws the specified amount from the account and applies
    // the fee. Returns the new balance.
    // -----------------------------------------------------------------
    public double withdraw(double amount, double fee) {
        if(locked) throw Locked;
        if(amount > balance) System.out.println("You cannot withdraw with a negitave balance.");
        else balance = balance - amount - fee;
        return balance;
    }
    
    public double withdraw(double amount) {
        if(locked) throw Locked;
        if (amount > balance)
            System.out.println("You cannot withdraw with a negitave balance.");
        else balance = balance - amount;
        return balance;
    }

    // -----------------------------------------------------------------
    // Adds interest to the account and returns the new balance.
    // -----------------------------------------------------------------
    public double addInterest() {
        if(locked) throw Locked;
        balance += (balance * RATE);
        return balance;
    }

    // -----------------------------------------------------------------
    // Returns the current balance of the account.
    // -----------------------------------------------------------------
    public double getBalance() {
        if(locked) throw Locked;
        return balance;
    }

    // -----------------------------------------------------------------
    // Returns a one-line description of the account as a string.
    // -----------------------------------------------------------------
    public String toString() {
        if(locked) throw Locked;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + " " + name + " " + fmt.format(balance));
    }
}