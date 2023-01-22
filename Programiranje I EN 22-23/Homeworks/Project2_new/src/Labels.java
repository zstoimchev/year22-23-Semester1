import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Labels extends JLabel {
    Labels(String type, int argument) {
        switch (type) {
            case "target":
                setText(" Target: " + argument);
                setFont(new Font("Arial", Font.BOLD, 23));
                setForeground(new Color(0xD5E8E8));
                break;
            case "moves":
                setText("Moves: " + argument + " ");
                setFont(new Font("Arial", Font.BOLD, 23));
                setForeground(new Color(0xD5E8E8));
                break;
            case "sum":
//                setText("Sum: " + argument);
                setFont(new Font("Arial", Font.BOLD, 23));
                setForeground(new Color(0xD5E8E8));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "operations":
                setAlignmentX(Component.CENTER_ALIGNMENT);
                setFont(new Font("Arial", Font.BOLD, 23));
                break;


                //for first start page
            case "topMENU":
                setText("More or Less - Less is More");
                setFont(new Font("Arial", Font.BOLD, 50));
                setForeground(Color.white);
                setBorder(new EmptyBorder(60,0,0,0));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
        }

    }
}
