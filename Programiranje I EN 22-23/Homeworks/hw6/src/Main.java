import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert n: ");
        int n = scan.nextInt();

        System.out.print("Insert k: ");
        int k = scan.nextInt();

        // if the inputer numbers doesn't fulfill the requested condition, the program
        // exits with code 0
        if (n < k || k < 0)
            System.exit(0);

        System.out.println("Result: " + result(n, k));

        System.out.print("Coefficient-array: ");
        // printing the binominal coefficient array
        for (int i = 0; i <= k; i++)
            System.out.print(result(n, i) + " ");

        System.out.println();

        // print pascal triangle
        System.out.println("Pascal Triangle:");
        for (int i = 0; i <= n; i++) {
            // for white spaces on the left, if we want to print it like real triangle
            // for (int j = 0; j <= n - i; j++)
            // System.out.print(" ");

            for (int j = 0; j <= i; j++)
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
        int result = (factoriel(n) / ((factoriel(k) * factoriel(n - k))));
        return result;
    }
}
