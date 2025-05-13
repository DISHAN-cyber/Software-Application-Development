package lk.software.day7.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home1 extends JFrame {

    public Home1() {
        init();
    }

    private void init() {
        this.setTitle("Layouts");
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();

        BorderLayout bl = new BorderLayout(5, 5);
        p1.setLayout(bl);

        JButton b1 = new JButton("BTN NORTH");
        JButton b2 = new JButton("BTN EAST");
        JButton b3 = new JButton("BTN SOUTH");
        JButton b4 = new JButton("BTN WEST");
        JButton b5 = new JButton("BTN CENTER");
        
        p1.add(b1, BorderLayout.NORTH);
        p1.add(b2,BorderLayout.EAST);
        p1.add(b3,BorderLayout.SOUTH);
        p1.add(b4,BorderLayout.WEST);
        p1.add(b5,BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home().setVisible(true);
    }
}
