package yeet.gfxTut;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Toot extends Canvas {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Toot();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        while (true) {
            Thread.sleep(1000 / 60);
            canvas.repaint();
        }
    }

    public void paint(Graphics g) {
        Random rand = new Random();
        g.fillOval(rand.nextInt(200), rand.nextInt(200), 200, 200);
    }
}