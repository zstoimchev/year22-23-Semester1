
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ss = new Square();
		ss.side = 4;
		ss.draw();
		Cube cc = new Cube();
		cc.side = 4;
		cc.draw();
		cc.draw1();
		Cube newCube = new Cube();
		Square newSquare = newCube;
		Object objects = newCube;
	}

}
