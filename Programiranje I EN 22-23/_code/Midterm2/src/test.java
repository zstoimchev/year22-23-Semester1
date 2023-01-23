import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    static int a=0, b=0, c=0, d=0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("test 1");
        frame.setBounds(150, 100, 300, 300);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        frame.add(panel);

        JButton button1 = new JButton();
        button1.setText(""+a);
        panel.add(button1);

        JButton button2 = new JButton();
        button2.setText(""+b);
        panel.add(button2);

        JButton button3 = new JButton();
        button3.setText(""+c);
        panel.add(button3);

        JButton button4 = new JButton();
        button4.setText(""+d);
        panel.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button1.setText(""+ ++a);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button1.setText(""+ ++a);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button2.setText(""+ ++b);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button3.setText(""+ ++c);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button4.setText(""+ ++d);
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
