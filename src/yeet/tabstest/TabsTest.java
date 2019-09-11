package yeet.tabstest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class TabsTest extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        JFrame frame = new JFrame("yeet");
        JPanel panel = new JPanel();
        BorderLayout mainLayout = new BorderLayout();
        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
        JButton button = new JButton("Yeah,, ");
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        // button.setVisible(true);
        // mainLayout.addLayoutComponent(button, BorderLayout.NORTH);
        // mainLayout.addLayoutComponent(tabs, BorderLayout.CENTER);
        tabs.add("Yeah, let's go home.", null);
        tabs.add("Nah.", null);
        frame.setMinimumSize(new Dimension(256, 256));
        // frame.add(tabs);
        panel.setLayout(mainLayout);
        panel.add(tabs, BorderLayout.CENTER);
        panel.add(button, BorderLayout.NORTH);
        frame.add(panel);
        frame.validate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}