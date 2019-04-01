package ch04.ex05;

public class Car {

    private static final int CURRENT_YEAR = 2018;
    private double age;
    private String make, model;

    /**
     * 
     * @param iyear Car's manufacturing year
     * @param imake Make of the car
     * @param imodel Model of the car
     */
    public Car(double iyear, String imake, String imodel) {
        setYear(iyear);
        setMake(imake);
        setModel(imodel);
    }

    /**
     * @return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @param year the year to set
     */
    public void setYear(double year) {
        this.age = CURRENT_YEAR - year;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Check to see if the car is an antique or not (>45 years)
     * @return true if antique
     */
    public boolean isAntique() {
        if(age > 45)
        {
            return true;
        }
        return false;
    }

    /**
     * @return A string representation of the Car
     */
    public String toString() {
        return "this car is a " + this.make + " " + this.model + ", who's age is " + this.age + ". Antique status: " + this.isAntique(); 
    }

}