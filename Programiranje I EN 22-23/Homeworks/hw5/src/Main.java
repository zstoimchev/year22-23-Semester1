import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int first = scan.nextInt();

        System.out.print("Input the second number: ");
        int second = scan.nextInt();

        if (first > second)
            System.out.println("The greatest number is: " + first);
        else if (second > first)
            System.out.println("The greatest number: " + second);
        else
            System.out.println("The numbers are equal");

        System.out.println("The arithmetic mean is (" + first + "+" + second + ")/2=" + ((float) (first + second) / 2));
        scan.close();
    }
}
