package ch12.elevens;

import javax.swing.JToggleButton;



/**
 * CardButton
 */
public class CardButton extends JToggleButton {

    private static final long serialVersionUID = 1L;

    private Card card = null;

    public void clear() {
        super.setSelected(false);
        super.setText("");
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
        super.setText(card.toString());
    }
}