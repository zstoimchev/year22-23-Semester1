
public class Square {
	static void square(int a) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square(6);
		square(2);
		square(3);
	}

}
