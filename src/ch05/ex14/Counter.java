package ch05.ex14;
        
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class Counter
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("src/ch05/ex14/Somethang.nums"));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ints.add(0);
        }
        input.useDelimiter("");
        while(input.hasNext()) 
        {
            String next = input.next();
            if(next.matches("\\d"))
            {
                Integer integer = Integer.decode(next);
                ints.set(integer, ints.get(integer) + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "s: " + ints.get(i) + ".");
        }
        input.close();
    }
}