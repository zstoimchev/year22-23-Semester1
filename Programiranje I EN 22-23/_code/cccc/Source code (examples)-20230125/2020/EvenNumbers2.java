
public class EvenNumbers2 {
	public static int[] evenNumbers(int numbs[]) {
		int tmpInt[];
		int counter = 0;
		for(int i = 0; i < numbs.length; i++) {
			if(numbs[i] % 2 == 0) {
				counter++;
			}
		}
		tmpInt = new int[counter];
		int j = 0;
		for(int i = 0; i < numbs.length; i++) {
			if(numbs[i] % 2 == 0) {
				tmpInt[j] = numbs[i];
				j++;
			}
		}
		return(tmpInt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 2, 5, 9, 7, 100, 10000, 10000000, 147};
		int numbers1[] = {11, 21, 51, 91, 71, 1001, 100001, 100000001, 1471, 8};
		int tmpNewInt[];
		tmpNewInt = evenNumbers(numbers);
		for(int i = 0; i < tmpNewInt.length; i++) {
			System.out.println(tmpNewInt[i]);
		}
		System.out.println("Start of the second array");
		tmpNewInt = evenNumbers(numbers1);
		for(int i = 0; i < tmpNewInt.length; i++) {
			System.out.println(tmpNewInt[i]);
		}
	}
}
