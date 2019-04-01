package ch09.ex03;

/**
 * Book
 */
public class StoneTablet extends Literature {

    public StoneTablet() {
        setNumPages(1);
    }

    @Override
    public void nextPage() {
        System.out.println("There are no pages to turn.");
    }

}