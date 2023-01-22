import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;


public class Engine {
    private int sum, target=0, moves=0;
    private int[][] counter = new int[9][9];
    private ButtonCreation[][] b = new ButtonCreation[9][9];


    Engine() {
        Random rand = new Random();
        JFrame frame = new JFrame();

        PanelCreation topPanel = new PanelCreation("topPanel");
        frame.add(topPanel, BorderLayout.NORTH);
        LabelCreation targetLabel = new LabelCreation("target", target);
        topPanel.add(targetLabel, BorderLayout.WEST);
        LabelCreation movesLabel = new LabelCreation("moves", target);
        topPanel.add(movesLabel, BorderLayout.EAST);


        //central grid
        JPanel gridPanel = new JPanel(new GridLayout(9, 9));
        gridPanel.setBackground(new Color(0xAEC630));
        frame.add(gridPanel, BorderLayout.CENTER);
        //buttons, no action listener
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                counter[i][j]=rand.nextInt(9);
                sum+=counter[i][j];
                b[i][j]=new ButtonCreation(counter[i][j]);
                gridPanel.add(b[i][j]);

            }
        }

        PanelCreation bottomPanel = new PanelCreation("bottom");
        frame.add(bottomPanel, BorderLayout.SOUTH);
        LabelCreation bottomLabel = new LabelCreation("sum", sum);

        bottomPanel.add(bottomLabel, BorderLayout.CENTER);






        frame.pack();
        frame.setSize(900, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }

    public void createGrid(JButton button, int counter){

    }



}
