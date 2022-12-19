import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(3);
      //  frame.setResizable(false);

        Flake flakes[] = new Flake[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            flakes[i] = new Flake(rand.nextInt(800),
                    rand.nextInt(600),
                    10+rand.nextInt(15),
                    8);
        }
        //add stuff
        JPanel centerPanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 800, 600);

                for (int i = 0; i < flakes.length; i++) {
                    flakes[i].fall();
                    flakes[i].draw((Graphics2D) g);
                }
                g.setColor((new Color(0x843C32)));
                g.setFont(new Font("Arial", Font.BOLD, 36));
                g.drawString("Happy new year", 300, 250);
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                repaint();


            }

        };


        frame.add(centerPanel);
        frame.setVisible(true);
    }
}

//container
//component