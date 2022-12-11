import java.util.Scanner;

public class task3short {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String even = "";
        int broj, sum = 0, product = 1;

        for (int i = 0; i < n; i++) {
            broj = scan.nextInt();
            if (broj % 2 == 0)
                even = even + broj + " ";
            if (broj < 0)
                sum++;
            if (i % 2 != 0)
                product *= broj;
        }

        System.out.println(even);
        System.out.println(sum);
        System.out.println(product);
        
        scan.close();
    }
}
