package yeet.sudoku;

/**
 * SudokuTile
 */
public class SudokuTile {

    private int value = 0;
    private boolean locked = false;
    
    public SudokuTile(int value, boolean locked) {
        super();
        this.locked = locked;
        this.value = value;
    }

    public SudokuTile(SudokuTile copy) {
        super();
        this.locked = copy.isLocked();
        this.value = copy.getValue();
    }

    public int getValue() {
        return value;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setValue(int value) {
        this.value = value;
    }

}