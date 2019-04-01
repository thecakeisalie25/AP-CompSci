package ch09.ex02;

/**
 * Doctor
 */
public class Secretary extends Employee {

    public Secretary() {
        super();
    }

    @Override
    public void doWork(int workToDo) {
        for (int i = 0; i < workToDo; i++) {
            System.out.println("Planned appointment");
        }
    }
    
}