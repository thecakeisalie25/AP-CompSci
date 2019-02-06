package euler.ex09;

public class PythagorianTriples {
    public static void main(String[] args) {
        outer:
        for (int i = 1000; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {

                    if (i + j + k != 1000){
                        // System.out.println(i+ " " +j+ " " +k);
                        continue;
                    }

                    if (testPyTriple(k, j, i)) {
                        System.out.println(i + " * " + j + " * " + k + " = " + (i * j * k));
                        break outer;
                    }
                }
            }
        }
        // System.out.println(testPyTriple(3, 4, 5));
    }

    public static boolean testPyTriple(int a, int b, int c) {
        return Math.abs(Math.round(Math.pow(a, 2)) + Math.round(Math.pow(b, 2)) - Math.round(Math.pow(c, 2))) < .1d;
    }
}