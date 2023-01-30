import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of numbers: ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				counter++;
			}
		}
		System.out.println(counter);
		
		int prod = 1;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 != 0) {
				prod = prod * arr[i];
			}
		}
		System.out.println(prod);
	}

}
