package ch08.ex26;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex26/data.txt"));

        int[][][] hours = new int[4][7][24];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 24; k++) {
                    hours[i][j][k] = input.nextInt();
                }
            }
        }
        int s = 0;
        for (int e : hours[0][0]) {
            s+=e;
        }
        System.out.println(s + " Customers on day 1");
        
        input.close();
    }
}