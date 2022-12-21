import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(3);

        //add stuff

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());


        JButton button = new JButton("hello");
        JButton button2 = new JButton("frefre");
        northPanel.add(button, BorderLayout.NORTH);
        northPanel.add(button2, BorderLayout.NORTH);

        frame.add(northPanel,BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(9,9));
        for (int i = 0; i <9; i++) {
            for (int j = 0; j < 9; j++) {
                JButton b = new JButton(""+i+","+j);

                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        b.setBackground(new Color(234567));

                    }
                });
                centerPanel.add(b);
            }
            
        }
        frame.add(centerPanel);
        //end
        frame.setVisible(true);
    }
}

//container
    //component