package yeet.sudoku;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * SudoFrame
 */
public class SudoFrame extends JFrame {

    private static final int BORDER_WIDTH = 1;
    private static final Color BORDER_COLOR = new Color(0, 0, 0);
    private static final long serialVersionUID = 1L;
    private JButton[] buttonsArray = new JButton[81];
    private SudoBoard board;

    public SudoFrame() {
        super();
        GridLayout grid = new GridLayout(9, 9);
        //#region
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
        //#endregion
        BorderLayout border = new BorderLayout();
        setLayout(border);
        Container pane = getContentPane();
        JPanel gridpanel = new JPanel(grid);
        JButton buttonDo = new JButton("do the thing");
        buttonDo.setActionCommand("do");
        buttonDo.addActionListener(new DoListener());
        pane.setLayout(border);
        add(gridpanel, BorderLayout.CENTER);
        add(buttonDo, BorderLayout.PAGE_END);
        for (int i = 0; i < 81; i++) {
            buttonsArray[i] = new JButton("" + i);
            buttonsArray[i].addActionListener(new ButtonActivator());
            buttonsArray[i].setActionCommand(i + "");
            gridpanel.add(buttonsArray[i]);
        }
        setMinimumSize(new Dimension(512, 512));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        board = new SudoBoard();
        updateBoard(board);
    }

    public static void main(String[] args) {
        new SudoFrame();
    }

    /**
     * 
     * @param x column, starting at 0 (most significant)
     * @param y row, starting at 0 (least significant)
     * @return list index
     */
    public static int xy2list(int x, int y) {
        return (x * 9) + y;
    }

    public static int y(int l) {
        return l % 9;
    }

    public static int x(int l) {
        return l / 9;
    }

    public void updateBoard(SudoBoard board) {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                JButton lButton = buttonsArray[xy2list(x, y)];
                if (board.getTile(x, y).isLocked()) {
                    lButton.setBackground(new Color(193, 0, 35));
                } else {
                    lButton.setBackground(null);
                    // lButton.setBackground(new Color(0, 170, 255));
                }
                int top = 0;
                int left = 0;
                if (y%3 == 0 && y != 0) {
                    left = BORDER_WIDTH;
                }
                if (x%3 == 0 && x != 0) {
                    top = BORDER_WIDTH;
                }
                lButton.setBorder(BorderFactory.createMatteBorder(top, left, 0-top, 0-left, BORDER_COLOR));
                if (board.getTile(x, y).getValue() == 0) {
                    lButton.setText(null);
                } else {
                    lButton.setText(Integer.toString(board.getTile(x, y).getValue()));
                }
            }
        }
    }

    private class ButtonActivator implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int y = y(Integer.decode(event.getActionCommand()));
            int x = x(Integer.decode(event.getActionCommand()));
            if(board.getTile(x, y).getValue() == 9){
                board.setTile(x, y, -1, board.getTile(x, y).isLocked());
            }
            int v = board.getTile(x, y).getValue()+1;
            // If v = 0, unlock the tile.
            board.setTile(x, y, v, v!=0);  
            updateBoard(board);
        }

    }
    
    private class DoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if(board.recurse2(board, 0)){
                updateBoard(SudoBoard.getRecurseCache());
            }
            
        }
        
    }
}