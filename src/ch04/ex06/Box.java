package ch04.ex06;

/**
 * Box class
 * @author Larson Ashcroft
 * @see BoxTest.java
 */
public class Box {

    private double height, width, depth;
    private boolean isFull;

    /**
     * 
     * @param height Height of the box
     * @param width Width of the box
     * @param depth Depth of the box
     * @param isFull If the box is full or not
     */
    public Box(double height, double width, double depth, boolean isFull) {
        setHeight(height);
        setDepth(depth);
        setWidth(width);
        setIsFull(isFull);
    }
    
    public Box(double height, double width, double depth) {
        setHeight(height);
        setDepth(depth);
        setWidth(width);
        setIsFull(false);
    }

    /**
     * @return the isFull
     */
    public boolean isFull() {
        return isFull;
    }

    /**
     * @return the depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @param isFull the isFull to set
     */
    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
    
    /**
     * @return A string representation of the Box.
     */
    public String toString() {
        return "A box with height " + getHeight() + " and width " + getWidth() + " and depth " + getDepth() + ". Calling the box full would be a " + isFull() + " statement.";
    }
    
}