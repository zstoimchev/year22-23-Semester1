
public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square squares[] = new Square[1000];
		for(int i = 0; i < 500; i++){
			squares[i] = new Square(i);
		}
		for(int i = 500; i < 1000; i++){
			squares[i] = new Cube(i - 500);
		}
		squares[5].draw();
		squares[505].draw();
		System.out.println(((Cube)squares[505]).volume());
	}

}
