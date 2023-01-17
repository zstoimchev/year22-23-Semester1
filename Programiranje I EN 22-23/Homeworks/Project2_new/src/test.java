import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Menu Bar Example");


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//=================
        panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        panel.setBorder(BorderFactory.createEmptyBorder(30,0,30,0));

        JLabel label1 = new JLabel("Label 1");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel label2 = new JLabel("Label 2");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel label3 = new JLabel("Label 3");
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel label4 = new JLabel("Label 4");
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createVerticalGlue());

        label1.setOpaque(true);
        label1.setBackground(Color.cyan);
        label2.setOpaque(true);
        label2.setBackground(Color.black);
        label3.setOpaque(true);
        label3.setBackground(null);
        panel.add(label1);
        panel.add(Box.createVerticalGlue());
        panel.add(label2);
        panel.add(Box.createVerticalGlue());
        panel.add(label3);
        panel.add(Box.createVerticalGlue());
        panel.add(label4);
        panel.add(Box.createVerticalGlue());

        frame.add(panel, BorderLayout.EAST);



//        JLabel label = new JLabel("/aaa", SwingConstants.RIGHT);
//        label.setPreferredSize(new Dimension(200, label.getHeight()));
//        label.setBackground(Color.CYAN);
//        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        frame.add(label, BorderLayout.EAST);
// Assume you have a variable "score" that you want to save
        int score = 100;

        try {
            FileWriter fw = new FileWriter("gameProgress.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Integer.toString(score));
            bw.newLine();
            bw.close();
            System.out.println("Progress saved!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving progress.");
            e.printStackTrace();
        }


        // Exit the application when the user closes the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}