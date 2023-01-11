import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    static int[][] counter = new int[9][9];
    //static JLabel label = new JLabel()
    static int i;
    static int j;
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();

        JFrame frame = new JFrame();
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 9));
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                counter[i][j] = rand.nextInt(10);
                sum = sum + counter[i][j];
                JButton b = new JButton("" + counter[i][j]);
                b.setBackground(Color.BLUE);
                b.setForeground(Color.WHITE);
                b.setBorder(BorderFactory.createLineBorder(Color.BLACK));


                b.addActionListener(e -> {
                    b.setBackground(Color.CYAN);
                });

                
                // b.setText("null");
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
