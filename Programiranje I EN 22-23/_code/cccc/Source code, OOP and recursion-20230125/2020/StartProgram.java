
public class StartProgram {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(Integer.parseInt(args[2]));
		String a = new String("banana");
		String b = "not banana";
		String c = "not banana";
		c = c + "jj";
		A firstObject = new A();
		firstObject.a = 16;
		A multipleObjects[] = new A[10000];
		for(int i = 0; i < 10000; i++) {
			multipleObjects[i] = new A();
		}
		Something ss = firstObject;
		SomethingElse se = firstObject;
		Object oo = firstObject;
	}

}
