import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scan.nextInt();
        System.out.print("Enter elements: ");
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scan.nextInt();
        }

        System.out.println("Number of elements: " + m.length);

        scan.close();
    }

    public static int odd(int x) {
        return x;
    }

    public static int even(int x) {
        return x;
    }

}