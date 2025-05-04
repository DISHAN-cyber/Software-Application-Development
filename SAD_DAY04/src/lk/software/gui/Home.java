
package lk.software.gui;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Home extends JFrame {
    public Home(){
        init();
        
    }
    
    private void init(){
      this.setSize(400, 400);
      this.setLocationRelativeTo(null);
      this.setTitle("Practical");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      JTextField t1 = new JTextField();
      JButton b1 =  new JButton("click");
      
      b1.addActionListener((ActionEvent e) -> {
          System.out.println(t1.getText());      });
      
      JPanel panel = new JPanel();
      panel.add(t1);
      panel.add(b1);
      this.setLayout(new BorderLayout());
      this.add(panel,BorderLayout.CENTER);
       
    }
            
    public static void main(String[] args) {
        
        FlatLightLaf.setup();
        Home h = new Home();
        h.setVisible(true);
    }    
}
