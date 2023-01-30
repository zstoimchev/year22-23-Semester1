
public class EvenValues {
	public static void evenNumbers(int numbs[]) {
		for(int i = 0; i < numbs.length; i++) {
			if(numbs[i] % 2 == 0) {
				System.out.println(numbs[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 2, 5, 9, 7, 100, 10000, 10000000, 147};
		int numbers1[] = {11, 21, 51, 91, 71, 1001, 100001, 100000001, 1471, 8};
		evenNumbers(numbers);
		System.out.println("Start of the second array");
		evenNumbers(numbers1);
	}
}
