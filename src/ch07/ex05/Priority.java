package ch07.ex05;
/**
 * @author Larson Ashcroft 2018
 * Represents a set value for priority. 
 * Normal implentation represents a value between 1 and 10;
 * 1 = lowest priority
 * 10 = highest priority
 */
public interface Priority {
    /**
     * Gets the current value of priority
     * @return 1-10 value of priority
     */
    public int getPriority();
    /**
     * Sets the current value of priority
     * @param priority 1-10 value, 1 being lowest.
     */
    public void setPriority(int priority);
}