package prog1_en_3;

public class CharracterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			char ch = 'a'; 
			char uniChar = '\u03A9'; 
				// Unicode reppresentation of the Greek omega
			char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
				// array of characters
			Character ch1 = new Character('a');
			Character ch2 = 'a'; 
				// basic type char 'a' is wrapped into and object of the type Character
			System.out.println(uniChar);
	}

}
