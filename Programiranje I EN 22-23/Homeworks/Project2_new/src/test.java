import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {

        JFrame frame =new JFrame();
        frame.setBounds(150,150,650,650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        JPanel panel= new JPanel();
        frame.add(panel);
        panel.setBackground(Color.MAGENTA);
    }
}
