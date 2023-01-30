
public class EvenNumbers2 {

	static int[] returnEvenNumbers(int banana[]) {
		int rez[];
		int counter = 0;
		for(int i = 0; i < banana.length;i++) {
			if(banana[i] % 2 == 0) {
				counter++;
			}
		}
		rez = new int[counter];
		int ind = 0;
		for(int i = 0; i < banana.length;i++) {
			if(banana[i] % 2 == 0) {
				rez[ind] = banana[i];
				ind++;
			}
		}
		return(rez);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {18, 7, 10, 200, 55, 17, 19};
		numbers = returnEvenNumbers(numbers);
		System.out.println(returnEvenNumbers(numbers));
		for(int i = 0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
