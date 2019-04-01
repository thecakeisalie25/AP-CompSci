package yeet;

// import java.util.Scanner;

public class Test {
    public static void main(String[] args2) {

        // int count = 0;

        String[] args = {"ProgrammingIsFun!", "When It Works..."};

        int count = 0;
        for (String e : args) {
            for (char f : e.toCharArray()) {
                if (Character.isUpperCase(f)) {
                    count++;
                }
            }
        }
        System.out.print("The number of upper cases are: " + count);
    }
}