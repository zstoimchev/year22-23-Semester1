import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


public class Engine {
    Random rand = new Random();
    private int target=rand.nextInt(500), moves = 0, sum = 0;
    private final int[][] counter = new int[9][9];
    private int indexi = 0, indexj = 0, previousvalue = 0;
//    Random rand = new Random();
    private String temp = "";

    //========================================================================
    private final JFrame frame = new JFrame("More or Less, Less is More");
    private final JButton[][] b = new JButton[9][9];
//    private final LabelCreation movesLabel = new LabelCreation("moves", moves);
//    private final LabelCreation sumLabel = new LabelCreation("sum", sum);
//    private final LabelCreation addition = new LabelCreation("operation", 0);
//    private final LabelCreation subtraction = new LabelCreation("operation", 0);
//    private final LabelCreation multiplication = new LabelCreation("operation", 0);
//    private final LabelCreation division = new LabelCreation("operation", 0);


    String[] operations = {" + ", " - ", " * ", " / "};
    int randomOperation = rand.nextInt(4);


    Engine() {
        // Set the menu bar for the frame
        MenuBar menuBar = new MenuBar(frame);
        frame.setJMenuBar(menuBar);


        //top panel


        //central grid
//        createOperations();
//        sumLabel.setText("Sum: " + sum);

        //buttons, add action listener
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                addActionListener(i, j);
//                colorCross(i, j);
            }
        }

        //create bottom panel

        frame.pack();
        frame.setSize(900, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public void addActionListener(int i, int j) {
        b[i][j].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                movesLabel.setText("Moves: " + ++moves + " ");

                //highlight operation
                randomOperation = rand.nextInt(4);
                if (moves == 1) {
                    indexi = i;
                    indexj = j;
                    previousvalue = counter[i][j];
                    temp = operations[randomOperation];
                    System.out.println(temp);
//                    highlightOperation(temp);

                } else {
                    int value = doCalc(previousvalue, counter[i][j], temp);
                    System.out.println("Previous: " + previousvalue);
                    System.out.println("Operation: "+temp);
                    System.out.println("Now: "+ counter[i][j]);
                    System.out.println("value: "+ value);
                    System.out.println("===========================]");

                    b[indexi][indexj].setText("" + value);
                    counter[indexi][indexj] = value;
                    indexi = i;
                    indexj = j;

                    previousvalue = counter[i][j];
                    temp = operations[randomOperation];
//                    highlightOperation(temp);
                }

                counter[i][j]+=5;
                b[i][j].setText(""+counter[i][j]);
                sum = 0;
                //reset counter
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        sum += counter[k][l];
                    }
                }
//                sumLabel.setText("Sum: " + sum);
                System.out.println(sum);
//                if (sum == target)
//                    finishGame(b);

            }
        });
    }



























//    public void highlightOperation(String temp) {
//        switch (temp) {
//            case " + " -> {
//                addition.setBackground(Color.cyan);
//                subtraction.setBackground(null);
//                multiplication.setBackground(null);
//                division.setBackground(null);
//            }
//            case " - " -> {
//                addition.setBackground(null);
//                subtraction.setBackground(Color.cyan);
//                multiplication.setBackground(null);
//                division.setBackground(null);
//            }
//            case " * " -> {
//                addition.setBackground(null);
//                subtraction.setBackground(null);
//                multiplication.setBackground(Color.cyan);
//                division.setBackground(null);
//            }
//            case " / " -> {
//                addition.setBackground(null);
//                addition.setBackground(null);
//                addition.setBackground(null);
//                addition.setBackground(Color.cyan);
//            }
//        }
//    }

    public int doCalc(int now, int previous, String oppp) {
        int res = 0;
        if (oppp == " + ")
        res = (now + previous) % 10;
        else if (oppp == " - ")
        res = (now - previous) % 10;
        else if (oppp == " * ")
        res = (now * previous) % 10;
        else if (oppp == " / ")
        res = (now / previous) % 10;
        return res;
    }


}
