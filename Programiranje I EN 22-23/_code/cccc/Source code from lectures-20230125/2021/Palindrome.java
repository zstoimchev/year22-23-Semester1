
public class Palindrome {
	static String[] allSubStrings(String a) {
		int counter = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length() - i; j++) {
				if (palindrome(a.substring(i, a.length() - j)))
					counter++;
			}
		}
		String rez[] = new String[counter + 1];
		int ccc = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length() - i; j++) {
				if (palindrome(a.substring(i, a.length() - j))) {
					rez[ccc] = a.substring(i, a.length() - j);
					ccc++;
				}
			}
		}
		rez[counter] = "";
		return (rez);
	}

	static boolean palindrome(String a) {
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
				return (false);
			}
		}
		return (true);

	}

	static boolean palindrome1(String a) {
		StringBuilder ss = new StringBuilder(a);
		String tmp = ss.reverse().toString();
		if (a.equals(tmp)) {
			return true;
		}
		return (false);

	}

	static void longestPalindrome(String a) {
		String all[] = allSubStrings(a);
		int maxLength = -1;
		String theLongest = "";
		for (int i = 0; i < all.length; i++) {
			if (all[i].length() > maxLength) {
				maxLength = all[i].length();
				theLongest = all[i];
			}
		}
		System.out.println(theLongest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome(""));
		System.out.println(palindrome1("banana"));
		String aa[] = allSubStrings("banana");
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
		longestPalindrome("banana");
	}

}
