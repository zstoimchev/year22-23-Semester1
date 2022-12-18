import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your elements with blank space in-between");
        System.out.print("(NOTE: entering character is stopping the input!): ");

        String arbitrary = "";
        while (scan.hasNextInt())
            arbitrary += scan.nextInt() + " ";
        scan.close(); // closing the scanner

        // creating a string array from the inputed string text
        String[] splited = arbitrary.split(" ");

        // creating new integer array with length of string array-splited
        int[] arr = new int[splited.length];
        int[] org = new int[splited.length];

        // passing the values from sting array to int array
        for (int i = 0; i < splited.length; i++) {
            arr[i] = Integer.parseInt(splited[i]);
            org[i] = Integer.parseInt(splited[i]);
        }

        // removing the variable and temporarly used array
        arbitrary = null;
        splited = null;

        // for quick testing
        // int[] arr = { 25, 30, -42, 10, -7, 21, 21, 98, 21 };
        Arrays.sort(arr); // sorting the array in accending order

        String[] result = new String[14];
        result[0] = "Number of elements:------------- " + Methods.length(arr); // =====================DONE.
        result[1] = "Number of different numbers:---- " + Methods.diffNumbers(arr); // ================DONE.
        result[2] = "Number of even numbers:--------- " + Methods.evenNumbers(arr); // ================DONE.
        result[3] = "Number of odd numbers:---------- " + Methods.oddNumbers(arr); // =================DONE.
        result[4] = "Frequency of repetition in % for:" + Methods.frequencyOfRepetition(org); // ======DONE.
        result[5] = "Maximum occurence:-------------- " + Methods.maximumOccurence(arr); // ===========DONE.
        result[6] = "Largest number:----------------- " + Methods.largestNumber(arr); // ==============DONE.
        result[7] = "Second smallest number:--------- " + Methods.secondSmallestNumber(arr); // =======DONE.
        result[8] = "Average of all numbers:--------- " + Methods.averageNumber(arr); // ==============DONE.
        result[9] = "Standard deviation:------------ " + Methods.standardDeviation(arr); // ==========DONE.
        result[10] = "Median:------------------------ " + Methods.median(arr); // =====================DONE
        result[11] = "Sum of all numbers:------------ " + Methods.sum(arr); // =========================DONE.
        result[12] = "Number of palindromic numbers:- " + Methods.sumOfPalindromicNumbers(arr); // =====DONE.
        result[13] = "Largest palindromic number:---- " + Methods.largestPalindrom(arr); // ============DONE.
        // NOTE: the program must handle integer overflow, Just because the numbers are
        // guarantied to be integers does
        // not guaranty that the result of some computations will be

        for (int i = 0; i < result.length; i++)
            System.out.println((i + 1) + ". " + result[i]);
        System.out.print("15. Printing reversed array:------- ");
        Methods.printReversed(org);

    } // closing main
}
