import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Task1 {
    static Random rand = new Random();
    static JLabel bottomLabel = new JLabel();
    static int topRandomNum = rand.nextInt(100);
    static JButton button = new JButton("Generate random number");

    public static void main(String[] args) {
        Random rand = new Random();

        JFrame frame = new JFrame("Task 1");
        frame.setBounds(200, 200, 300, 200);


        JPanel top = new JPanel();
        JLabel topLabel = new JLabel();
        topLabel.setText(""+topRandomNum);
        top.add(topLabel, BorderLayout.NORTH);
        frame.add(top, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.add(button, BorderLayout.CENTER);
        frame.add(center, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottomLabel.setText(""+ (-1));
        bottom.add(bottomLabel, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int newNum = rand.nextInt(100);
                bottomLabel.setText(""+newNum);
                if(newNum==topRandomNum)
                    button.setEnabled(false);

            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
