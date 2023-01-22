import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton {
    Buttons(int counter){
        setText("" + counter);
        setFont(new Font("Arial", Font.PLAIN, 20));
        setBackground(new Color(0x8FAA26));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(new Color(0xAEC630)));
    }
    Buttons(String type, String argument){
        if (type.equals("START")) {
            setText(argument);
            setMaximumSize(new Dimension(350, 75));
            setBackground(Color.MAGENTA);
            setAlignmentX(Component.CENTER_ALIGNMENT);
            setFont(new Font("Arial", Font.BOLD, 25));
            setBackground(new Color(68, 98, 98));

        }
    }
}
