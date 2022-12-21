import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int counter;
    static JLabel label = new JLabel("the velue od the counter is " + counter);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame with a counter");
        frame.setBounds(500, 500, 360, 400);
        JButton button = new JButton("INCREASE");
        //adding actionListener to the button:
        button.addActionListener(e -> {
            counter++;
            label.setText("After increasing the value of the counter is: " + counter);
        });
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame.add(button);
        frame.add(label);

        JButton button1 = new JButton("DECREASE");
        //button.setText(String.valueOf(1));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter--;
                label.setText("the value pod the counter after decreasing is: " + counter);
                button.setBackground(Color.RED);

            }
        });
        frame.add(button1);

        //frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

}
