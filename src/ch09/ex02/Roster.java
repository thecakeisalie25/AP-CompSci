package ch09.ex02;

import java.util.ArrayList;
import java.util.Scanner;
        
public class Roster
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        employees.add(new Nurse());
        employees.add(new Doctor());
        employees.add(new Secretary());

        for (Employee e : employees) {
            e.doWork(5);
        }
        
        input.close();
    }
}