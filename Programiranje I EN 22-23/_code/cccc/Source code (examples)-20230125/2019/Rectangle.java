
public class Rectangle {
	
	static void rect(int a, int b) {
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void chess(int side) {
		for(int i = 0; i < side; i++) {
			for(int j = 0; j < side; j++) {
				if((j + i) % 2 == 0) {
					System.out.print("1");	
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect(3, 4);
		chess(8);
	}

}
