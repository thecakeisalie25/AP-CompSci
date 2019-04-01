package ch09.ex02;

/**
 * Doctor
 */
public class Doctor extends Employee {

    public Doctor() {
        super();
    }

    @Override
    public void doWork(int workToDo) {
        for (int i = 0; i < workToDo; i++) {
            System.out.println("Surgery");
        }
    }
    
}