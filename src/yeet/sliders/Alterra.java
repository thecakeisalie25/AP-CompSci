package yeet.sliders;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Alterra
 */

public class Alterra extends JPanel {
    private static final long serialVersionUID = 2;
    private JSlider red, green, blue;
    private JTextField colorbox;
    private Color color;
    public Alterra(){
        red = new JSlider();
        green = new JSlider();
        blue = new JSlider();
        color = new Color(50, 50, 50);
        colorbox = new JTextField("#323232");

        red.setMaximum(255);
        green.setMaximum(255);
        blue.setMaximum(255);

        red.setMinimum(0);
        green.setMinimum(0);
        blue.setMinimum(0);

        red.addChangeListener(new SliderListener());
        green.addChangeListener(new SliderListener());
        blue.addChangeListener(new SliderListener());

        red.setOrientation(JSlider.VERTICAL);
        green.setOrientation(JSlider.VERTICAL);
        blue.setOrientation(JSlider.VERTICAL);

        add(red);
        add(green);
        add(blue);
        add(colorbox);
        setBackground(color);
        red.setBackground(new Color(255,0,0));
        green.setBackground(new Color(0,255,0));
        blue.setBackground(new Color(0,0,255));        
    }
    
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent event) {
            color = new Color(red.getValue(), green.getValue(), blue.getValue());
            setBackground(color);
            red.setBackground(color);
            green.setBackground(color);
            blue.setBackground(color);
            
            String string = Integer.toString(color.getRed(), 16);
            String string2 = Integer.toString(color.getGreen(), 16);
            String string3 = Integer.toString(color.getBlue(), 16);
            String t = "#" + string + string2 + string3;
            colorbox.setText(t.toUpperCase());
            // JOptionPane.showMessageDialog(null, color.getRed() + " " + color.getGreen() + " " + color.getBlue(), "Color Picker.", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}