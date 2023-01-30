
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle myFirstTriangle = new Triangle(2, 3, 4);
		System.out.println(myFirstTriangle.a);
		myFirstTriangle.a = 7;
		System.out.println(myFirstTriangle.a);
		System.out.println(myFirstTriangle.nrTriangles);
		for(int i = 0; i < 1000; i++) {
			myFirstTriangle = new Triangle(2, 3, 4);
		}
		System.out.println(myFirstTriangle.nrTriangles);
		Triangle myNewSecondTriangle = new Triangle(3, 4, 5);
		System.out.println(myFirstTriangle.nrTriangles);
		System.out.println(myNewSecondTriangle.nrTriangles);
		System.out.println("Perimeter for the first (1001) triangle is: " + myFirstTriangle.perimeter());
		System.out.println("Perimeter for the second (1002)triangle is: " + myNewSecondTriangle.perimeter());
	}

}
