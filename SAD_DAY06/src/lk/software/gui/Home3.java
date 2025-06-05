package lk.software.gui;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home3 extends JFrame {

    public Home3() {
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
    
    c1.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) {
         if(e.getStateChange()== ItemEvent.SELECTED){
             System.out.println("CheckBox is Selected");
         }else {
             System.out.println("CheckBox is Deselected");
         }
       }
    });
    
      this.setLayout(new BorderLayout());
      this.add(p1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home3().setUndecorated(true);
    }
}

