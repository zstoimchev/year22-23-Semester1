import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class ConfigFrame extends JPanel {
    Random rand = new Random();
    int row = 5, col = 5, target = row*col*rand.nextInt(4,7), moves=24;
    JLabel rowsLABEL = new JLabel("Rows: " + row);
    JLabel columnsLABEL = new JLabel("Columns: " + col);
    JLabel labelTarget = new JLabel("Target: " + target);
    JLabel moveLABEL = new JLabel("Moves: "+moves);

    ConfigFrame(JFrame frame) {
        setBackground(new Color(8, 61, 41));
        setLayout(new BorderLayout());
        JPanel left = new JPanel();        //for spacing
        JPanel center = new JPanel();
        JPanel right = new JPanel();        //for spacing
        left.setPreferredSize(new Dimension(500, getHeight()));
        left.setBackground(new Color(8, 61, 41));
        right.setPreferredSize(new Dimension(500, getHeight()));
        right.setBackground(new Color(8, 61, 41));
        center.setBackground(new Color(8, 61, 41));
        center.setLayout(new BorderLayout());

        rowsLABEL.setHorizontalAlignment(SwingConstants.CENTER);
        rowsLABEL.setForeground(Color.white);
        rowsLABEL.setFont(new Font("Arial", Font.BOLD, 18));
        columnsLABEL.setHorizontalAlignment(SwingConstants.CENTER);
        columnsLABEL.setForeground(Color.white);
        columnsLABEL.setFont(new Font("Arial", Font.BOLD, 18));
        labelTarget.setHorizontalAlignment(SwingConstants.CENTER);
        labelTarget.setForeground(Color.white);
        labelTarget.setFont(new Font("Arial", Font.BOLD, 18));
        moveLABEL.setHorizontalAlignment(SwingConstants.CENTER);
        moveLABEL.setForeground(Color.white);
        moveLABEL.setFont(new Font("Arial", Font.BOLD, 18));

        //top empty panel
        JPanel top = new JPanel(new BorderLayout());
        top.setPreferredSize(new Dimension(top.getWidth(), 345));
        top.setBackground(new Color(8, 61, 41));
        center.add(top, BorderLayout.NORTH);

        //bottom empty panel
        JPanel bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(bottom.getWidth(), 330));
        bottom.setBackground(new Color(8, 61, 41));
        center.add(bottom, BorderLayout.SOUTH);

        //add name of the game, or sth. similar //=======================================
        JLabel names = new JLabel("Select your options");
        names.setHorizontalAlignment(SwingConstants.CENTER);
        names.setFont(new Font("Arial", Font.BOLD, 34));
        names.setForeground(Color.white);
        top.add(names, BorderLayout.CENTER);

        //first centered panel for space
        JPanel top1 = new JPanel(new GridLayout(4, 0, 0, 15));
        top1.setPreferredSize(new Dimension(top1.getWidth(), 200));
        top1.setBackground(Color.cyan);
        center.add(top1, BorderLayout.CENTER);


        JPanel forRows = new JPanel(new BorderLayout());
        top1.add(forRows);

        JPanel forColumns = new JPanel(new BorderLayout());
        top1.add(forColumns);

        JPanel forTarget = new JPanel(new BorderLayout());
        top1.add(forTarget);

        JPanel forMoves = new JPanel(new BorderLayout());
        top1.add(forMoves);

        top1.setBackground(new Color(8, 61, 41));
        forRows.setBackground(new Color(8, 61, 41));
        forColumns.setBackground(new Color(8, 61, 41));
        forTarget.setBackground(new Color(8, 61, 41));
        forMoves.setBackground(new Color(8,61,41));


        //buttons for rows
        JButton button1ROW = new JButton(" - ");
        JButton button2ROW = new JButton(" + ");
        //buttons for columns
        JButton button1COLUMN = new JButton(" - ");
        JButton button2COLUMN = new JButton(" + ");
        //buttons for target
        JButton button1TARGET = new JButton(" - ");
        JButton button2TARGET = new JButton(" + ");

        JButton button1MOVES = new JButton(" - ");
        JButton button2MOVES = new JButton(" + ");


        forRows.add(button1ROW, BorderLayout.WEST);
        forRows.add(rowsLABEL, BorderLayout.CENTER);
        forRows.add(button2ROW, BorderLayout.EAST);

        forColumns.add(button1COLUMN, BorderLayout.WEST);
        forColumns.add(columnsLABEL, BorderLayout.CENTER);
        forColumns.add(button2COLUMN, BorderLayout.EAST);

        forTarget.add(button1TARGET, BorderLayout.WEST);
        forTarget.add(labelTarget, BorderLayout.CENTER);
        forTarget.add(button2TARGET, BorderLayout.EAST);

        forMoves.add(button1MOVES, BorderLayout.WEST);
        forMoves.add(moveLABEL, BorderLayout.CENTER);
        forMoves.add(button2MOVES, BorderLayout.EAST);



        add(left, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(right, BorderLayout.EAST);


        JButton easy = new JButton("EASY");
        easy.setFont(new Font("Arial", Font.BOLD, 23));
        bottom.add(easy);

        JButton medium = new JButton("MEDIUM");
        medium.setFont(new Font("Arial", Font.BOLD, 23));
        bottom.add(medium);

        JButton hard = new JButton("HARD");
        hard.setFont(new Font("Arial", Font.BOLD, 23));
        bottom.add(hard);

        JButton start = new JButton("START CUSTOM");
        start.setFont(new Font("Arial", Font.BOLD, 23));
        bottom.add(start, BorderLayout.CENTER);


        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row=rand.nextInt(7,10);
                col=rand.nextInt(2,5);
                moves=row*col/2;
                target=row*col*rand.nextInt(5,9);

                frame.getContentPane().removeAll();//need this!!
                GameEngine startGame = new GameEngine(row, col, frame, target, moves);
                Container contentPane = frame.getContentPane();//need this!!
                contentPane.add(startGame, BorderLayout.CENTER);//need this!! only change atribute
                // Set the menu bar for the frame
                MenuBar menuBar = new MenuBar(frame, target, moves);
                frame.setJMenuBar(menuBar);
                frame.revalidate();//need this!!
            }
        });

        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row=rand.nextInt(5,8);
                col=rand.nextInt(5,8);
                moves=row*col/3;
                target=row*col*rand.nextInt(4,6);

                frame.getContentPane().removeAll();//need this!!
                GameEngine startGame = new GameEngine(row, col, frame, target, moves);
                Container contentPane = frame.getContentPane();//need this!!
                contentPane.add(startGame, BorderLayout.CENTER);//need this!! only change atribute
                // Set the menu bar for the frame
                MenuBar menuBar = new MenuBar(frame, target, moves);
                frame.setJMenuBar(menuBar);
                frame.revalidate();//need this!!
            }
        });
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row= rand.nextInt(2,6);
                col= rand.nextInt(2,6);
                moves=row*col/4;
                target=row*col*rand.nextInt(2,5);

                frame.getContentPane().removeAll();//need this!!
                GameEngine startGame = new GameEngine(row, col, frame, target, moves);
                Container contentPane = frame.getContentPane();//need this!!
                contentPane.add(startGame, BorderLayout.CENTER);//need this!! only change atribute
                // Set the menu bar for the frame
                MenuBar menuBar = new MenuBar(frame, target, moves);
                frame.setJMenuBar(menuBar);
                frame.revalidate();//need this!!
            }
        });



        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();//need this!!

//                JPanel newPanel = new GameEngine();
                GameEngine startGame = new GameEngine(row, col, frame, target, moves);

                Container contentPane = frame.getContentPane();//need this!!
                contentPane.add(startGame, BorderLayout.CENTER);//need this!! only change atribute
                // Set the menu bar for the frame
                MenuBar menuBar = new MenuBar(frame, target, moves);
                frame.setJMenuBar(menuBar);
                frame.revalidate();//need this!!
            }
        });

        button1MOVES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(moves<=1){
                    button1MOVES.setEnabled(false);
                    button2MOVES.setEnabled(true);
                }else {
                    moveLABEL.setText("Moves: "+ --moves);
                }
            }
        });
        button2MOVES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(moves>=100){
                    button2MOVES.setEnabled(false);
                    button1MOVES.setEnabled(true);
                } else{
                    moveLABEL.setText("Moves: "+ ++moves);
                }
            }
        });

        button1TARGET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                target-=13;
                labelTarget.setText("Target: " +target);
                if(target<=20)
                    button1TARGET.setEnabled(false);
            }
        });
        button2TARGET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1TARGET.setEnabled(true);
                target+=13;
                labelTarget.setText("Target: " + target);

            }
        });

        button1ROW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (row <= 1) {
                    button1ROW.setEnabled(false);
                    button2ROW.setEnabled(true);
                } else {
                    rowsLABEL.setText("Rows: " + --row);
                    button2ROW.setEnabled(true);
                }
                target=(row*col)*rand.nextInt(3,7);
                labelTarget.setText("Target: "+target);
            }
        });
        button2ROW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (row >= 9) {
                    button2ROW.setEnabled(false);
                    button1ROW.setEnabled(true);
                } else {
                    rowsLABEL.setText("Rows: " + ++row);
                    button1ROW.setEnabled(true);
                }
                target=(row*col)*rand.nextInt(3,7);
                labelTarget.setText("Target: "+target);
            }
        });

        button1COLUMN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (col <= 1) {
                    button1COLUMN.setEnabled(false);
                    button2COLUMN.setEnabled(true);
                } else {
                    columnsLABEL.setText("Columns: " + --col);
                    button2COLUMN.setEnabled(true);
                }
                target=(row*col)*rand.nextInt(3,7);
                labelTarget.setText("Target: "+target);
            }
        });
        button2COLUMN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (col >= 9) {
                    button2COLUMN.setEnabled(false);
                    button1COLUMN.setEnabled(true);
                } else {
                    columnsLABEL.setText("Columns: " + ++col);
                    button1COLUMN.setEnabled(true);
                }
                target=(row*col)*rand.nextInt(3,7);
                labelTarget.setText("Target: "+target);
            }
        });

    }
}
