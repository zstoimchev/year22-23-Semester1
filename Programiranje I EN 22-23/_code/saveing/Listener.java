import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Listener implements ActionListener {

    public JButton[][] buttons;

    //constructor
    public Listener(JButton[][] buttons){

        this.buttons = buttons;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource(); //cast to source

        if(button.getText().equals("Save")){//save button
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("text", "txt");
            chooser.setFileFilter(filter);
            int ret = chooser.showSaveDialog(null);

            if( ret == JFileChooser.APPROVE_OPTION ){
                System.out.println("Saved");
                File file = chooser.getSelectedFile();
                //print saved path
                System.out.println(file.getAbsolutePath());

                try{
                    BufferedWriter writer = new BufferedWriter( new FileWriter(file));
                    writer.write("hello");
                    writer.close();
                }
                catch ( Exception ex ){
                    ex.printStackTrace();
                }
            }

        }else {//normal button
            //get value
            String tmp = button.getText();
            int n = Integer.parseInt(tmp);
            n += 1;
            //set value of the button
            button.setText("" + n);
            //change color
            if (button.getBackground().equals(Color.RED)) {
                button.setBackground(Color.CYAN);
            } else {
                button.setBackground(Color.RED);
            }

            //print position of the button -> we will compare buttons
            for (int i = 0; i < buttons.length; i++) {
                for (int j = 0; j < buttons[i].length; j++) {
                    //by comparing memory addresses
                    if (button == buttons[i][j]) {
                        System.out.println("pressed: " + i + "," + j);
                    }
                }
            }
        }
    }
}
