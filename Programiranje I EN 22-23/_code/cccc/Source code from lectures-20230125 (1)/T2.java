import java.util.Scanner;

public class T2 {
	static void print(String name) {
		char arrr[] = name.toCharArray();
		for(int i = arrr.length - 1; i >= 0; i++) {
			System.out.print(arrr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String name = "jernej";
		
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= one; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
