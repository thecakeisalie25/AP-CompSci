package ch06.ex09;
        
import java.util.Scanner;
        
public class VowelCount
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = 0, e = 0, i = 0, o = 0, u = 0, other = 0;
        
        System.out.println("Input a string to count vowels");
        System.out.print("> ");
        String test = input.nextLine();
        Scanner scan = new Scanner(test);
        scan.useDelimiter("");
        while (scan.hasNext()) {
            switch (scan.next()) {
                case "a":
                    a++;
                break;
                case "e":
                    e++;
                break;
                case "i":
                    i++;
                break;
                case "o":
                    o++;
                break;
                case "u":
                    u++;
                break;
                default:
                    other++;
                break;
            }
        }
        System.out.println(a + " * a");
        System.out.println(e + " * e");
        System.out.println(i + " * i");
        System.out.println(o + " * o");
        System.out.println(u + " * u");
        System.out.println(other + " * other");
        scan.close(); // i hate this
        input.close();
    }
}