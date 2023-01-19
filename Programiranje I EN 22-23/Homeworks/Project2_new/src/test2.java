import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class test2 {
    private JFrame frame;
    private JTextArea textArea;
    private JButton saveButton;
    private JButton loadButton;

    public test2() {
        frame = new JFrame("Save/Load Example");
        textArea = new JTextArea();
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("saved_file.txt");
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("saved_file.txt"));
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        content.append(line);
                        content.append(System.lineSeparator());
                    }
                    textArea.setText(content.toString());
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.add(textArea);
        frame.add(saveButton);
        frame.add(loadButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new test2();
    }
}

