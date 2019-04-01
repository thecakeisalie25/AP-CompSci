package ch08.ex06;

/**
 * Account
 */
public class Account {

    private static double intrestRate = 1.03;
    private double accountBalance;
    private int pin;
    private String name;

    public Account(double accountBalance, int pin, String name) {
        setAccountBalance(accountBalance);
        setPin(pin);
        setName(name);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Account obj) {
        return pin == obj.getPin();
    }

    public boolean tryPin(int pin) {
        return this.pin == pin;
    }

    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    public double withdraw(double cash) {
        if (cash < 0 || cash > accountBalance) {
            System.out.println("Sorry, that's an error.");
            return accountBalance;
        }
        accountBalance-=cash;
        return accountBalance;
    }

    public double deposit(double cash) {
        if (cash < 0) {
            System.out.println("Sorry, that's a negative number.");
            return accountBalance;
        }
        accountBalance += cash;
        return accountBalance;
    }

    /**
     * Calculate intrest based on a set, static intrest rate.
     */
    public void calculateInterest() {
        accountBalance *= intrestRate;
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return the intrestRate
     */
    public static double getIntrestRate() {
        return intrestRate;
    }

    /**
     * @param intrestRate the intrestRate to set
     */
    public static void setIntrestRate(double intrestRate) {
        Account.intrestRate = intrestRate;
    }

}