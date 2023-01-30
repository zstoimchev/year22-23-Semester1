
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle first = new Triangle(7, 3, 8);
		/*first.a = 7;
		first.b = 3;
		first.c = 8;
		*/
		Triangle second = new Triangle(3, 3, 3);
		second.changeA(8);
		System.out.println(first.nrOfTriangles);
		System.out.println(second.nrOfTriangles);
		System.out.println(second.perimeter());
		System.out.println(second.area());
		Triangle manyTriangles[] = new Triangle[10000];
		for(int i = 0; i < 10000; i++) {
			manyTriangles[i] = new Triangle(i, i, i);
		}
		System.out.println(second.nrOfTriangles);
	}

}
