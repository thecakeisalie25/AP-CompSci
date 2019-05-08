package ch12.ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] proto = { "Bryce", "Break", "Larson", "Mason Jar", "Clayton" };
        ArrayList<String> students = new ArrayList<String>();
        for (String e : proto) {
            students.add(e);
        }
        System.out.println("String to be searched for");
        System.out.println(search(students, input.nextLine()));
        input.close();
    }

    public static boolean search(List<String> list, String searchfor) {
        if (list.get(0).equals(searchfor))
            return true;
        if (list.size() == 1) {
            return false;
        }
        return search(list.subList(1, list.size()), searchfor);

    }
}