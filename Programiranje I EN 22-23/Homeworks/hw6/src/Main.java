import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert n: ");
        int n = scan.nextInt();

        System.out.print("Insert k: ");
        int k = scan.nextInt();

        if (n < k || k < 0)
            System.exit(0);

        System.out.println("Result: " + result(n, k));

        System.out.print("Coefficient-array: ");
        for (int i = 0; i <= n; i++) { // printing the binominal coefficient array
            System.out.print(result(n, i) + " ");

            if (result(n, i) == result(n, k))
                if (result(n, i + 1) == result(n, k))
                    continue;
                else
                    break;
        }

        System.out.println();

        // print pascal triangle
        System.out.println("Pascal Triangle:");
        for (int i = 0; i <= n; i++) {
            // for (int j = 0; j <= n - i; j++) // for white spaces on the left
            // System.out.print(" ");

            for (int j = 0; j <= i; j++) // for the actual numbers
                // System.out.print(" " + factoriel(i) / (factoriel(j) * factoriel(i - j)));
                System.out.print(result(i, j) + " ");

            System.out.println();
        }

        scan.close();
    }

    public static int factoriel(int x) {
        if (x == 0)
            return 1;
        else
            return x * factoriel(x - 1);
    }

    public static int result(int n, int k) {
        int result = (factoriel(n) / (factoriel(k) * factoriel(n - k)));
        return result;
    }
}
