
//print absolute value of negative numbers
import java.util.Scanner;
//import java.math.*;   //idk why but it works the same as without

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Enter elements of array 1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.print("Enter elements of array 2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }

        int minin = arr1[0] + arr2[0];
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + arr2[i] + " ");
            if (arr1[i] + arr2[i] < minin)
                minin = arr1[i] + arr2[i];
        }
        System.out.println(minin);

        scan.close();
    }
}
 