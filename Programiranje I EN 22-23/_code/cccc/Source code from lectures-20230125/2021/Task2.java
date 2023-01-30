import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			if(i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
