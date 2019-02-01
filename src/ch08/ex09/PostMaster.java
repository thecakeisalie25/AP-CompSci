package ch08.ex09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostMaster {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/ch08/ex09/zippy.txt"));
        ArrayList<Address> yeets = new ArrayList<Address>();
        while (input.hasNextLine()) {
            String temp = input.nextLine();
            Pattern match = Pattern.compile("(\\w+) (\\w+) (\\d+) (.+) (\\w+) (\\w+) (\\d+)");
            Matcher matcher = match.matcher(temp);
            matcher.find();
            yeets.add(new Address(matcher.group(1), matcher.group(2), Integer.decode(matcher.group(3)) , matcher.group(4), matcher.group(5), matcher.group(6), Long.decode(matcher.group(7))));
        }
        for (Address e : yeets) {
            System.out.println(e);
        }
        input.close();
    }
}