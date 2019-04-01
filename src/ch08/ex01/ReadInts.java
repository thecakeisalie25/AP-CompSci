package ch08.ex01;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class ReadInts
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex01/ints"));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = -1; i <= 50; i = input.nextInt()) {
            if(i == -1) continue;
            ints.add(i);
        }
        int[] counts = new int[51];
        for (int e : ints) {
            counts[e]++;
        }
        System.out.println("--- COUNTS ---");
        for (int i = 0; i < 51; i++) {
            // String yank = "";
            // for (int j = 0; j < counts[i]; j++) {
            //     yank += "*";
            // }
            System.out.println(i + " | " + counts[i]);
        }
        input.close();
    }
}