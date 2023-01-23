import javax.swing.*;
import java.awt.*;

public class GUI {

    //to store reference to buttons
    public static JButton[][] buttons;
    public static JFrame frame = new JFrame();


    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setTitle("First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton save = new JButton("Save");
        frame.add(save,BorderLayout.NORTH);

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(9,9));

        buttons = new JButton[9][9];
        Listener l = new Listener(buttons);
        save.addActionListener(l);


        for (int i=0; i < 9 ; i++){
            for (int j=0; j < 9; j++){
                buttons[i][j] = new JButton("0");
                content.add(buttons[i][j]);
                buttons[i][j].setBackground(Color.RED);
                buttons[i][j].addActionListener(l);
            }
        }

        //add the Panel on the Frame
        frame.add(content);

    }
}