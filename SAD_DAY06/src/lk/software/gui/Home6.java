package lk.software.gui;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Home6 extends JFrame {

    public Home6() {
        init();
    }
    
    private void init(){
    this.setSize(400, 400);
    this.setTitle("Event Handling");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 =new JPanel();
    
    JButton b1 = new JButton("Submit");
    p1.add(b1);
    
    b1.addMouseListener(new MouseAdapter(){
         @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Hello");
        }
        
         @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse Entered");
        }
        
    });
    
    
   
      this.setLayout(new BorderLayout());
      this.add(p1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home6().setUndecorated(true);
    }
}
