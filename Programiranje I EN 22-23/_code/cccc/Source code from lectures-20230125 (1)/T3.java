import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of elements in array: ");
		int numbers = sc.nextInt();
		int array[] = new int[numbers];
		for(int i = 0; i < numbers; i++ ) {
			array[i] = sc.nextInt();
		}
		
		//first part of the task
		for(int i = 0; i < numbers; i++ ) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		//second part of the task
		int counter = 0;
		for(int i = 0; i < numbers; i++ ) {
			if(array[i] < 0) {
				counter++;
			}
		}
		System.out.println("Number of negative numbers is: " + counter);
		//third part of the task
		int product = 1;
		for(int i = 0; i < numbers; i++ ) {
			if(i % 2 != 0) {
				product *= array[i]; 
			}
		}
		System.out.println("Product is: " + product);
	}

}
