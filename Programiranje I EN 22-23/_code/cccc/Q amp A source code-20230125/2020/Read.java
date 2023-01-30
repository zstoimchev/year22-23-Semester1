import java.util.Scanner;
import java.util.Vector;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int howMany = sc.nextInt();
		int arrayOfNumbers[] = new int[howMany];
		for(int i = 0; i < howMany; i++) {
			arrayOfNumbers[i] = sc.nextInt();
		}
		//another possibility
		Vector v = new Vector();
		System.out.println("Input numbers, -1 for the end.");
		boolean end = false;
		while(!end) {
			int tmp = sc.nextInt();
			if(tmp != -1) {
				v.add(new Integer(tmp));
			}
			else {
				end = true;
			}
		}
		for(int i = 0; i < v.size(); i++) {
			Integer tmp = (Integer)v.elementAt(i);
		}
	}

}
