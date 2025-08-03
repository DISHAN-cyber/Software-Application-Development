package lk.jiat.smarttrade.util;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppIconUtil {
    
    private static Image appIcon;
    
    static {
        try {
            URL iconPath = AppIconUtil.class.getResource("/lk/jiat/smarttrade/img/store.png");
            ImageIcon icon = new ImageIcon(iconPath);
            AppIconUtil.appIcon = icon.getImage();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid icon path...");
        }
    }

  

    public static void applyIcon(JFrame frame) {
        if (frame != null) {
            frame.setIconImage(appIcon);
        }
    }
}
