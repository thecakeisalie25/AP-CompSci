package ch09.ex05;

import java.util.ArrayList;
import java.util.Scanner;
        
public class Car // get it? because it's a people driver? i'm funny
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Larson());
        people.add(new Bryce());

        for (Person e : people) {
            System.out.println("Name: " + e.getName() + ".");
            System.out.println("Age: " + e.getAge() + ".");
            System.out.println("Nationality: " + e.getNationality() + ".");
        }
        
        input.close();
    }
}