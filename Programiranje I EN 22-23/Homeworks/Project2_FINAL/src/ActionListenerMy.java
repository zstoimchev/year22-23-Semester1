import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerMy implements ActionListener {
    public void actionPerformed(ActionEvent e, JButton button) {
        button.setText("dwef");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
