import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends Frame{
	Button b1, b2;
	L1 l1;
	L2 l2;
	class L1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
	
	class L2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tmp = Integer.parseInt(b2.getLabel());
			tmp = (int)Math.sqrt(tmp);
			b2.setLabel(""+tmp);
		}
		
	}
	public Ex1(){
		this.setLayout(new GridLayout(1, 2));
		l1 = new L1();
		l2 = new L2();
		b1 = new Button("Close");
		b2 = new Button("16");
		b1.addActionListener(l1);
		b2.addActionListener(l2);
		add(b1);
		add(b2);
		setSize(400, 200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 kk = new Ex1();
		kk.show();
	}

}
