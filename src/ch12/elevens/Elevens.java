package ch12.elevens;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Elevens extends JFrame {

    public static boolean cheatMode = true;
    public static boolean reset = false;
    private static final long serialVersionUID = 1L;
    private static CardButton[] cardButtons;
    private static Deck deck;
    public static MenuItem score;

    public static void main(String[] args) {

        // Create a panel and add components to it.
        JFrame frame = new Elevens();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deck = new Deck();
        frame.add(new Container());
        frame.setMinimumSize(new Dimension(512, 512));
        frame.pack();
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");

        ElevensListener actoBoy = new Elevens().new ElevensListener();

        MenuItem reset = new MenuItem("Reset");
        reset.setActionCommand("reset");
        reset.addActionListener(actoBoy);

        MenuItem exit = new MenuItem("Exit");
        exit.setActionCommand("exit");
        exit.addActionListener(actoBoy);

        fileMenu.add(reset);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        Menu gameMenu = new Menu("Game");

        score = new MenuItem("Your score will show here");
        score.setActionCommand("score");

        MenuItem submit = new MenuItem("Submit");
        submit.setActionCommand("submit");
        submit.addActionListener(actoBoy);

        Menu rulesMenu = new Menu("Rules");

        String[] rules = { "Select 2 or 3 cards", "If 2 cards add up to 11", "or 3 cards are K, Q, & J",
                "they get removed.", "Remove all cards to win." };
        for (String e : rules) {
            MenuItem o = new MenuItem(e);
            // o.setEnabled(false);
            rulesMenu.add(o);
        }

        MenuItem cheat = new MenuItem("Gravity? Who gives a crap about Gravity?");
        cheat.setActionCommand("cheat");
        cheat.addActionListener(actoBoy);

        gameMenu.add(score);
        gameMenu.addSeparator();
        gameMenu.add(submit);
        if (cheatMode)
            gameMenu.add(cheat);

        menuBar.add(fileMenu);
        menuBar.add(gameMenu);
        menuBar.add(rulesMenu);
        frame.setMenuBar(menuBar);

        // ButtonGroup cardbg = new ButtonGroup();
        GridLayout grid = new GridLayout(3, 3);
        JPanel stuffPanel = new JPanel();
        cardButtons = new CardButton[9];
        for (int i = 0; i < 9; i++) {
            cardButtons[i] = new CardButton();
            cardButtons[i].setSize(50, 50);
            stuffPanel.add(cardButtons[i]);
        }
        stuffPanel.setLayout(grid);
        frame.add(stuffPanel);
        frame.validate();
        frame.pack();
        frame.setVisible(true);
        setCards();

    }

    public static void gameLoop() {

    }

    public static void setCards() {
        for (CardButton e : cardButtons) {
            try {
                if (e.getCard() == null) {
                    e.setCard(deck.pop());
                    if (e.getCard().isRoyal()) {
                        e.setText(e.getText());
                    }
                    score.setLabel(deck.getCount() + " cards left");
                }
            } catch (Exception ex) {
                e.setText("Yeeeet!");
                e.setEnabled(false);
            }
        }
        boolean winner = true;
        for (CardButton e : cardButtons) {
            if (e.isEnabled()) {
                winner = false;
            }
        }
        if (winner) {
            JOptionPane.showMessageDialog(null, "You win!", "Nice job!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * 
     * @param index 0-8
     */
    public void removeCard(int index) {

    }

    private class ElevensListener extends Elevens implements ActionListener {

        private static final long serialVersionUID = 1L;

        @Override
        public void actionPerformed(ActionEvent event) {
            switch (event.getActionCommand()) {
            case "exit":
                System.exit(0);
                break;
            case "reset":
                for (CardButton e : cardButtons) {
                    e.clear();
                }
                deck = new Deck();
                setCards();
                break;
            case "submit":
                int c = 0;
                int v = 0;
                for (CardButton e : cardButtons) {
                    if (e.isSelected()) {
                        // System.out.println("Selected: " + e.getCard());
                        c++; // sighs
                        v += e.getPoints();
                    }
                }
                if ((c == 2 && v == 11) || (c == 3 && v == 336)) {
                    for (CardButton e : cardButtons) {
                        if (e.isSelected()) {
                            e.clear();
                        }
                    }
                    setCards();
                } else {
                    for (CardButton e : cardButtons) {
                        e.setSelected(false);
                    }
                }

                break;
            case "cheat":
                for (CardButton e : cardButtons) {
                    e.clear();
                }
                setCards();
                break;
            }
        }
    }
}