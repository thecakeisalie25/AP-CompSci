package yeet.counter;

import javax.swing.JFrame;

public class buttom {
	public static void main(String[] args) {
		JFrame frame = new JFrame("YeetMustard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PushCounterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
