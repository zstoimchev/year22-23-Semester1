import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TenButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(500, 500, 600, 400);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
        int n = 10;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                JButton button = new JButton();
                char letter = (char) (rand.nextInt(25) + 'A');
                button.setText(String.valueOf(letter));
                button.addActionListener(e -> {
                    button.setBackground(Color.BLUE);
                    button.setForeground(Color.WHITE);
                });
                frame.add(button);
            } else {
                JButton button = new JButton();
                int number = (rand.nextInt(25));
                button.setText(String.valueOf(number));
                button.addActionListener(e -> {
                    button.setBackground(Color.RED);
                    button.setForeground(Color.WHITE);
                    button.setSize(50, 50);
                });
                frame.add(button);


            }
        }

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

}
