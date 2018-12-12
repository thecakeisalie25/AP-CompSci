package ch07.ex06;
        
import java.util.Scanner;
        
public class ToDo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Task task1 = new Task("Please take out the dishes, jarold", 2);
        Task task2 = new Task("Stop calling me jarold", 10);

        System.out.println(task1);
        System.out.println(task2);
        
        input.close();
    }
}