import javax.swing.*;
import java.awt.*;

public class PanelCreation extends JPanel {

    PanelCreation(String typePanel){
        switch (typePanel) {
            case "topPanel", "bottom" -> {
                setLayout(new BorderLayout());
                setPreferredSize(new Dimension(getHeight(), 60));
                setBackground(new Color(22, 61, 61));
            }

        }
    }
}
