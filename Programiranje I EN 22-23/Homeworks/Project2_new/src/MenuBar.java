import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {
    MenuBar(){
//        JMenu menu = new JMenu("File");

//        setBackground(new Color(234567));

        Menu menu1 = new Menu("File");
        menu1.setText("File");
        add(menu1);

        Menu menu2 = new Menu("Game Control");
        menu2.setText("Options");
        add(menu2);

        Menu menu3 = new Menu("Difficulty");
        menu3.setText("Difficulty");
        add(menu3);

    }
}
