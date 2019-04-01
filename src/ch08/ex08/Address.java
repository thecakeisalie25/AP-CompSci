package ch08.ex08;

/**
 * Address
 */
public class Address {

    private String fname;
    private String lname;
    private int zip;

    public Address(String fname, String lname, int zip) {
        setFname(fname);
        setLname(lname);
        setZip(zip);
    }

    @Override
    public String toString() {
        return fname + " " + lname + " lives at zip " + zip + ".";
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