
public class Cube extends Square{
	
	public Cube(int a) {
		super(a);
	}
	int volume(){
		return(a * a * a);
	}

	protected void draw(){
		super.draw();
		System.out.println("this is a cube");
	}
}
