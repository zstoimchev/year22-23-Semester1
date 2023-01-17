//from   ww  w.  j a  v  a  2s  .  c  o m

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Show Input Dialog Box");
        button.addActionListener(e -> {
            JTextField xField = new JTextField(5);
            JTextField yField = new JTextField(5);
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("x:"));
            myPanel.add(xField);
            myPanel.add(Box.createHorizontalStrut(15));
            myPanel.add(new JLabel("y:"));
            myPanel.add(yField);

            int result = JOptionPane.showConfirmDialog(null, myPanel,
                    "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                System.out.println("x value: " + xField.getText());
                System.out.println("y value: " + yField.getText());
            }
        });
        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}