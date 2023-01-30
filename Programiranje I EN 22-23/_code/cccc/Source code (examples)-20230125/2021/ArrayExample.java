package prog1_en_3;

public class ArrayExample {
	static void evenNumbers(int a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
	
	static int[] returnEvenNumbers(int a[]) {
		int counter = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				counter++;
			}
		}
		int returnArray[] = new int[counter];
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				returnArray[count] = a[i];
				count++;
			}
		}
		return(returnArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2341, 4, 54, 54, 6565, 445 , 4534, 454, 5, 33, 22};
		evenNumbers(array);
		int rez[] = returnEvenNumbers(array);
		System.out.println("dddddddddddddddddddddddddd");
		for(int i = 0; i < rez.length; i++) {
			System.out.println(rez[i]);
		}
	}

}
