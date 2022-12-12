import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("String: ");
        String string = scan.nextLine();

        System.out.println("Result is: " + reverse(string));

        scan.close();
    }

    public static String reverse(String string) {
        String res = "";
        for (int i = string.length() - 1; i > 0; i -= 2) {
            res += string.charAt(i) + " ";
        }
        return res;
    }
}
        