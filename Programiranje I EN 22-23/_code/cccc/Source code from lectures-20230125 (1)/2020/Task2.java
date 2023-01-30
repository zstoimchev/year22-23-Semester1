import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input one number: ");
		int one = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= one; i++) {
			if(i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
