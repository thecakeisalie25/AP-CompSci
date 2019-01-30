package ch08.ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostMaster {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("src/ch08/ex08/zippy.txt"));
        ArrayList<Address> yeets = new ArrayList<Address>();
        while (input.hasNext()) {
            yeets.add(new Address(input.next(), input.next(), input.nextInt()));
        }
        for (Address e : yeets) {
            System.out.println(e);
        }
        input.close();
    }
}