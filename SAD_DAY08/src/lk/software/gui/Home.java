package lk.software.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

    public Home() {
        init();
    }

    private void init() {
        this.setTitle("Layout-part 2");
        this.setSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();

        BoxLayout bl = new BoxLayout(p1, BoxLayout.Y_AXIS);
        p1.setLayout(bl);

        EmptyBorder eb = new EmptyBorder(8, 8, 18, 8);

        JButton b1 = new JButton("BTN 1");
        Dimension d1 = new Dimension(150, 40);
        b1.setPreferredSize(new Dimension(150, 40));
        b1.setMinimumSize(new Dimension(150, 40));
        b1.setMaximumSize(new Dimension(150, 40));
        JButton b2 = new JButton("BTN 2");
        JButton b3 = new JButton("BTN 3");
        JButton b4 = new JButton("BTN 4");

        p1.add(b1);
        p1.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
        p1.add(javax.swing.Box.createVerticalStrut(10));
        p1.add(b2);
        p1.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
        p1.add(b3);
        p1.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
        p1.add(b4);
        p1.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));

        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home().setVisible(true);
    }
}
