import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String text = scan.nextLine();
		
		String[] arr = text.split(" ");
		System.out.println(arr.length);
		
		scan.close();
	}

}
