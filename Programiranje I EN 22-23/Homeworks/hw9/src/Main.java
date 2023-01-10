import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame frame = new JFrame("Hello world window");
        frame.setBounds(200,200,400,200);

        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        //JLabel label1 = new JLabel();
    }
}
