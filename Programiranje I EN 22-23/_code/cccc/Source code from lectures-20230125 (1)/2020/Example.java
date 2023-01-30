package six;

public class Example {
	static int ff(int n) {
		int rez = 1;
		for(int i = n; i > 1; i = i - 1) {
			rez = rez * i;
		}
		return(rez);
	}
	
	static int f(int n) {
		//f(1) = 1
		if(n == 1) return 1;
		//f(n) = f(n - 1) * n
		return(f(n - 1) * n);
	}
	public static void main(String[] args) {
		//5 ! = 5*4*3*2*1
		//n! = n * (n-1) * (n - 2) * ... *(2) 
		System.out.println(ff(6));
		System.out.println(f(6));
		
	}

}
