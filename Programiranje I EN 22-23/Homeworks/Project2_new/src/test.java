import javax.swing.*;

public class test {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Bar Example");

        MenuBar menuBar = new MenuBar();

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Set the size and location of the frame
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Exit the application when the user closes the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        // Show the frame
//        frame.setVisible(true);
    }
}
