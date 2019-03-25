package ch09.ex02;

/**
 * Doctor
 */
public class Nurse extends Employee {

    public Nurse() {
        super();
    }

    @Override
    public void doWork(int workToDo) {
        for (int i = 0; i < workToDo; i++) {
            System.out.println("Done nurse stuff");
        }
    }
}