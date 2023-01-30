
public class EvenNumbers {

	static void printEvenNumbers(int banana[]) {
		for(int i = 0; i < banana.length;i++) {
			if(banana[i] % 2 == 0) {
				System.out.println(banana[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {18, 7, 10, 200, 55, 17, 19};
		printEvenNumbers(numbers);
	}

}
