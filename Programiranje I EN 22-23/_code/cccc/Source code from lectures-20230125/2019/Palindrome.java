
public class Palindrome {
	static boolean palindrome(String pal) {
		for(int i = 0; i < pal.length() / 2; i++) {
			if(pal.charAt(i) != pal.charAt(pal.length() - i - 1)) {
				return(false);
			}
		}
		return(true);
	}
	
	static void allPalindromes(String pal) {
		for(int i = 0; i < pal.length(); i++) {
			for(int j = 0; j < pal.length() - i + 1; j++) {
				String tmp = pal.substring(i, i + j);
				if(palindrome(tmp)) {
					System.out.println(tmp);
				}
			}
		}
	}
	
	static void longestPalindrom(String pal) {
		int max = -1;
		String result = "";
		for(int i = 0; i < pal.length(); i++) {
			for(int j = 0; j < pal.length() - i + 1; j++) {
				String tmp = pal.substring(i, i + j);
				if(palindrome(tmp)) {
					if(tmp.length() > max) {
						max = tmp.length();
						result = tmp;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "banana";
		System.out.println(palindrome(pal));
		allPalindromes(pal);
		longestPalindrom(pal);
	}

}
