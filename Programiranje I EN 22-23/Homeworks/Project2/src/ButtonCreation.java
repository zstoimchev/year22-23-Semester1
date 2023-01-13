import javax.swing.*;
import java.awt.*;

public class ButtonCreation {

    public static JButton createButton(int i, int y, int counter){
        JButton b = new JButton();
        b = new JButton();
        b.setFont(new Font("Arial", Font.PLAIN, 20));
        b.setText("" + counter);
        b.setBackground(Color.PINK);
        b.setForeground(Color.WHITE);
        b.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        return b;
    }

}
