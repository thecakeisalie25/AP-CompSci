package yeet.gfxTut;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Toot extends Canvas implements ActionListener {
    private static final long serialVersionUID = 1L;
    public static int xPos, yPos, yV, xV;

    Timer timer = new Timer(1000/60, this);
    public Toot() {
        super();
        timer.start();
    }
    public static void main(String[] args) throws InterruptedException {
        // timer.start();
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
        canvas.addMouseListener(new Toot().new TootMListener());
        xPos = rand.nextInt(400);
        yPos = rand.nextInt(400);
        xV = rand.nextInt(5) + 1;
        yV = rand.nextInt(5) + 1;
        while (true) {
            Thread.sleep(1000 / 60);
            canvas.repaint();
        }
    }

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
        xPos += xV;
        yPos += yV;
        g.fillOval(xPos, yPos, 6, 6);
    }

    private class TootMListener implements MouseListener {
        Random rand = new Random();

        @Override
        public void mouseClicked(MouseEvent e) {
            xV = rand.nextInt(5) + 1;
            yV = rand.nextInt(5) + 1;
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if(e.getSource() == timer){
            repaint();
        // }
    }
}