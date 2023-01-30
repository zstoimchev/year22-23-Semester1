
public class Fibonacci {
	int f(int n) {
		if(n == 0) {
			return(1);
		}
		else if(n == 1) {
			return(1);
		}
		else {
			return(f(n - 1) + f(n - 2));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci ff = new Fibonacci();
		System.out.println(ff.f(60));
	}

}
