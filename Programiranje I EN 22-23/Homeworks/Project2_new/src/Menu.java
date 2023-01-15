import javax.swing.*;

public class Menu extends JMenu {
    Menu(String type){
        switch (type){
            case "File" -> {
                JMenuItem menuItem1 = new JMenuItem("Save");
                JMenuItem menuItem2 = new JMenuItem("Load");
                JMenuItem menuItem3 = new JMenuItem("Exit");
                add(menuItem1);
                add(menuItem2);
                add(menuItem3);
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
            }

            case "Difficulty" -> {
                JMenuItem menuItem1 = new JMenuItem("Easy");
                JMenuItem menuItem2 = new JMenuItem("Medium");
                JMenuItem menuItem3 = new JMenuItem("Hard");

                add(menuItem1);
                add(menuItem2);
                add(menuItem3);
            }
        }



    }

}
