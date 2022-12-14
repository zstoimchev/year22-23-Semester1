import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class New {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame with comp.");

        frame.setBounds(500, 400, 320, 200);

        JPanel p = new JPanel();
        JButton jb = new JButton("OK");
        JLabel jLabel = new JLabel("Insert name:");
        JTextField jtf = new JTextField("Write sth.");
        JCheckBox jcb = new JCheckBox("Student");
        JRadioButton jrb = new JRadioButton("Employer");
        JComboBox jcbox = new JComboBox(new String[]{"First", "Second", "Third"});

        p.add(jb);
        p.add(jLabel);
        p.add(jtf);
        p.add(jcb);
        p.add(jrb);
        p.add(jcbox);
        frame.add(p);

        frame.pack();
        //on the end, to be visible and to be able to close the frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}