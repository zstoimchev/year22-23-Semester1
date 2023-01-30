
public class HighValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		long a = 0;
		int mult = 1000;
		long i;
		for(i = 0; i < 1000000000*mult; i++) {
			a = a + i;
		}
		System.out.println("The value of a is: " + a);
	}

}
