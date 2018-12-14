package ch07.ex03;

//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student {
    private String firstName;
    private String lastName;
    private Address homeAddress, schoolAddress;
    private int testscore1, testscore2, testscore3;

    // -----------------------------------------------------------------
    // Constructor: Sets up this student with the specified values.
    // -----------------------------------------------------------------
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testscore1 = 0;
        this.testscore2 = 0;
        this.testscore3 = 0;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    
    public Student(String first, String last, Address home, Address school, int testscore1) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testscore1 = testscore1;
        this.testscore2 = 0;
        this.testscore3 = 0;
    }
    
    public Student(String first, String last, Address home, Address school, int testscore1, int testscore2) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testscore1 = testscore1;
        this.testscore2 = testscore2;
        this.testscore3 = 0;
    }
    
    public Student(String first, String last, Address home, Address school, int testscore1, int testscore2, int testscore3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.testscore1 = testscore1;
        this.testscore2 = testscore2;
        this.testscore3 = testscore3;
    }
    public int getTestScore(int index) {
        switch (index) {
            case 1:
                return testscore1;
            case 2:
                return testscore2;
            case 3:
                return testscore3;
            default:
                return -1;
        }
    }
    
    public void setTestScore(int index, int testscore) {
        switch (index) {
        case 1:
            this.testscore1 = testscore;
        case 2:
            this.testscore2 = testscore;
        case 3:
            this.testscore3 = testscore;
        }
    }

    public double getAverage() {
        return (double)(testscore1 + testscore2 + testscore3) / 3;
    }

    // -----------------------------------------------------------------
    // Returns a string description of this Student object.
    // -----------------------------------------------------------------
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Score 1:\n" + testscore1 + "\n";
        result += "Test Score 2:\n" + testscore2 + "\n";
        result += "Test Score 3:\n" + testscore3 + "\n";
        result += "Average Test Score:\n" + getAverage();

        return result;
    }
}