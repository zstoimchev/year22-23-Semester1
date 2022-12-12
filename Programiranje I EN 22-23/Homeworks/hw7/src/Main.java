import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Given numbers are: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Result is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) Math.pow(arr[i] - arr[9 - i], 2) + " ");
        }

        scan.close();
    }
}
