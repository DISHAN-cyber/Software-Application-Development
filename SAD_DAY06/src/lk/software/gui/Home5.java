package lk.software.gui;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Home5 extends JFrame {

    public Home5() {
        init();
    }
    
    private void init(){
    this.setSize(400, 400);
    this.setTitle("Event Handling");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 =new JPanel();
    
    JCheckBox c1 = new JCheckBox("Show Password");
    p1.add(c1);
    
    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("FeMale");
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    
    p1.add(r1);
    p1.add(r2);
    
    r1.setSelected(true);
    r1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Radio Button Selected1;" + r1.isSelected());        }
        
    });
    
    r2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Radio Button Selected2;" + r2.isSelected());        }
        
    });
      this.setLayout(new BorderLayout());
      this.add(p1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home5().setUndecorated(true);
    }
}

