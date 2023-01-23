import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Menu extends JMenu {
    Random rand = new Random();
    int n, m;
    int moves, target;

    Menu(String type, JFrame frame, int targetS, int movesS) {
        if (type.equals("File")) {
            JMenuItem menuItem1 = new JMenuItem("Save");
            JMenuItem menuItem2 = new JMenuItem("Load");
            JMenuItem menuItem3 = new JMenuItem("Exit");
            add(menuItem1);
            add(menuItem2);
            add(menuItem3);
            setFont(new Font("Arial", Font.BOLD, 13));
            menuItem1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser chooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("text", "txt");
                    chooser.setFileFilter(filter);
                    int ret = chooser.showSaveDialog(null);

                    if (ret == JFileChooser.APPROVE_OPTION) {
                        System.out.println("Saved" + frame.getContentPane());
                        File file = chooser.getSelectedFile();
                        //print saved path
                        System.out.println(file.getAbsolutePath());

                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                            writer.write("Target: "+targetS+", Moves: "+movesS);
                            writer.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Saving game: SUCCESS", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            menuItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Loading game: FAILED", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            menuItem3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
    }

    Menu(String type, JFrame frame) {
        switch (type) {
            case "Game Control" -> {
                JMenuItem menuItem1 = new JMenuItem("New Game");
                JMenuItem menuItem2 = new JMenuItem("Set field size");
                JMenuItem menuItem3 = new JMenuItem("Set # of moves");
                JMenuItem menuItem4 = new JMenuItem("Set target #");

                add(menuItem1);
                add(menuItem2);
                add(menuItem3);
                add(menuItem4);
                setFont(new Font("Arial", Font.BOLD, 13));
                menuItem1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().removeAll();
                        ConfigFrame novo = new ConfigFrame(frame);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
                menuItem2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().removeAll();
                        ConfigFrame novo = new ConfigFrame(frame);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
                menuItem3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().removeAll();
                        ConfigFrame novo = new ConfigFrame(frame);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
                menuItem4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().removeAll();
                        ConfigFrame novo = new ConfigFrame(frame);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });

            }

            case "Difficulty" -> {
                JMenuItem menuItem1 = new JMenuItem("Easy");
                JMenuItem menuItem2 = new JMenuItem("Medium");
                JMenuItem menuItem3 = new JMenuItem("Hard");

                add(menuItem1);
                add(menuItem2);
                add(menuItem3);
                setFont(new Font("Arial", Font.BOLD, 13));


                menuItem1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //easy
                        n = rand.nextInt(5, 10);
                        m = rand.nextInt(5, 10);
                        target = n * m * rand.nextInt(3, 5);
                        moves = rand.nextInt(40, 50);

                        frame.getContentPane().removeAll();
                        GameEngine novo = new GameEngine(n, m, frame, target, moves);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
                menuItem2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //medium
                        n = rand.nextInt(3, 7);
                        m = rand.nextInt(3, 7);
                        target = n * m * rand.nextInt(5, 7);
                        moves = rand.nextInt(20, 30);

                        frame.getContentPane().removeAll();
                        GameEngine novo = new GameEngine(n, m, frame, target, moves);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
                menuItem3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //hard
                        n = rand.nextInt(2, 5);
                        m = rand.nextInt(2, 5);
                        target = n * m * rand.nextInt(3, 5);
                        moves = rand.nextInt(10, 15);

                        frame.getContentPane().removeAll();
                        GameEngine novo = new GameEngine(n, m, frame, target, moves);
                        Container contentPane = frame.getContentPane();//need this!!
                        contentPane.add(novo, BorderLayout.CENTER);//need this!! only change atribute
                        frame.revalidate();//need this!!
                    }
                });
            }
        }
    }
}
