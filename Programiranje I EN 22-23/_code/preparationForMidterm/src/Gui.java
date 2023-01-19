import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
        static int num=0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("New frame");
        frame.setBounds(500,500,300,400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        frame.add(panel);

        JButton button1 = new JButton();
        panel.add(button1);

        JButton button2 = new JButton();
        panel.add(button2);

        JButton button3 = new JButton();
        panel.add(button3);

        JButton button4 = new JButton();
        panel.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText(""+ ++num);
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
