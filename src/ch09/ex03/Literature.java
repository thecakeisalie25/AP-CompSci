package ch09.ex03;

/**
 * Literature
 */
public abstract class Literature {

    public void nextPage() {
        System.out.println("Turned the page");
    }
    protected int numPages;

    /**
     * @return the numPages
     */
    public int getNumPages() {
        return numPages;
    }
    /**
     * @param numPages the numPages to set
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}