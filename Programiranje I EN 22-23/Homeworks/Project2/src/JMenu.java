import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMenu {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JMenuBar menubar = new JMenuBar();
        javax.swing.JMenu menu1 = new javax.swing.JMenu("Options");
        menubar.add(menu1);

        frame.setJMenuBar(menubar);

        frame.setSize(300,100);

        frame.setVisible(true);




    }
}
