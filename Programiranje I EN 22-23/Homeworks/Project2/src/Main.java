import java.util.Random;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.*;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

public class Main {
    static int counter;
    //static JLabel label = new JLabel()      
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();
        JFrame frame = new JFrame();
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                counter = rand.nextInt(10);
                sum = sum + counter;
                JButton b = new JButton("" + counter);
                b.setBackground(Color.BLUE);
                b.setForeground(Color.WHITE);
                b.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                b.putClientProperty( "page", i );

                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b.setBackground(new Color(234567));
                        counter++;
                        button.setTex

                    }
                });
                panel.add(b);
            }
        }
        frame.add(panel, BorderLayout.CENTER);

        JButton top = new JButton("" + sum);
        frame.add(top, BorderLayout.NORTH);

        JButton bottom = new JButton("" + rand.nextInt(500));
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
