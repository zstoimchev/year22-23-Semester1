
public class Array {

	public static void main(String[] banana) {
		final int MAX = 1000000;
		int arr[] = new int[MAX];
		for(int i = 0; i < MAX;i++) {
			arr[i] = i + 7;
		}
		for(int i = 0; i < MAX;i++) {
		System.out.println(arr[i]);
		}	
		/*for(int i = 0; i < MAX + 1;i++) {
			System.out.println(arr[i]);
		}*/
	}

}
