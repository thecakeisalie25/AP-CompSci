package ch07.ex06;

/**
 * Task
 */
public class Task implements Priority, Complexity{

    private String name;
    private int priority;
    private int complexity;

    public Task(String name, int priority, int complexity) {
        setName(name);
        setPriority(priority);
        setComplexity(complexity);
    }
    
    /**
     * @return the complexity
     */
    public int getComplexity() {
        return complexity;
    }

    /**
     * @param complexity the complexity to set
     */
    public void setComplexity(int complexity) {
        this.complexity = complexity;
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
        return "Task: " + getName() + "\nPriority: " + getPriority() + "\nComplexity: " + getComplexity() + ".";
    }
}