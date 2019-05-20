package ch12.elevens;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;



/**
 * CardButton
 */
public class CardButton extends JToggleButton {

    private static final int height = 175;

    private static final int width = 130;

    private static final long serialVersionUID = 1L;

    private Card card = null;

    public void clear() {
        super.setSelected(false);
        super.setText("");
        super.setIcon(null);
        card = null;
    }

    public int getPoints() {
        return card.getPoints();
    }

    /**
     * @return the card
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(Card card) {
        this.card = card;
        super.setIcon(new ImageIcon(card.getIcon().getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
    }

    public void setCard() {
        this.card = null;
        super.setIcon(new ImageIcon(Card.getNullIcon().getImage()));
    }
}