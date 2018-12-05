package yeet.graphic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Alterra
 */

enum BeaconColor{red,blue,green,black,purple}

public class Alterra extends JPanel{
    private static final long serialVersionUID = 1;
    private BeaconColor bcolor1,bcolor2,bcolor3,bcolor4,bcolor5;
    private JButton cbutton1,cbutton2,cbutton3,cbutton4,cbutton5;
    public Alterra(){
        bcolor1 = BeaconColor.blue;
        bcolor2 = BeaconColor.blue;
        bcolor3 = BeaconColor.blue;
        bcolor4 = BeaconColor.blue;
        bcolor5 = BeaconColor.blue;
        cbutton1 = new JButton("Change Color 1");
        cbutton1.addActionListener(new ButtonListener());
        cbutton2 = new JButton("Change Color 2");
        cbutton2.addActionListener(new ButtonListener());
        cbutton3 = new JButton("Change Color 3");
        cbutton3.addActionListener(new ButtonListener());
        cbutton4 = new JButton("Change Color 4");
        cbutton4.addActionListener(new ButtonListener());
        cbutton5 = new JButton("Change Color 5");
        cbutton5.addActionListener(new ButtonListener());
        add(cbutton1);
        add(cbutton2);
        add(cbutton3);
        add(cbutton4);
        add(cbutton5);
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event){

            if (event.getSource() == bcolor1) {
                bcolor1 = cycleColor(bcolor1);
            }
            if (event.getSource() == bcolor2) {
                bcolor2 = cycleColor(bcolor2);
            }
            if (event.getSource() == bcolor3) {
                bcolor3 = cycleColor(bcolor3);
            }
            if (event.getSource() == bcolor4) {
                bcolor4 = cycleColor(bcolor4);
            }
            if (event.getSource() == bcolor5) {
                bcolor5 = cycleColor(bcolor5);
            }
        setColor(bcolor5, cbutton5);
        setColor(bcolor4, cbutton4);
        setColor(bcolor3, cbutton3);
        setColor(bcolor2, cbutton2);
        setColor(bcolor1, cbutton1);
        }
        private BeaconColor cycleColor(BeaconColor beacon) {
            switch(beacon){
                    default:
                        return BeaconColor.red;
                    case red:
                        return BeaconColor.blue;
                    case blue:
                        return BeaconColor.green;
                    case green:
                        return BeaconColor.black;
                    case black:
                        return BeaconColor.purple;
                    case purple:
                        return BeaconColor.red;
            }
        }
        private void setColor(BeaconColor beacon, JButton button){
            switch(beacon){
                case red:
                    button.setBackground(new Color(0.9f, 0f, 0f));
                break;
                case blue:
                    button.setBackground(new Color(0f, 0.2f, 0.9f));
                break;
                case green:
                    button.setBackground(new Color(0f, 0.9f, 0.2f));
                break;
                case black:
                    button.setBackground(new Color(0.2f, 0.2f, 0.2f));
                break;
                case purple:
                    button.setBackground(new Color(0.6f, 0f, 0.7f));
                break;
            }
        }
    }
}