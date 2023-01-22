import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingFrame {
    StartingFrame(){
        JFrame frame = new JFrame();

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
        Buttons btn3 = new Buttons("START", "Options");
        Buttons btn4 = new Buttons("START", "Rules");
        Buttons btn5 = new Buttons("START", "Exit");

        body.add(btn1);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn2);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn3);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn4);
        body.add(Box.createRigidArea(new Dimension(0, 15))); // Add 5 pixels of blank space
        body.add(btn5);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                frame.getContentPane().removeAll();
//                frame.repaint();
                frame.dispose();
                GameEngine newGame = new GameEngine();
            }
        });



        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
