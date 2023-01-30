
public class Fibonacci {
	public int f(int n){
		if(n == 0) return(1);
		if(n == 1) return(1);
		return(f(n - 1) + f(n - 2));
	}
	public static void main(String[] args) {
		Fibonacci ff = new Fibonacci();
		System.out.println(ff.f(7));
	}

}
