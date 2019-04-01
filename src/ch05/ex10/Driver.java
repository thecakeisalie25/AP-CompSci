package ch05.ex10;
        
import java.util.ArrayList;
import java.util.Scanner;
        
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Account> database = new ArrayList<Account>();
        database.add(new Account("James B", 1, 20));
        database.add(new Account("Jormes F", 2, 2));
        database.add(new Account("Juul S", 3, 12));
        database.get(1).addInterest();
        database.get(2).deposit(-1000); // Craskes as intended
        database.get(2).deposit(2);
        database.get(0).withdraw(10, 4); // Crashes as intended
        // database.get(0).withdraw(1); 
        // database.get(0).withdraw(1); 
        for (Account i : database) {
            System.out.println(i);
        }
        
        input.close();
    }
}