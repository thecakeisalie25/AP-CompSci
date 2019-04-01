package ch07.ex03;

import java.util.ArrayList;

/**
 * Course
 */
public class Course {

    private ArrayList<Student> students;
    private String name;

    public Course(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    /**
     * @param student The student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Gets a list of all the students
     * @return newline seperated list of students
     */
    public String getRoll() {
        String roll = "";
        for (Student e : students) {
            roll += e.getName() + "\n";
        }
        return roll;
    }

    public double getAverage() {
        int avg = 0;
        for (Student e : students) {
            avg += e.getAverage();
        }
        return (double)avg / students.size();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}