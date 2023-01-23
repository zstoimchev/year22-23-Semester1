import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
public class GameEngine extends JPanel {
    Random rand = new Random();
    private JButton[][] b;
    int moves = 0, sum = 0;
    int previous = 0, value = 0;
    int[][] counter;
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
    int n = 9, m = 9, temp;
    int target = rand.nextInt(250, 350);
    JFrame frame = new JFrame();
    GameEngine(int n, int m, JFrame frame, int target, int moves) {
        setLayout(new BorderLayout());
        this.n = n;
        this.m = m;
        counter = new int[n][m];
        b = new JButton[n][m];
        this.target = target;
        this.moves = moves;
        movesLabel.setText("Moves: " + moves + " ");
        temp = moves;
        this.frame=frame;

        /* middle */
        Panels middle = new Panels("middle", n, m);
        add(middle, BorderLayout.CENTER);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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
                if (moves == 0) {

                }
                colorCross(i, j, n, m);
                calculate(i, j);
            }
        }
        /* top */
        Panels top = new Panels("top");
        add(top, BorderLayout.NORTH);
        Labels targetLabel = new Labels("target", target);
        top.add(targetLabel, BorderLayout.WEST);
        top.add(movesLabel, BorderLayout.EAST);

        /* bottom */
        Panels bottom = new Panels("bottom");
        add(bottom, BorderLayout.SOUTH);
        bottom.add(sumLabel, BorderLayout.CENTER);

        /* frame attributes */
        setVisible(true);
        setBounds(150, 150, 600, 600);

        /* add operations panel */
        add(createOperations(), BorderLayout.EAST);
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
                    }
                }
            }
        });
    }

    public void calculate(int ii, int jj) {
        b[ii][jj].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (moves != temp) {
                    previous = counter[prevI][prevJ];
//                    try {
                    value = calculateSum(previous, counter[ii][jj], CurrOperation);
//                    }catch (NullPointerException exception){
//                    }
                    b[prevI][prevJ].setText("" + value);
                    counter[prevI][prevJ] = value;
                    //this stick to the end like it is now, to generate next opp.
                    randomNumForOpp = rand.nextInt(4);
                } else {
                    previous = counter[ii][jj];
                    randomNumForOpp = rand.nextInt(3);
                }
                CurrOperation = operations[randomNumForOpp];
                highlightOperation(CurrOperation);
                movesLabel.setText("Moves: " + --moves + " ");
                prevI = ii;
                prevJ = jj;
                sum = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        sum += counter[i][j];
                    }
                }
                sumLabel.setText("Sum: " + sum);
                if (moves == 0) {
                    JOptionPane.showMessageDialog(null, "You lost :(\nYou ran out of moves\nRemaining score: " + Math.abs(target - sum), "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);

                    frame.getContentPane().removeAll();
                    ConfigFrame novo = new ConfigFrame(frame);
                    Container contentPane = frame.getContentPane();//need this!!
                    contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                    frame.revalidate();//need this!!
                } else if (target == sum) {
                    JOptionPane.showMessageDialog(null, "You win :)", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);

                    frame.getContentPane().removeAll();
                    ConfigFrame novo = new ConfigFrame(frame);
                    Container contentPane = frame.getContentPane();//need this!!
                    contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                    frame.revalidate();//need this!!
                }
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
                subtraction.setBackground(null);
                multiplication.setBackground(null);
                division.setBackground(Color.cyan);
            }
        }
    }
    int calculateSum(int previousW, int nowW, String operationing) {
        try {
            return switch (operationing) {
                case "+" -> (previousW + nowW) % 10;
                case "-" -> (previousW - nowW) % 10;
                case "*" -> (previousW * nowW) % 10;
                case "/" -> (previousW / nowW) % 10;
                default -> 0;
            };
        } catch (ArithmeticException ignored) {
            return previousW;
        }
    }
}
