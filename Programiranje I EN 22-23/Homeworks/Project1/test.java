import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arbitrary;
        System.out.println("Enter your elements with blank space in-between ");
        System.out.print("(NOTE: pressing enter will stop Your input and start the calculations!): ");
        arbitrary = scan.nextLine();
        // creating a string from the inputed string text
        String[] splited = arbitrary.split(" ");
        // creating new integer array with length of string array-splited
        int[] arr = new int[splited.length];
        // converting string to integer
        for (int i = 0; i < splited.length; i++) {
            arr[i] = Integer.parseInt(arbitrary);
        }
        scan.close();
    }

}
