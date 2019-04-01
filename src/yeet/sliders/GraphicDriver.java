package yeet.sliders;
        
import java.util.Scanner;

import javax.swing.JFrame;
        
public class GraphicDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        JFrame frame = new JFrame("Alterra Debug Mode");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Alterra());
        frame.pack();
        frame.setVisible(true);
        
        input.close();
    }
}