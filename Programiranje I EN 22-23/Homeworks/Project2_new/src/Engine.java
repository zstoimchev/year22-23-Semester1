import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Engine {
    private final Random rand = new Random();
    private final JFrame frame = new JFrame();
    private final JButton[][] b = new JButton[9][9];
    private int[][] counter = new int[9][9];
    private int target = rand.nextInt(500);
    private int moves = 0;
    private int sum = 0;
    private final LabelCreation movesLabel = new LabelCreation("moves", moves);
    LabelCreation sumLabel = new LabelCreation("sum", sum);
    private int previousValue;
    private int currentValue;


    Engine() {
        MenuBar menuBar = new MenuBar();

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);
        //top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        LabelCreation targetLabel = new LabelCreation("target", target);
        topPanel.add(targetLabel, BorderLayout.WEST);
        topPanel.add(movesLabel, BorderLayout.EAST);
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(new Color(22, 61, 61));

        //central grid
        JPanel gridPanel = new JPanel(new GridLayout(9, 9));
        gridPanel.setBackground(new Color(0xAEC630));
        frame.add(gridPanel, BorderLayout.CENTER);
        //buttons, no action listener
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                counter[i][j] = rand.nextInt(9);
                sum += counter[i][j];
                ButtonCreation button = new ButtonCreation(counter[i][j]);
                b[i][j] = button;
                gridPanel.add(b[i][j]);
            }
        }
        sumLabel.setText("Sum: " + sum);
        //buttons, action listener
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                addActionListener(i, j);
                colorCross(i, j);
            }
        }


        //bottom panel for sum
        PanelCreation bottom = new PanelCreation("bottom", "", 3);
        frame.add(bottom, BorderLayout.SOUTH);
        bottom.add(sumLabel, BorderLayout.CENTER);

    }

    public void addActionListener(int i, int j) {
        b[i][j].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                b[i][j].setBackground(Color.gray);
                movesLabel.setText("Moves: " + ++moves);

                sum += 5;
                sumLabel.setText("Sum: " + sum);

            }
        });
    }

    public void colorCross(int iCheck, int jCheck) {
        b[iCheck][jCheck].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        //actions, to keep track of the code not to messUp
                        if (iCheck == i || jCheck == j) {
                            b[i][j].setBackground(new Color(0x8FAA26));
                            b[i][j].setEnabled(true);
                        } else {
                            b[i][j].setBackground(new Color(56, 92, 8, 255));
                            b[i][j].setEnabled(false);
                        }
                        if (iCheck == i && jCheck == j) {
                            b[i][j].setBackground(new Color(0x718F1C));
                            b[i][j].setEnabled(false);
                        }
                    }
                }
            }
        });
    }

    public void printGame() {
        //pack the frame
        frame.pack();

        frame.setSize(900, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
