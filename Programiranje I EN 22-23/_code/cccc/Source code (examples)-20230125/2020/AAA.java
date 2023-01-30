
public class AAA {
	static int sum(int a, int b) {
		int c = a + b;
		a = 66;
		b = 99;
		return c;
	}
	
	static int sumChange(int a, BBB b) {
		int c = a + b.value;
		a = 66;
		b.value = 99;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 8, j = 9;
		System.out.println(i + " " + j);
		int d = sum(i, j);
		System.out.println(i + " " + j);
		System.out.println(d);
		System.out.println("New example");
		//this is an example of the by reference
		BBB bb = new BBB();
		bb.value = 17;
		System.out.println(bb.value);
		sumChange(18, bb);
		System.out.println(bb.value);
	}

}

//all primitive types are used by value in parameters (int, char, boolean, ...), String
//all non-primitive types are used by reference (objects)
