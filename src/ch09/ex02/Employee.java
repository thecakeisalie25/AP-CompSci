package ch09.ex02;

/**
 * Employee
 */
public abstract class Employee {
    public abstract void doWork(int workToDo);
    
    private int money;
    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }
    
    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }

    public Employee() {
        System.out.println(this.getClass().getName() + " hired.");
    }
}