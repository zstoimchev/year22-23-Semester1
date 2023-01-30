
public class ArrayOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array;
		array = new int[5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		System.out.println(array[3]);
		
		int [] newArray = {1,2,3,4,5,6,7,8,9,90};
		System.out.println(newArray[3]);
		
		int month = 1;		
		
		switch(month) {
			case 1: System.out.println("ONE");break;
			case 2: System.out.println("TWO");break;
			case 3: System.out.println("THREE");break;
			case 4: System.out.println("FOUR");break;
		}
	}

}
