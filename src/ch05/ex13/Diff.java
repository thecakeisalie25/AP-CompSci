package ch05.ex13;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
        
public class Diff
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch05/ex13/q.d1"));
        Scanner input2 = new Scanner(new File("src/ch05/ex13/q.d2"));        
        input.useDelimiter("\\n");
        input2.useDelimiter("\\n");
        while (input.hasNext()) {
            String next = input.next();
            String next2 = input2.next();
            if (next.equals(next2)) {
                System.out.println("=:" + next);
            }
            else
            {
                System.out.println("1:" + next);
                System.out.println("2:" + next2);
            }
        }        
        
        input.close();
        input2.close();
    }
}