import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int values[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of values: ");
		int number = sc.nextInt();
		values = new int[number];
		for(int i = 0; i < number; i++) {
			System.out.println("Next value: ");
			values[i] = sc.nextInt();
		}
		for(int i = 0; i < values.length; i++) {
			if(values[i] % 2 == 0) {
				System.out.println(values[i]);
			}
		}
		int negative = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] < 0) {
				negative++;
			}
		}
		System.out.println("All negtive: " + negative);
		int product = 1;
		for(int i = 0; i < values.length; i++) {
			if(i % 2 != 0) {
				product = product * values[i];
			}
		}
		System.out.println("Product: " + product);//0 1, 1 2, 2 3, 3 4
		
	}

}
