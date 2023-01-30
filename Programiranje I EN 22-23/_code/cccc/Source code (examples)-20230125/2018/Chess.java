
public class Chess {
	static void chessBoard(int a) {
		boolean ttt = true;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if((i + j) % 2 == 0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chessBoard(6);
		chessBoard(2);
	}

}
