import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        Arrays.sort(arr); // sorting the array in accending order

        String[] result = new String[15];
        result[0] = "Number of elements:------------- " + Methods.length(arr); // =====================DONE.
        result[1] = "Number of different numbers:---- " + Methods.diffNumbers(arr); // ================DONE.
        result[2] = "Number of even numbers:--------- " + Methods.evenNumbers(arr); // ================DONE.
        result[3] = "Number of odd numbers:---------- " + Methods.oddNumbers(arr); // =================DONE.
        result[4] = "Frequency of repetition in %:    " + Methods.frequencyOfRepetition(arr); // ======DONE.?
        result[5] = "Maximum occurence:-------------- " + Methods.maximumOccurence(arr); // ===========DONE.
        result[6] = "Largest number:----------------- " + Methods.largestNumber(arr); // ==============DONE.
        result[7] = "Second smallest number:--------- " + Methods.secondSmallestNumber(arr); // =======DONE.
        result[8] = "Average of all numbers:--------- " + Methods.averageNumber(arr); // ==============DONE.
        result[9] = "Standard deviation:------------- " + Methods.standardDeviation(arr); // ==========DONE.?
        result[10] = "Median:------------------------ " + Methods.median(arr); // =====================DONE???
        result[11] = "Sum of all numbers:------------- " + Methods.sum(arr); // =========================DONE.
        result[12] = "Number of palindromic numbers:-- " + Methods.sumOfPalindromicNumbers(arr); // =====DONE.?
        result[13] = "Largest palindromic number:----- " + Methods.largestPalindrom(arr); // ============DONE.?
        // NOTE: the program must handle integer overflow, Just because the numbers are
        // guarantied to be integers does
        // not guaranty that the result of some computations will be

        for (int i = 0; i < 14; i++) {
            System.out.println((i + 1) + ". " + result[i]);
        }
        scan.close();
    } // closing main
}
