package six;

public class Test {
	static int sestejDo0(int par) {
		  if (par <= 0)

		    return 0;
		  else
		    return
		       sestejDo0(par-1)
		       + par;
		}
	public static void main(String[] args) {
		int rez = sestejDo0(1000000);
		System.out.println(rez);
	}

}
