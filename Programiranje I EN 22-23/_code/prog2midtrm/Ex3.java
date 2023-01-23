import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 1;
		System.out.print("Number of numbers: ");
		int j = sc.nextInt();
		int arr[] = new int[j];
		for(int i = 0; i < j; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < j; i++){
			if(arr[i] % 2 == 1) {
				odd += arr[i] * arr[i];
			}
			else{
				even *= arr[i];
			}
		}
		System.out.println(odd - even);
		
	}

}
