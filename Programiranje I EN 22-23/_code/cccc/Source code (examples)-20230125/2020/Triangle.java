
public class Triangle {
	int a, b, c;
	static int nrTriangles;
	Triangle(int aa, int bb, int cc){
		a = aa;
		b = bb; 
		c = cc;
		nrTriangles++;
	}
	int perimeter() {
		return(a + b + c);
	}
	
}
