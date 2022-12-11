import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
            else
                continue;
        }
        System.out.println();

        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                System.out.print(arr[i] + " ");
        System.out.println();

        int product = 1;
        for (int i = 0; i < n; i++)
            if (i % 2 != 0)
                product *= i;
        System.out.println(product);
        scan.close();
    }                                       //nesto fale nz

}
