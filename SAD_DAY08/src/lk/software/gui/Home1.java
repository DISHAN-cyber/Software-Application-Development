package lk.software.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Home1 extends JFrame {

    public Home1() {
        init();
    }

    private void init() {
        this.setTitle("Layout-part 2");
        this.setSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();

        CardLayout c1 = new CardLayout();
        p1.setLayout(c1);

      
        JButton b1 = new JButton("BTN 1");
        JButton b2 = new JButton("BTN 2");
        JButton b3 = new JButton("BTN 3");
      
        p1.add(b1,"card_1");
        p1.add(b2,"card_2");
        p1.add(b3,"card_3");
      
       c1.previous(p1);

        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home1().setVisible(true);
    }
}

