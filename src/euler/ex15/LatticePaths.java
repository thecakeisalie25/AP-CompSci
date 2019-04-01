package euler.ex15;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LatticePaths {
    private static final int GRID_SIZE = 10;

    // public static ArrayList<ArrayList<Boolean>> answers = new ArrayList<ArrayList<Boolean>>();
    public static Long c = new Long(0);    

    public static Predicate<ArrayList<Boolean>> testAnswers = i -> {
	    i.sort(null);
	    ArrayList<Boolean> trues = new ArrayList<Boolean>(i);
	    // c.toBinaryString(c)
	    ArrayList<Boolean> falses = new ArrayList<Boolean>(i);
	    while(trues.remove(new Boolean(true)));
	    while(falses.remove(new Boolean(false)));
	    return trues.size() == falses.size();
	};

    public static void main(String[] args) {
        addBools();
        System.out.println(c);
    }

    public static void addBools(ArrayList<Boolean> x) {
        if (x.size() == GRID_SIZE * 2) {
            if (testAnswers.test(x)) {
                c++;
                // System.out.println(c);
            }
            // System.out.println("base case");
        } else {
            ArrayList<Boolean> addTrue = new ArrayList<Boolean>(x);
            ArrayList<Boolean> addFalse = new ArrayList<Boolean>(x);
            x = null;
            addTrue.add(true);
            addFalse.add(false);
            addBools(addTrue);
            // System.out.println("recursed true");
            addBools(addFalse);
            // System.out.println("recursed false");

        }
    }
    public static void addBools() {
        addBools(new ArrayList<Boolean>());
    }
}