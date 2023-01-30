package prog1_en_3;

public class Square {
	static void square(int a) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void chess(int a) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if((i + j) % 2 == 0) {
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
		square(5);
		chess(8);
	}

}
