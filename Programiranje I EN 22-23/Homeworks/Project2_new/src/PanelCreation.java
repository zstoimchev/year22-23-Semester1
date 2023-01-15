import javax.swing.*;
import java.awt.*;

public class PanelCreation extends JPanel {
    PanelCreation(String typePanel, String typeLabel, int argument){
        switch (typePanel) {
            case "topPanel" -> {
                LabelCreation labelTop = new LabelCreation("top", argument);
                add(labelTop, BorderLayout.WEST);
            }
            case "sumPanel" -> {
                LabelCreation sumLabel = new LabelCreation("sum", argument);
                add(sumLabel, BorderLayout.SOUTH);
                setBackground(new Color(22, 61, 61));
            }
            case "bottom" -> {
                setBackground(new Color(22, 61, 61));
            }
        }
    }
}
