package ch03.ex3;
        
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
        
public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("000");
        DecimalFormat format = new DecimalFormat("0000");        

        String pnum = new Random().nextInt(8) + "";
        pnum += new Random().nextInt(8);
        pnum += new Random().nextInt(8);
        pnum += "-";
        pnum += form.format(new Random().nextInt(656));
        pnum += "-";
        pnum += format.format(new Random().nextInt(10000));
        
        System.out.println(pnum);
        input.close();
    }
}