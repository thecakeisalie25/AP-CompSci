package ch04.ex02;

/**
 * Bulb
 */
public class Bulb {

    private boolean status;

    public Bulb() {
        status = false;
    }
    public boolean toggleStatus() {
        if(status)
        {
            status = false;
            return false;
        }
        status = true;
        return true;
    }
    public boolean getStatus() {
        return status;
    }
    public void smashBulb() {
        status = false;
    }
}