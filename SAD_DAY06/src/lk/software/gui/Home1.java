
package lk.software.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home1 extends JFrame {

    public Home1() {
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
    
    c1.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange()== ItemEvent.SELECTED){
                System.out.println("Item selected:" + e.getItem());
            } else {
                System.out.println("Item Deselected:" + e.getItem());
            }
        }
    
    });
    
    
    this.setLayout(new BorderLayout());
    this.add(p1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home1().setUndecorated(true);
    }
}

