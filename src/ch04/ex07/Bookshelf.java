package ch04.ex07;
        
import java.util.Scanner;
        
public class Bookshelf
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Book book1 = new Book("Harry Potter and the Pot of Hair", "Somebody", "Schoolastic", "January 1st, 1983");
        Book book2 = new Book("Romeo and Juliyeet", "The B Emoji", "/r/dankmemes", "April 20th, 2018");

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);

        input.close();
    }
}