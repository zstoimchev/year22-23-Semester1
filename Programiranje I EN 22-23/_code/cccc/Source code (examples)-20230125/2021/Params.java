package prog1_en_3;

public class Params {
	
	
	static int method(int x) {
		x = 7;
		return(666);
	}
	
	static int method1(A aaa) {
		aaa.value = 777;
		return(666);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int banana = 17;
		method(banana);
		System.out.println(banana);
		A banana1 = new A();
		method1(banana1);
		System.out.println(banana1.value);
	}

}
