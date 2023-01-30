
public class A {
	public int a = 7;
	private int value;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		A aa1 = new A();
		B bb = new B();
		aa.a = 5;
		aa.value = 8;
		System.out.println(aa1.a);
		System.out.println(aa.a);
		System.out.println(aa.value);
		bb.something();
	}

}
