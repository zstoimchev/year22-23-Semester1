
public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char uniChar = '\u03A9';
		System.out.println(uniChar);
		char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
		// array of characters
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		char a = '(';
		if(Character.isLetter(a)) {
			System.out.print("A LETTER");
		}
		else {
			System.out.print("NOT A LETTER");
		}
		
		System.out.println();
		System.out.println();System.out.println();System.out.println();System.out.println();
		System.out.print("This is\n some te\txt\\.");
		
		//convert string to integer:
		String number = "123";
		String number1 = "444";
		String number2 = number + number1;
		int n = Integer.parseInt(number);
		int n1 = Integer.parseInt(number1);
		int n2 = n + n1;
		System.out.println();
		System.out.println(number2);
		System.out.println(n2);
	}

}
