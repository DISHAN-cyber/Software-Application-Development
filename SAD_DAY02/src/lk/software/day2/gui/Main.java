
package lk.software.day2.gui;



import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Main extends JFrame{
    
    public Main(){
        setTitle("MY Sotware");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JButton button1 = new JButton("A");
        JButton button2 = new JButton("B");
        JButton button3 = new JButton("C");
        
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        add(button1);
        add(button2);
        add(button3);
        
        
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
