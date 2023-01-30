
public class F {
	int f(int n) {
		if(n <= 1) {
			return(1);
		}
		else {
			return(f(n - 1) * n);
		}
	}
	
	int f1(int n) {
		int rez = 1;
		if(n <= 1) {
			return(1);
		}
		for(int i = 1; i <= n; i++) {
			rez *= i;
		}
		return(rez);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F ff = new F();
		//System.out.println(ff.f(20000));
		System.out.println(ff.f1(20000));
	}

}
