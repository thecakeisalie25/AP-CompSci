package yeet;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
        
public class Shapiro
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File source = new File("src/yeet/BShapiro.libtard");
		Scanner input = new Scanner(source);
        ArrayList<ArrayList<String>> text = new ArrayList<ArrayList<String>>();
        Scanner line;
        input.useDelimiter("\n");
        int i = 0;
        while(input.hasNext())
        {
            text.add(new ArrayList<String>());
            input.next();
        }
        input.close();
        input = new Scanner(source);
        input.useDelimiter("\n");
        while(input.hasNext())
        {
            line = new Scanner(input.next());
            line.useDelimiter("\\|");
            while(line.hasNext())
            {
                text.get(i).add(line.next());

            }
            i++;
        }
        Random rand = new Random();
        for (ArrayList<String> e : text) {
            System.out.print(e.get(rand.nextInt(e.size())));
        }
        input.close();
    }
}