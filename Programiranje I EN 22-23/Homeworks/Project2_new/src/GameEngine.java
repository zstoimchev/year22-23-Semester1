import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class GameEngine {
    Random rand = new Random();
    private JButton[][] b = new JButton[9][9];
    int moves = 0, sum = 0;
    int previous = 0, value = 0;
    int[][] counter = new int[9][9];
    Labels movesLabel = new Labels("moves", moves);
    int prevI, prevJ;
    private final Labels addition = new Labels("operations", 0);
    private final Labels subtraction = new Labels("operations", 0);
    private final Labels multiplication = new Labels("operations", 0);
    private final Labels division = new Labels("operations", 0);
    Labels sumLabel = new Labels("sum", sum);
    String[] operations = {"+", "-", "*", "/"};
    int randomNumForOpp;
    String CurrOperation;
    int n = 9, m = 9;
    int target = rand.nextInt(250, 350);


    GameEngine() {

        JFrame frame = new JFrame("More is less - less is more!");

        // Set the menu bar for the frame
        MenuBar menuBar = new MenuBar(frame);
        frame.setJMenuBar(menuBar);

        /* middle */
        Panels middle = new Panels("middle", n, m);
        frame.add(middle, BorderLayout.CENTER);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                counter[i][j] = rand.nextInt(10);
                sum += counter[i][j];
                b[i][j] = new Buttons(counter[i][j]);
                middle.add(b[i][j]);
            }
        }
        sumLabel.setText("Sum: " + sum);
        //action listener
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                colorCross(i, j, n, m);
                calculate(i, j, n, m);
            }
        }

        /* top */
        Panels top = new Panels("top");
        frame.add(top, BorderLayout.NORTH);
        Labels targetLabel = new Labels("target", target);
        top.add(targetLabel, BorderLayout.WEST);
        top.add(movesLabel, BorderLayout.EAST);

        /* bottom */
        Panels bottom = new Panels("bottom");
        frame.add(bottom, BorderLayout.SOUTH);
        bottom.add(sumLabel, BorderLayout.CENTER);

        /* frame attributes */
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setBounds(150, 150, 600, 600);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        /* add operations panel */
        frame.add(createOperations(), BorderLayout.EAST);


    }

    public void colorCross(int iCheck, int jCheck, int n, int m) {
        b[iCheck][jCheck].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
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
//                        calculate(i,j);
                    }
                }
            }
        });
    }

    public void calculate(int ii, int jj, int n, int m) {
        b[ii][jj].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movesLabel.setText("Moves: " + ++moves + " ");

                if (moves != 1) {
                    previous = counter[prevI][prevJ];
                    value = calculate(previous, counter[ii][jj], CurrOperation);
                    b[prevI][prevJ].setText("" + value);
                    counter[prevI][prevJ] = value;
                    //this stick to the end like it is now, to generate next opp.
                    randomNumForOpp = rand.nextInt(4);
                    CurrOperation = operations[randomNumForOpp];
                    highlightOperation(CurrOperation);
                } else {
                    previous = counter[ii][jj];
                    randomNumForOpp = rand.nextInt(3);
                    CurrOperation = operations[randomNumForOpp];
                    highlightOperation(CurrOperation);
                }
                prevI = ii;
                prevJ = jj;
                sum = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        sum += counter[i][j];
                    }
                }
                sumLabel.setText("Sum: " + sum);
            }
        });
    }

    public JPanel createOperations() {
        Panels operation = new Panels("operations");
        operation.setLayout(new BoxLayout(operation, BoxLayout.Y_AXIS));
        addition.setText(" + ");
        subtraction.setText(" - ");
        multiplication.setText(" * ");
        division.setText(" / ");
        for (Labels labelCreation : Arrays.asList(addition, subtraction, multiplication, division)) {
            operation.add(Box.createVerticalGlue());
            operation.add(labelCreation);
        }
        operation.add(Box.createVerticalGlue());
        addition.setOpaque(true);
        subtraction.setOpaque(true);
        multiplication.setOpaque(true);
        division.setOpaque(true);
        return operation;
    }
    void highlightOperation(String type) {
        switch (type) {
            case "+" -> {
                addition.setBackground(Color.cyan);
                subtraction.setBackground(null);
                multiplication.setBackground(null);
                division.setBackground(null);
            }
            case "-" -> {
                addition.setBackground(null);
                subtraction.setBackground(Color.cyan);
                multiplication.setBackground(null);
                division.setBackground(null);
            }
            case "*" -> {
                addition.setBackground(null);
                subtraction.setBackground(null);
                multiplication.setBackground(Color.cyan);
                division.setBackground(null);
            }
            case "/" -> {
                addition.setBackground(null);
                addition.setBackground(null);
                addition.setBackground(null);
                addition.setBackground(Color.cyan);
            }
        }
    }
    int calculate(int previous, int now, String operation) {
        return switch (operation) {
            case "+" -> (previous + now) % 10;
            case "-" -> (previous - now) % 10;
            case "*" -> (previous * now) % 10;
            case "/" -> (previous / now) % 10;
            default -> 0;
        };
    }
}
