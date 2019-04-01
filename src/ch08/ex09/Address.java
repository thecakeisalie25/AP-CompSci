package ch08.ex09;

/**
 * Address
 */
public class Address {

    private String fname;
    private String lname;
    private int zip;
    private String address;
    private String city;
    private String state;
    private long phoneNumber;

    public Address(String fname, String lname, int zip, String address, String city, String state, long phoneNumber) {
        setFname(fname);
        setLname(lname);
        setZip(zip);
        setAddress(address);
        setCity(city);
        setState(state);
        setPhonenumber(phoneNumber);
    }

    /**
     * @return the phonenumber
     */
    public long getPhonenumber() {
        return phoneNumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(long phonenumber) {
        this.phoneNumber = phonenumber;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return fname + " " + lname + " lives at zip " + zip + " with address " + address + " in " + city + ", " + state + ". Their phone number is " + phoneNumber + ".";
    }
    

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
}