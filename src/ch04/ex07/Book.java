package ch04.ex07;

/**
 * Book
 * @author Larson Ashcroft
 * @see Bookshelf.java
 */
public class Book {

    private String title, author, publisher, copyright;

    /**
     * 
     * @param title String
     * @param author String
     * @param publisher String
     * @param copyright String
     */
    public Book(String title, String author, String publisher, String copyright) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setCopyright(copyright);
    }

    public String toString() {
        return getTitle() + " was written by " + getAuthor() + "\nPublished by " + getPublisher() + " on " + getCopyright();
    } 

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @param copyright the copyright to set
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
}