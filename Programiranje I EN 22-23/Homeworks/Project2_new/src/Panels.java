import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Panels extends JPanel {
    Panels(String type) {
        switch (type) {
            case "top", "bottom":
                setLayout(new BorderLayout());
                setPreferredSize(new Dimension(getHeight(), 60));
                setBackground(new Color(22, 61, 61));
                break;

            //for the starting window
            case "topMENU":
                setPreferredSize(new Dimension(getWidth(), 200));
                setBackground(new Color(8, 61, 41));
                break;
            case "body":
                add(Box.createRigidArea(new Dimension(0, 125)));
                setBackground(new Color(8, 61, 41));
                break;
            case "operations":
                setPreferredSize(new Dimension(35, getHeight()));
                setAlignmentX(Component.RIGHT_ALIGNMENT);
                setBorder(BorderFactory.createEmptyBorder(30,0,30,0));
                break;
        }
    }

    Panels(String type, int n, int m) {
        switch (type) {
            case "middle":
                setLayout(new GridLayout(n, m));
                setBackground(new Color(0xAEC630));


                break;
        }
    }
}
