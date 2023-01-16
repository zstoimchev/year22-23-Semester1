import javax.swing.*;
import java.awt.*;

public class LabelCreation extends JLabel {

    LabelCreation(String type, int argument){
        switch (type) {
            case "target" -> {
                setText(" Target: " + argument);
                setFont(new Font("Arial", Font.BOLD, 20));
                setForeground(new Color(0xD5E8E8));
            }
            case "moves" -> {
                setText("Moves: " + argument + " ");
                setFont(new Font("Arial", Font.BOLD, 20));
                setForeground(new Color(0xD5E8E8));
            }
            case "sum" -> {
                setText("Sum: " + argument);
                setFont(new Font("Arial", Font.BOLD, 23));
                setForeground(new Color(0xD5E8E8));
            }
            case "operation" -> {
                setAlignmentX(Component.CENTER_ALIGNMENT);
                setFont(new Font("Arial", Font.BOLD, 23));

            }
        }
    }
}
