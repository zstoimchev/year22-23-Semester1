
//read two numbers and print the one closer to zero
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (Math.abs(a) < Math.abs(b))
            System.out.println(a);
        else if (Math.abs(b) < Math.abs(a))
            System.out.println(b);
        else
            System.out.println("They are the same!");

        scan.close();
    }
}
