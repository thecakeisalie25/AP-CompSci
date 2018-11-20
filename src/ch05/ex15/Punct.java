package ch05.ex15;
        
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
        
public class Punct
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("src/ch05/ex15/article.txt"));
        int output0 = 0;
        int output1 = 0;
        int output2 = 0;
        int output3 = 0;
        int output4 = 0;
        int output5 = 0;
        int output6 = 0;
        int output7 = 0;
        int output8 = 0;
        int output9 = 0;
        int output10 = 0;
        input.useDelimiter("");
        while(input.hasNext())
        {
            String next = input.next();
            output0 = next.matches("!") ? output0 + 1 : output0;
            output1 = next.matches("\\.") ? output1 + 1 : output1;
            output2 = next.matches(",") ? output2 + 1 : output2;
            output3 = next.matches("\\?") ? output3 + 1 : output3;
            output4 = next.matches(";") ? output4 + 1 : output4;
            output5 = next.matches(":") ? output5 + 1 : output5;
            output6 = next.matches("\\\'") ? output6 + 1 : output6;
            output7 = next.matches("\\\"") ? output7 + 1 : output7;
            output8 = next.matches("-") ? output8 + 1 : output8;
            output9 = next.matches("/") ? output9 + 1 : output9;
            output10 = next.matches("[\\(\\)]") ? output10 + 1 : output10;
            // !.,?;:\'\"-/
        }
        System.out.println(output0 + " * !");
        System.out.println(output1 + " * .");
        System.out.println(output2 + " * ,");
        System.out.println(output3 + " * ?");
        System.out.println(output4 + " * ;");
        System.out.println(output5 + " * :");
        System.out.println(output6 + " * \'");
        System.out.println(output7 + " * \"");
        System.out.println(output8 + " * -");
        System.out.println(output9 + " * /");
        System.out.println(output10 + " * ( || )");
        input.close();
    }
}