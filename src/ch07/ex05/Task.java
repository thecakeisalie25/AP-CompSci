package ch07.ex05;

/**
 * Task
 */
public class Task implements Priority{

    private String name;
    private int priority;

    public Task(String name, int priority) {
        setName(name);
        setPriority(priority);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Task: " + getName() + "\nPriority: " + getPriority() + ".";
    }
}