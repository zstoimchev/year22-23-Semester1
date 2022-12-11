import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        int sum = 0, product = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + "\t");
            if (arr[i] < 0)
                sum++;
            if (i % 2 != 0) 
                product *= arr[i];
            scan.close();

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
