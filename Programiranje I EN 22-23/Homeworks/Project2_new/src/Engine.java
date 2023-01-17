import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Engine {
    private final Random rand = new Random();
    private final JFrame frame = new JFrame("More or Less, Less is More");
    private final JButton[][] b = new JButton[9][9];
    private final int[][] counter = new int[9][9];
    private int moves = 0;
    private int sum = 0;
    private final LabelCreation movesLabel = new LabelCreation("moves", moves);
    LabelCreation sumLabel = new LabelCreation("sum", sum);
    JPanel gridPanel = new JPanel(new GridLayout(9, 9));
    private int indexi = 0, indexj = 0, previousvalue = 0;
    private final LabelCreation addition = new LabelCreation("operation", 0);
    private final LabelCreation subtraction = new LabelCreation("operation", 0);
    private final LabelCreation multiplication = new LabelCreation("operation", 0);
    private final LabelCreation division = new LabelCreation("operation", 0);


    Engine() {
        MenuBar menuBar = new MenuBar();

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        //top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(topPanel.getHeight(), 60));

        int target = rand.nextInt(500);
        LabelCreation targetLabel = new LabelCreation("target", target);
        topPanel.add(targetLabel, BorderLayout.WEST);
        topPanel.add(movesLabel, BorderLayout.EAST);
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(new Color(22, 61, 61));

        //central grid
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
        createOperations();

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
        bottom.setPreferredSize(new Dimension(bottom.getHeight(), 60));
        frame.add(bottom, BorderLayout.SOUTH);
        bottom.add(sumLabel, BorderLayout.CENTER);

    }

    public void addActionListener(int i, int j) {
        b[i][j].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movesLabel.setText("Moves: " + ++moves + " ");

                //highlight operation
                String[] operations = {" + ", " - ", " * ", " / "};
                int randomOperation = rand.nextInt(3);

                //value malipulation
                if (moves == 1) {
                    indexi = i;
                    indexj = j;
                    previousvalue = parseInt(((JButton) e.getSource()).getText());


                    //==========================================EROR IN RANDOM SELECTING VALUE, HAS NEGATIVES
                    String temp = operations[randomOperation];
                    highlightOperation(temp);

                } else {
                    String temp = operations[randomOperation];
                    highlightOperation(temp);
                    int value = doCalc(parseInt(((JButton) e.getSource()).getText()), previousvalue, temp);

                    System.out.println(value);
                    b[indexi][indexj].setText("" + value);
                    counter[indexi][indexj] = value;
                    indexi = i;
                    indexj = j;
                    previousvalue = parseInt(((JButton) e.getSource()).getText());

                    //===========================================

                }
                sum = 0;
                //reset counter
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        sum += counter[k][l];
                    }
                }
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

    public void createOperations() {
        PanelCreation operation = new PanelCreation("operation", "", 0);
        operation.setLayout(new BoxLayout(operation, BoxLayout.Y_AXIS));

        addition.setText(" + ");
        subtraction.setText(" - ");
        multiplication.setText(" * ");
        division.setText(" / ");

        for (LabelCreation labelCreation : Arrays.asList(addition, subtraction, multiplication, division)) {
            operation.add(Box.createVerticalGlue());
            operation.add(labelCreation);
        }
        operation.add(Box.createVerticalGlue());

        addition.setOpaque(true);
//        addition.setBackground(Color.cyan);
        subtraction.setOpaque(true);
//        subtraction.setBackground(Color.cyan);
        multiplication.setOpaque(true);
//        multiplication.setBackground(Color.cyan);
        division.setOpaque(true);
//        division.setBackground(Color.cyan);

        frame.add(operation, BorderLayout.EAST);
    }

    public void highlightOperation(String temp) {
        switch (temp) {
            case " + " -> {
                addition.setBackground(Color.cyan);
                subtraction.setBackground(null);
                multiplication.setBackground(null);
                division.setBackground(null);
            }
            case " - " -> {
                addition.setBackground(null);
                subtraction.setBackground(Color.cyan);
                multiplication.setBackground(null);
                division.setBackground(null);
            }
            case " * " -> {
                addition.setBackground(null);
                subtraction.setBackground(null);
                multiplication.setBackground(Color.cyan);
                division.setBackground(null);
            }
            case " / " -> {
                addition.setBackground(null);
                addition.setBackground(null);
                addition.setBackground(null);
                addition.setBackground(Color.cyan);
            }
        }
    }

    public int doCalc(int now, int previous, String oppp) {
        int res=0;
        if (Objects.equals(oppp, " + "))
            res= (now + previous) % 10;
        else if (Objects.equals(oppp, " - "))
            res= (now - previous) % 10;
        else if (Objects.equals(oppp, " * "))
            res= (now * previous) % 10;
        else if (Objects.equals(oppp, " / "))
            res= (now / previous) % 10;
        return res;
    }
}
