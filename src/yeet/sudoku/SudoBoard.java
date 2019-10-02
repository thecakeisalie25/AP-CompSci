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

    public static SudoBoard getRecurseCache() {
        return recurseBoard;
    }

    public SudoBoard(SudokuTile[][] board) {
        this.board = board;
    }

    public SudoBoard(SudoBoard copy) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = new SudokuTile(copy.getTile(i, j));
            }
        }
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
        System.out.println(pos + " " + isPartialValid(board));
        if (pos == 81) {
            return board.isValid();
        }
        if (board.getTile(x, y).isLocked()) {
            return recurse2(board, pos + 1);
        }
        for (int i = 1; i < 10; i++) {
            // reset board after this
            // if (pos < 20) {
            // System.out.println("Setting " + (pos + 1) + " to " + i + ".");
            // }
            board.setTile(x, y, i, false);
            if (!isPartialValid(board)) {
                // System.out.println("Invalid, skipping.");
                // If we fail, reset the board after this pos
                for (int j = pos; j < 81; j++) {
                    if (!board.getTile(SudoFrame.x(j), SudoFrame.y(j)).isLocked()) {
                        board.setTile(SudoFrame.x(j), SudoFrame.y(j), 0, false);
                    }
                }
                continue;
            }
            // for (int j = pos + 1; j < 81; j++) {
            // if (!board.getTile(SudoFrame.x(j), SudoFrame.y(j)).isLocked()) {
            // board.setTile(SudoFrame.x(j), SudoFrame.y(j), 0, false);
            // }
            // }
            boolean doRecurse = recurse2(board, pos + 1);
            if (doRecurse) {
                recurseBoard = board;
                return true;
            }
        }
        return false;
    }

    public SudokuTile[][] getBoard() {
        return board;
    }

    public static boolean isPartialValid(SudoBoard boardin) {
        // #region check horizontal lines
        SudokuTile[][] board = boardin.getBoard();
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
                    if (/* f.getValue() == 0 || */ rowValues[f.getValue() - 1]) {
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
            for (int i = 0; i < 9; i++) {
                rowValues[i] = false;
            }
            for (int row = 0; row < 9; row++) {
                // if value is in array, we had the same num on 1 line, so fail
                if (board[row][col].getValue() != 0) {
                    if (/* board[row][col].getValue() == 0 || */rowValues[board[row][col].getValue() - 1]) {
                        return false;
                    }
                    // otherwise, put value in array
                    rowValues[board[row][col].getValue() - 1] = true;
                }
            }
        }
        // test squares
        boolean[][] sqValues = new boolean[9][9];
        int[][] boardTiles = { { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 },
                { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 },
                { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 },
                { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, };
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (board[x][y].getValue() != 0) {
                    if (sqValues[boardTiles[x][y]][board[x][y].getValue() - 1])
                        return false;
                    sqValues[boardTiles[x][y]][board[x][y].getValue() - 1] = true;
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
                if (f.getValue() == 0 || rowValues[f.getValue() - 1]) {
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
                if (board[row][col].getValue() == 0 || rowValues[board[row][col].getValue() - 1]) {
                    return false;
                }
                // otherwise, put value in array
                rowValues[board[row][col].getValue() - 1] = true;
            }
        }
        // test squares
        boolean[][] sqValues = new boolean[9][9];
        int[][] boardTiles = { { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 },
                { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 },
                { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 },
                { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, };
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (sqValues[boardTiles[x][y]][board[x][y].getValue() - 1])
                    return false;
                sqValues[boardTiles[x][y]][board[x][y].getValue() - 1] = true;
            }
        }
        return true;
    }
}