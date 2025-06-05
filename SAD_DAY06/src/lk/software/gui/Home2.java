package lk.software.gui;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Home2 extends JFrame {

    public Home2() {
        init();
    }
    
    private void init(){
    this.setSize(400, 400);
    this.setTitle("Event Handling");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 =new JPanel();
    
    JComboBox <String> c1 = new JComboBox(new String[]{"Apple","Orange","PineApple","Mango"});
    c1.setSelectedIndex(1);
    c1.setPreferredSize(new Dimension(150,25));
    p1.add(c1);
    
    c1.addPopupMenuListener(new PopupMenuListener(){
         @Override
        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            System.out.println("Popup visible");}

        @Override
        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            System.out.println("Popup Invisible");}

        @Override
        public void popupMenuCanceled(PopupMenuEvent e) {
            System.out.println("Popup canceled");}
    });
       
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Home2().setUndecorated(true);
    }
}
