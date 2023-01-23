import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StartingFrame {
    JFrame frame = new JFrame("More or Less, Less is More!");
    StartingFrame(){
        //top
        Panels top = new Panels("topMENU");
        frame.add(top, BorderLayout.NORTH);
        Labels topLabel = new Labels("topMENU", 0);
        top.add(topLabel, BorderLayout.CENTER);

        //body
        Panels body = new Panels("body");
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
        frame.add(body, BorderLayout.CENTER);

        Buttons btn1 = new Buttons("START", "New Game");
        Buttons btn2 = new Buttons("START", "Load Game");
        Buttons btn3 = new Buttons("START", "Rules");
        Buttons btn4 = new Buttons("START", "Exit");

        body.add(btn1);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn2);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn3);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn4);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The option to load new\ngame is in progress..", "Important Notification!", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "On the first try, you are allowed to click on any button.\nLater you are only allowed to click on the same\nrow and column from the previous button.\nWhen you select the second button, the first button\ngets the value in the order: '(AoperationB)%10'.\n\nThe goal of the game is to reach the target value", "Rules of the game, Made by Zhivko Stoimchev!", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();

                ConfigFrame novo = new ConfigFrame(frame);

                Container contentPane = frame.getContentPane();//need this!!
                contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                frame.revalidate();//need this!!
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setBounds(150, 150, 600, 600);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
