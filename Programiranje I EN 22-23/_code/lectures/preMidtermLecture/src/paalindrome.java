import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        // locates and returns as an array of all palindromes in a string. The string si
        // the method parameter
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        palindroms(text);

        scan.close();
    }

    public static String[] palindroms(String input) {
        String[] words = input.split(" ");
        new StringBuilder(input).reverse().equals(input);
        for (int i = 0; i < words.length; i++) {
            if (new StringBuilder(words[i]).reverse().equals(words[i])) {
                System.out.println("Palindrome");
            }
        }
        return null;

    }
}