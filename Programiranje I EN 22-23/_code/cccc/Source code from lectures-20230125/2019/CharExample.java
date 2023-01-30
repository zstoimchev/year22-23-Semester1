
public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char uniChar = '\u039A';
		char omega = '\u03C9';
		System.out.println(uniChar + "    " + omega);
		String a = "123";
		int x = Integer.parseInt(a);
		
		String text = "This is a long text";
		System.out.println(text.charAt(8));
		System.out.println(text.substring(10, 14));
		System.out.println(text.indexOf("long"));
	}

}
