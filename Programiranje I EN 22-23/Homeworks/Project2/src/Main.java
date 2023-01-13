import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    static int[][] counter = new int[9][9];
    static int sum = 0;
    static JLabel bottom = new JLabel("Sum: " + sum);

    static int value=0;
    static int previous;
    static int now;


    public static void main(String[] args) {
        Random rand = new Random();

        JFrame frame = new JFrame();
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 9));

        JButton[][] b = new JButton[9][9];



        //========================================================================================
        for(int i=0; i<9; i++){                                                                 //
            for (int j = 0; j < 9; j++) {                                                       //
                counter[i][j]= rand.nextInt(10);                                         //
                sum += counter[i][j];                                                           //
                b[i][j]=ButtonCreation.createButton(i, j, counter[i][j]);                       //
                panel.add(b[i][j]);                                                             //
            }                                                                                   //
        }                                                                                       //
        //========================================================================================



        //action listener for the buttons of the matrix!
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int i1=i;
                int j1=j;

                b[i][j].addActionListener(e -> {
                    int i2=i1;
                    int j2=j1;

                    //value manipulation
                    now=counter[i2][j2];
                    now=(now+previous)%10;
                    previous=now;
                    counter[i2][j2]=now;


                    //reset counter
                    sum=0;
                    for(int kont1=0; kont1<9; kont1++)
                        for(int kont2=0; kont2<9; kont2++)
                            sum+=counter[kont1][kont2];

                    b[i2][j2].setText(""+counter[i2][j2]);
                    bottom.setText("Sum: "+sum);

                    //color cross
                    int k,s;
                    for(k=0; k<9; k++){
                        for(s=0; s<9; s++) {
                            if (k == i2 || s == j2) {
                                b[k][s].setBackground(Color.PINK);
                                b[k][s].setEnabled(true);
                            }
                            else {
                                b[k][s].setBackground(Color.RED);
                                b[k][s].setEnabled(false);
                            }
                            if(k==i2 && s==j2){
                                b[i2][j2].setBackground(Color.PINK);
                                b[i2][j2].setEnabled(false);
                            }
                        }
                        //System.out.println(k+"hgfd"+s);
                    }
                });


                // b.setText("null");
                panel.add(b[i][j]);
            }
        }//END OF ACTION LISTENER
        frame.add(panel, BorderLayout.CENTER);

        JPanel topPanel = new JPanel();
        JLabel top = new JLabel(" Target: "+rand.nextInt(500));
        top.setFont(new Font("Arial", Font.PLAIN, 30));

        topPanel.add(top);
        topPanel.setBackground(Color.CYAN);
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();

        //bottom.setText("Sum: "+sum);
        bottom.setFont(new Font("Arial", Font.PLAIN, 30));
        //frame.add(bottom, BorderLayout.SOUTH);

        bottomPanel.add(bottom);
        bottomPanel.setBackground(Color.CYAN);
        frame.add(bottomPanel, BorderLayout.SOUTH);




        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
}
