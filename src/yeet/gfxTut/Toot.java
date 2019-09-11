package yeet.gfxTut;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class Toot extends Canvas {
    private static final long serialVersionUID = 1L;
    public static int xPos, yPos, yV, xV;

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Toot();
        canvas.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xV = rand.nextInt(5) + 1;
                yV = rand.nextInt(5) + 1;
            }
        });
        xPos = rand.nextInt(400);
        yPos = rand.nextInt(400);
        xV = rand.nextInt(5) + 1;
        yV = rand.nextInt(5) + 1;
        new javax.swing.Timer(1000 / 60, e -> canvas.repaint()).start();
    }

    @Override
    public void paint(Graphics g) {
        Random rand = new Random();
        if (xPos < 0) {
            xV += rand.nextInt(2) - 1;
            xV = 0 - xV;
        }
        if (yPos < 0) {
            yV += rand.nextInt(2) - 1;
            yV = 0 - yV;
        }
        if (xPos > 400) {
            xV += rand.nextInt(2) - 1;
            xV = 0 - xV;
        }
        if (yPos > 400) {
            yV += rand.nextInt(2) - 1;
            yV = 0 - yV;
        }
        xPos = (xPos + xV) ;
        yPos = (yPos + yV) ;
        g.fillOval(xPos, yPos, 6, 6);
    }
}