package euler.multiple3and5s;
        
import java.util.Scanner;
        
public class multiple3and5s
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        for (int i = 1; i < 1000000000; i++) {
            if(i%3 == 0) {
                count+=i;
                // System.out.println(i);
            }
            else if(i%5 == 0){
                count+=i;
                // System.out.println(i);
            }
        }
        System.out.println(count);
        
        input.close();
    }
}