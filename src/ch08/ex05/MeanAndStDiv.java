package ch08.ex05;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class MeanAndStDiv
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex05/ints"));
        
        ArrayList<Integer> ints = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            ints.add(input.nextInt());
        }
        double mean = 0;
        for (int e : ints) {
            mean+=e;
        }
        mean = mean / ints.size();

        System.out.println(mean);
        ArrayList<Double> stdiv = new ArrayList<Double>();

        for (int e : ints) {
            stdiv.add(Math.pow(e-mean, 2));
        }

        double div = 0;
        for (double e : stdiv) {
            div += e;
        }
        div = div / stdiv.size();

        System.out.println(Math.sqrt(div));
        input.close();
    }
}