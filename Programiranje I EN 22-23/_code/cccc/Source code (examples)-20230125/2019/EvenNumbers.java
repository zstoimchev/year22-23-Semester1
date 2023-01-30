
public class EvenNumbers {
	/**
	 * Write a method that searches for all even values and prints them.
	 * @param v
	 */
	static int[] evenNumbers(int v[]) {
		int counter = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				System.out.println(v[i]);
				counter++;
			}
		}
		int even[] = new int [counter];
		int newCounter = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				even[newCounter] = v[i];
				newCounter++;
			}
		}
		return(even);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that creates an array of integers. 
		int values[] = {1, 5, 77, 33, 5454, 665, 3443, 6, 65, 656 , 88, 6666, 8667, 33};
		//evenNumbers(values);
		int finalValues[] = evenNumbers(values);
		for(int i = 0; i < finalValues.length; i++) {
			System.out.println(finalValues[i]);
		}
	}

}
