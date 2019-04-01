package ch08.ex04;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class ReadInts
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex04/ints"));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = -1; i <= 100; i = input.nextInt()) {
            if(i == -1) continue;
            ints.add(i);
        }
        int[] counts = new int[101];
        for (int e : ints) {
            counts[e]++;
        }
        System.out.println("--- COUNTS ---");
        for (int i = 0; i < 100; i+=10) {
            int current = 0;
            for (int j = 1; j <= 10; j++) {
                current+=counts[i+j];
            }
            String currentString = "";
            for (int j = 0; j < current; j+=5) {
                currentString += "*";
            }
            System.out.println(i+1 + "-" + (i+10) + " | " + currentString);
        }
        input.close();
    }
}