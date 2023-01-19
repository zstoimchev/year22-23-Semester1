import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JMenu {
    Menu(String type, JFrame frame){
        switch (type){
            case "File" -> {
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
                        JOptionPane.showMessageDialog(null, "game save: FAILED", "output", JOptionPane.INFORMATION_MESSAGE);


                    }
                });
                menuItem2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Loading game: FAILED", "output", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                menuItem3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
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
                        frame.dispose();
                        Engine newGame = new Engine();
                        newGame.printGame();

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

            }
        }



    }

}
