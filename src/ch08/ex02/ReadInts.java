package ch08.ex02;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class ReadInts
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex02/ints"));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = -192739250; (i <= 25 && i >= -25) || i == -192739250; i = input.nextInt()) {
            if(i == -192739250) continue;
            ints.add(i);
        }
        int[] counts = new int[51];
        for (int e : ints) {
            counts[e + 25]++;
        }
        System.out.println("--- COUNTS ---");
        for (int i = 0; i < 51; i++) {
            System.out.println(i-25 + " | " + counts[i]);
        }
        input.close();
    }
}