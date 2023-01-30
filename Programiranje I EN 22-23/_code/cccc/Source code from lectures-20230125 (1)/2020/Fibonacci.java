package six;

public class Fibonacci {
	static int f(int n) {
		if(n == 0) return(1);
		if(n == 1) return(1);
		return(f(n - 1) + f(n - 2));
	}
	
	public static void main(String[] args) {
		System.out.println(f(55));
	}

}
