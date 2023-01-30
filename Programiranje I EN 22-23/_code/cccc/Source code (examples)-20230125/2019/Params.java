
public class Params {
	static void change(C ccc) {
		ccc.value = 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc = new C();
		cc.value = 17;
		System.out.println(cc.value);
		change(cc);
		System.out.println(cc.value);
	}

}
