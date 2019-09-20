package yeet.sudoku;

/**
 * SudoBoard
 */
public class SudoBoard {

    private SudokuTile[][] board = new SudokuTile[9][9];

    public SudoBoard() {
        super();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = new SudokuTile(0, false);
            }
        }
    }

    public static void main(String[] args) {
        SudoFrame.main(args);
    }

    private static SudoBoard recurseBoard = new SudoBoard();

    public static SudoBoard validBoardFactory() {
        SudokuTile[][] board = {
                { new SudokuTile(1, false), new SudokuTile(2, false), new SudokuTile(3, false),
                        new SudokuTile(4, false), new SudokuTile(5, false), new SudokuTile(6, false),
                        new SudokuTile(7, false), new SudokuTile(8, false), new SudokuTile(9, false) },
                { new SudokuTile(7, false), new SudokuTile(8, false), new SudokuTile(9, false),
                        new SudokuTile(1, false), new SudokuTile(2, false), new SudokuTile(3, false),
                        new SudokuTile(4, false), new SudokuTile(5, false), new SudokuTile(6, false) },
                { new SudokuTile(4, false), new SudokuTile(5, false), new SudokuTile(6, false),
                        new SudokuTile(7, false), new SudokuTile(8, false), new SudokuTile(9, false),
                        new SudokuTile(1, false), new SudokuTile(2, false), new SudokuTile(3, false) },
                { new SudokuTile(3, false), new SudokuTile(1, false), new SudokuTile(2, false),
                        new SudokuTile(8, false), new SudokuTile(4, false), new SudokuTile(5, false),
                        new SudokuTile(9, false), new SudokuTile(6, false), new SudokuTile(7, false) },
                { new SudokuTile(6, false), new SudokuTile(9, false), new SudokuTile(7, false),
                        new SudokuTile(3, false), new SudokuTile(1, false), new SudokuTile(2, false),
                        new SudokuTile(8, false), new SudokuTile(4, false), new SudokuTile(5, false) },
                { new SudokuTile(8, false), new SudokuTile(4, false), new SudokuTile(5, false),
                        new SudokuTile(6, false), new SudokuTile(9, false), new SudokuTile(7, false),
                        new SudokuTile(3, false), new SudokuTile(1, false), new SudokuTile(2, false) },
                { new SudokuTile(2, false), new SudokuTile(3, false), new SudokuTile(1, false),
                        new SudokuTile(5, false), new SudokuTile(7, false), new SudokuTile(4, false),
                        new SudokuTile(6, false), new SudokuTile(9, false), new SudokuTile(8, false) },
                { new SudokuTile(9, false), new SudokuTile(6, false), new SudokuTile(8, false),
                        new SudokuTile(2, false), new SudokuTile(3, false), new SudokuTile(1, false),
                        new SudokuTile(5, false), new SudokuTile(7, false), new SudokuTile(4, false) },
                { new SudokuTile(5, false), new SudokuTile(7, false), new SudokuTile(4, false),
                        new SudokuTile(9, false), new SudokuTile(6, false), new SudokuTile(8, false),
                        new SudokuTile(2, false), new SudokuTile(3, false), new SudokuTile(1, false) }, };
        return new SudoBoard(board);
    }

    public static SudoBoard getRecurseCache() {
        return recurseBoard;
    }

    public SudoBoard(SudokuTile[][] board) {
        this.board = board;
    }

    public SudoBoard modifiedBoard(int val, int x, int y) {
        SudokuTile[][] board2 = board;
        board2[x][y] = new SudokuTile(val, false);
        return new SudoBoard(board2);
    }

    public SudokuTile getTile(int x, int y) {
        return board[x][y];
    }

    public void setTile(int x, int y, int v, boolean locked) {
        board[x][y] = new SudokuTile(v, locked);
    }

    // public int recurse(SudoBoard board, int x, int y) {
    // boolean changedBoard = false;
    // for (SudokuTile[] e : board.getBoard()) {
    // for (SudokuTile f : e) {
    // if(changedBoard) continue; // if we've done a thing, don't do other thing
    // if(f.getValue() == 0) {
    // for (int i = 1; i < 10; i++) {
    // f.setValue(i);
    // recurse(board, x, y);
    // }
    // }
    // }
    // }
    // return 0;
    // }

    public boolean recurse2(SudoBoard board, int pos) {
        int x = SudoFrame.x(pos);
        int y = SudoFrame.y(pos);
        if (pos == 81) {
            return board.isValid();
        }
        if (board.getTile(x, y).isLocked()) {
            return recurse2(board, pos + 1);
        }
        for (int i = 1; i < 10; i++) {
            if (pos < 74) {
                System.out.println("Setting " + pos + " to " + i + ".");
            }
            board.setTile(x, y, i, false);
            boolean doRecurse = recurse2(board, pos + 1);
            if (doRecurse) {
                recurseBoard = board;
                return true;
            }
            ;
        }
        return false;
    }

    public SudokuTile[][] getBoard() {
        return board;
    }

    public boolean isPartialValid() {
        // #region check horizontal lines
        for (SudokuTile[] e : board) {
            boolean[] rowValues = new boolean[9];
            // #region 9 falses
            for (int i = 0; i < 9; i++) {
                rowValues[i] = false;
            }
            // #endregion
            for (SudokuTile f : e) {
                // if value is in array, we had the same num on 1 line, so fail
                if (f.getValue() != 0) {
                    if (rowValues[f.getValue() - 1] /* || f.getValue() == 0 */) {
                        return false;
                    }
                    // otherwise, put value in array
                    rowValues[f.getValue() - 1] = true;
                }
            }
        }
        // #endregion
        for (int col = 0; col < 9; col++) {
            boolean[] rowValues = new boolean[9];
            for (int row = 0; row < 9; row++) {
                // if value is in array, we had the same num on 1 line, so fail
                if (board[row][col].getValue() != 0) {
                    if (rowValues[board[row][col].getValue() + 1] /* || board[row][col].getValue() == 0 */) {
                        return false;
                    }
                    // otherwise, put value in array
                    rowValues[board[row][col].getValue() + 1] = true;
                }
            }
        }
        return true;
    }

    public boolean isValid() {
        // #region check horizontal lines
        for (SudokuTile[] e : board) {
            boolean[] rowValues = new boolean[9];
            // #region 9 falses
            for (int i = 0; i < 9; i++) {
                rowValues[i] = false;
            }
            // #endregion
            for (SudokuTile f : e) {
                // if value is in array, we had the same num on 1 line, so fail
                if (rowValues[f.getValue() - 1] || f.getValue() == 0) {
                    return false;
                }
                // otherwise, put value in array
                rowValues[f.getValue() - 1] = true;
            }
        }
        // #endregion
        for (int col = 0; col < 9; col++) {
            boolean[] rowValues = new boolean[9];
            for (int row = 0; row < 9; row++) {
                // if value is in array, we had the same num on 1 line, so fail
                if (rowValues[board[row][col].getValue() + 1] || board[row][col].getValue() == 0) {
                    return false;
                }
                // otherwise, put value in array
                rowValues[board[row][col].getValue() + 1] = true;
            }
        }
        return true;
    }
}