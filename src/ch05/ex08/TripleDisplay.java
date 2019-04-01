package ch05.ex08;

/**
 * TripleDisplay
 */
public class TripleDisplay {

    private SingleDisplay d1 = new SingleDisplay();
    private SingleDisplay d2 = new SingleDisplay();
    private SingleDisplay d3 = new SingleDisplay();

    public TripleDisplay() {
        spin();
    }

    public void spin(){
        d1.spin();
        d2.spin();
        d3.spin();
    }
    public String getResults() {
        if(d1.getDisplay() == d2.getDisplay() && d2.getDisplay() == d3.getDisplay())
        {
            return "Jackpot!";
        }
        else if(d1.getDisplay() != d2.getDisplay() 
            && d2.getDisplay() != d3.getDisplay()
            && d3.getDisplay() != d1.getDisplay())
        {
            return "Nope, sorry.";
        }
        return "2 of a kind!";
    }
    
    @Override
    public String toString() {
        return "--> " + d1.getDisplay() + " " + d2.getDisplay() + " " + d3.getDisplay() + " <--";
    }

}