import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zhivkos first GUI Frame in Java");

        frame.setLocation(300, 200);
        frame.setSize(300, 150);

        //adding conta...
        Button button1 = new Button("FIRST BATN");
        frame.add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("Second batn");
        frame.add(button2, BorderLayout.SOUTH);

        button2.setBackground(new Color(250, 3, 45));

        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.WHITE);

        int n = 5;
        JPanel pn = createpanelNXN(n);
        frame.add(pn);

        JPanel jp = createpanelNXN(3);
        frame.add(jp, BorderLayout.NORTH);

        //on the end, to be visible and to be able to close the frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JPanel createpanelNXN(int n) {
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(n, n);
        panel.setLayout(gl);

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    JButton b = new JButton("" + rand.nextInt(0, 10));
                    b.setBackground(new Color(250 - 10 * i, 150 - j, 150));
                    panel.add(b);
                } else {
                    JButton b = new JButton("A" + rand.nextInt(10));
                    panel.add(b);
                }
            }//endinner
        }//endmain

        return panel;
    }
}


//button to panel, panel to frame

//first things first
//frames, panels


//gui, inheritance and from previous midterms