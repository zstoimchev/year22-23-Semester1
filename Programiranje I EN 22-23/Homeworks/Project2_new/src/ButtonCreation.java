import javax.swing.*;
import java.awt.*;

public class ButtonCreation extends JButton {
    ButtonCreation(int counter) {
        setFont(new Font("Arial", Font.PLAIN, 20));
        setText("" + counter);
        setBackground(new Color(0x8FAA26));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(new Color(0xAEC630)));
    }
}
