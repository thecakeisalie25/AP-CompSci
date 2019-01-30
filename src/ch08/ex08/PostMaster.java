package ch08.ex08;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PostMaster {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex08/zippy.txt"));
        
        
        
        input.close();
    }
}