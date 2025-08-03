package lk.jiat.smarttrade.component;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;

public class RoundButton extends JButton {

    public RoundButton() {
        init();
    }
    private void init() {
        putClientProperty(FlatClientProperties.STYLE, "arc:50");
    }
}
