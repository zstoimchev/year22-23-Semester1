import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class Main {
    static int counter=0;
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Incrementing button");
        frame.setBounds(400, 400, 250, 200);

        JButton button = new JButton(""+counter);
        button.addActionListener(e -> {
            counter++;
            button.setText(""+counter);
        });
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame.add(button);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
