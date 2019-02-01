package yeet.supremevote;

import java.awt.Color;
import java.awt.Rectangle;

// import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
        
public class Count
{
    static final long serialVersionUID = 0b100100101010010101010111110010;
    public static void main(String[] args) 
    {
        JFrame graphics = new JFrame();

        graphics.setSize(800, 600);
        graphics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphics.setResizable(false);
        graphics.setBackground(new Color(.5f, .7f, 1.0f));
        JButton vyes = new JButton("Vote A");
        vyes.setLocation(100, 20);
        vyes.setSize(50, 50);
        vyes.setBounds(new Rectangle(60, 60));

        JButton vno = new JButton("Vote B");
        vno.setLocation(60, 20);
        vno.setSize(50, 50);
        vno.setBounds(new Rectangle(60, 60));
        
        
        graphics.add(vyes);
        graphics.add(vno);
        graphics.setVisible(true);
    }
}