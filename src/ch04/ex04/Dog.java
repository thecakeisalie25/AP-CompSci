package ch04.ex04;

/**
 * Dog
 */
public class Dog {

    private double age;
    private String name;

    public Dog(double dage, String sname) {
        setAge(dage);
        setName(sname);
    }

    public double getHumanAge() {
        return age * 7.0;
    }

    public void setName(String sname) {
        name = sname;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(double dage) {
        age = dage;
    }

    public double getAge() {
        return age;
    }

    public String toString() {
        return name + "'s age in dog years: " + age + ", Age in human years:" + getHumanAge() + ".";
    }
}