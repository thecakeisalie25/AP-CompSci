package ch09.ex08;

/**
 * Course
 */
public abstract class Course {

    protected String name;
    public Course(String name) {
        this.name = name;
    }

    public abstract void doWork();
}