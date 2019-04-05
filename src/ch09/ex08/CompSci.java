package ch09.ex08;

/**
 * CompSci
 */
public class CompSci extends Course {

    public CompSci() {
        super("AP Comp Sci");
    }
    @Override
    public void doWork() {
        System.out.println("Made some programs...");
    }


}