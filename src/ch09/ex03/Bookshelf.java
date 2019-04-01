package ch09.ex03;

import java.util.ArrayList;
import java.util.Scanner;
        
public class Bookshelf
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Literature> aaa = new ArrayList<Literature>();

        aaa.add(new StoneTablet());
        aaa.add(new Magizine());
        aaa.add(new Book());

        for (Literature e : aaa) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getNumPages());
            e.nextPage();
            System.out.println("---");
        }
        input.close();
    }
}