import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0)
                sum += i; // sum = sum+1;
        }
        System.out.println(sum);
        scan.close();
    }
}
