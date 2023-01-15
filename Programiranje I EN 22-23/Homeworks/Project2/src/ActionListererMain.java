import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListererMain implements ActionListener {

    public void actionPerformed(ActionEvent e,) {
        int i2 = i1;
        int j2 = j1;

        //imcrease counter for moves
        movesDone++;
        moves.setText("Moves done: " + movesDone);

        //value manipulation
        now = counter[i2][j2];
        now = (now + previous) % 10;
        previous = now;
        counter[i2][j2] = now;

        //reset counter
        sum = 0;
        for (int kont1 = 0; kont1 < 9; kont1++)
            for (int kont2 = 0; kont2 < 9; kont2++)
                sum += counter[kont1][kont2];

        b[i2][j2].setText("" + counter[i2][j2]);
        bottomLabel.setText("Sum: " + sum);

        //color cross
        int k, s;
        for (k = 0; k < 9; k++) {
            for (s = 0; s < 9; s++) {
                if (k == i2 || s == j2) {
                    b[k][s].setBackground(Color.PINK);
                    b[k][s].setEnabled(true);
                } else {
                    b[k][s].setBackground(Color.RED);
                    b[k][s].setEnabled(false);
                }
                if (k == i2 && s == j2) {
                    b[i2][j2].setBackground(Color.PINK);
                    b[i2][j2].setEnabled(false);
                }
            }
        }

    }
}
