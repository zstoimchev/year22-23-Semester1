import java.util.Vector;

public class Palindrome {
	static boolean isPalindrome(String a) {
		StringBuilder aa = new StringBuilder(a);
		String tmp = aa.reverse().toString();
		//if(a.compareTo(tmp) == 0) {
		if(a.equals(tmp)) {
			return(true);
		}
		return(false);
	}
	
	static boolean isPalindrome1(String a) {
		for(int i = 0; i < a.length() / 2; i++) {
			if(a.charAt(i) != a.charAt(a.length() - i - 1)) {
				return(false);
			}
		}
		return(true);
	}
	
	static Vector allSubstrings(String a) {
		Vector vect = new Vector();
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < a.length() - i + 1; j++) {
				String tmp = a.substring(i, i + j);
				vect.add(tmp);
			}
		}
		return(vect);
	}
	
	static Vector allPalindromes(String a) {
		Vector vect = allSubstrings(a);
		Vector results = new Vector();
		for(int i = 0; i < vect.size(); i++) {
			String tmpStr = (String)vect.elementAt(i);
			if(isPalindrome1(tmpStr)) {
				results.add(tmpStr);
			}
		}
		return(results);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "pericasrežeracirep";
		if(isPalindrome(word)) {
			System.out.println("Yes it is.");
		}
		else {
			System.out.println("No it is not.");
		}
		
		if(isPalindrome1(word)) {
			System.out.println("Yes it is.");
		}
		else {
			System.out.println("No it is not.");
		}
		System.out.println(word.substring(3, 5));
		Vector results = allSubstrings("banana");
		for(int i = 0; i < results.size(); i++) {
			System.out.println(results.elementAt(i));
		}
		
		
		System.out.println("*******second task*****************************************************************");
		results = allPalindromes("pericarežeracirep");
		for(int i = 0; i < results.size(); i++) {
			System.out.println(results.elementAt(i));
		}
		
		/*
		banana
		b
		ba
		ban
		bana
		banan
		banana
		a
		an
		ana
		anan
		anana
		n
		na
		nan
		nana
		*/
	}

}
