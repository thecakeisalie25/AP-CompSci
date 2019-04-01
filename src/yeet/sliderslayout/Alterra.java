package yeet.sliderslayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Alterra
 */

public class Alterra extends JPanel {
    private static final long serialVersionUID = 4;
    private JPanel textPanel = new JPanel();
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
        colorbox.addActionListener(new TextListener());

        red.setOrientation(JSlider.VERTICAL);
        green.setOrientation(JSlider.VERTICAL);
        blue.setOrientation(JSlider.VERTICAL);

        add(red);
        add(green);
        add(blue);
        // colorbox.setLocation(red.getHeight(), red.getHeight());
        textPanel.add(colorbox);
        add(textPanel);
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
            
            String reds = Integer.toString(color.getRed(), 16);
            if(reds.length() == 1) reds = "0" + reds;
            String greens = Integer.toString(color.getGreen(), 16);
            if(greens.length() == 1) greens = "0" + greens;
            String blues = Integer.toString(color.getBlue(), 16);
            if(blues.length() == 1) blues = "0" + blues;
            String t = "#" + reds + greens + blues;
            colorbox.setText(t.toUpperCase());
            // JOptionPane.showMessageDialog(null, color.getRed() + " " + color.getGreen() + " " + color.getBlue(), "Color Picker.", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private class TextListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String boxString = colorbox.getText();
            boxString = boxString.replace("#", "");
            if(boxString.length() != 6)
            {
                return;
            }
            if(boxString.matches(".*[G-Zg-z].*")){
                return;
            }
            String redhex = boxString.substring(0, 2);
            String greenhex = boxString.substring(2, 4);
            String bluehex = boxString.substring(4, 6);

            System.out.println(redhex);
            System.out.println(greenhex);
            System.out.println(bluehex);

            color = new Color(Integer.decode("0x" + redhex), Integer.decode("0x" + greenhex), Integer.decode("0x" + bluehex));

            setBackground(color);
            red.setBackground(color);
            green.setBackground(color);
            blue.setBackground(color);

            red.setValue(Integer.decode("0x" + redhex));
            green.setValue(Integer.decode("0x" + greenhex));
            blue.setValue(Integer.decode("0x" + bluehex));
        }
    }
}