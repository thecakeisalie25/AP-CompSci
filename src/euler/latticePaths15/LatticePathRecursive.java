package euler.latticePaths15;

/**
 * LatticePathRecursive
 */
public class LatticePathRecursive {

    private static final int LEN = 20;
    public static void main(String[] args) {
    }

    public int recurse(int depth, boolean[] boolin) {
        int c = 0;
        if(depth == 41)
        {
            //TODO test stuff
        }
        for (int i = 0; i < 40; i++) {
            if(boolin[i]) continue; // don't re-set it.
        }
        return c;
    }
}