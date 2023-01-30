
public class Triangle{
	static int nrOfTriangles = 0;
	private int a, b, c;
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		nrOfTriangles++;
	}
	
	public int perimeter() {
		return(a + b +c);
	}
	
	public double area() {
		double s = perimeter() / (double)2;
		return(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
	
	public void changeA(int newA) {
		if(newA < (b + c)) {
			a = newA;
		}
	}
	
}
