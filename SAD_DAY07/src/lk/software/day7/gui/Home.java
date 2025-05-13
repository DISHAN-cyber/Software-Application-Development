package lk.software.day7.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home extends JFrame {

    public Home() {
        init();
    }

    private void init() {
        this.setTitle("Layouts");
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();

        FlowLayout fl = new FlowLayout();
        p1.setLayout(fl);
        
        fl.setAlignment(FlowLayout.LEADING);

        JButton b1 = new JButton("BTN 1");
        b1.setPreferredSize(new Dimension (150,30));
        JButton b2 = new JButton("BTN 2");
        JButton b3 = new JButton("BTN 3");
        JButton b4 = new JButton("BTN 4");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home().setVisible(true);
    }
}
