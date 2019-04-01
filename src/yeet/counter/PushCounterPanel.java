package yeet.counter;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PushCounterPanel extends JPanel {
	public static void main(String[] args) {
		buttom.main(args);
	}
	private static final long serialVersionUID = 457689976;
	private int count;
	private JButton push ;
	private JLabel label;
	private JButton bt;
	public PushCounterPanel() {
		int R = (int)(Math.random()*256);
		int G = (int)(Math.random()*256);
		int B = (int)(Math.random()*256);
		Color color = new Color(R, G, B); //random color, but can be bright or dull

		//to get rainbow, pastel colors
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
		final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
		color = Color.getHSBColor(hue, saturation, luminance);
		count = 0;
		bt = new JButton("Change Color");
		// bt.setShape(new Circle(1.5));
	//	bt.setSize(10,10);
		push = new JButton("E");
		
	//	reset = new JButton("Reset count");
		push.addActionListener(new ButtonListener());
		bt.addActionListener(new ButtonListener());
	//	reset.addActionListener(new ButtonListener());
		label = new JLabel("No. " + count);
		 add(push);
		// add(reset);
		 add(label);
		 add(bt);
		// for(int i = 0; i < 99999999; i++) {
		 setPreferredSize(new Dimension(200, 200));
		 setBackground(color);
		 //}
	}
	private class ButtonListener implements ActionListener{
		
	public void actionPerformed(ActionEvent event) {
		int R = (int)(Math.random()*256);
		int G = (int)(Math.random()*256);
		int B= (int)(Math.random()*256);
		Color color = new Color(R, G, B); //random color, but can be bright or dull

		//to get rainbow, pastel colors
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
		final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
		color = Color.getHSBColor(hue, saturation, luminance);
		if(event.getSource() == push) {
			count++;
		label.setText("Sauce on me: " + count);
		push.setText("eat people: " + count * 2);
		push.setForeground(color);
		
		}
		if(event.getSource() == bt) {
			
			
			setBackground(color);
			
		}
	}
	}
	
}
