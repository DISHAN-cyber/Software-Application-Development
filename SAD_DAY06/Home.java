
package lk.software.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home extends JFrame {

    public Home() {
        init();
    }
    
    private void init(){
    this.setSize(400, 400);
    this.setTitle("Event Handling");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 =new JPanel();
    
    JComboBox <String> c1 = new JComboBox(new String[]{"Apple","Orange","PineApple","Mango"});
    c1.setPreferredSize(new Dimension(150,25));
    p1.add(c1);
    
    
    c1.addActionListener((ActionEvent e) -> {
        System.out.println("Selected Fruit Items Is:" +c1.getSelectedItem().toString());
    });
    
    this.setLayout(new BorderLayout());
    this.add(p1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home().setUndecorated(true);
    }
}

