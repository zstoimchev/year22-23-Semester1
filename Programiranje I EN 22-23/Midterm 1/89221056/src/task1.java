import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a + "^2 - " + b + "^2 = " + ((a*a)-(b*b)));
		
		scan.close();
	}

}
