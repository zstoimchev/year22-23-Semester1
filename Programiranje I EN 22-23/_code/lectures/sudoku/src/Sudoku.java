import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sudoku {
    public static void main(String[] args) {
        int arr[][] = { { 4, 8, 3, 9, 2, 1, 6, 5, 7 },
                { 9, 6, 7, 3, 4, 5, 8, 2, 1 },
                { 2, 5, 1, 8, 7, 6, 4, 9, 3 },
                { 5, 4, 8, 1, 3, 2, 9, 7, 6 },
                { 7, 2, 9, 5, 6, 4, 1, 3, 8 },
                { 1, 3, 6, 7, 9, 8, 2, 4, 5 },
                { 3, 7, 2, 6, 8, 9, 5, 1, 4 },
                { 8, 1, 4, 2, 5, 3, 7, 6, 9 },
                { 6, 9, 5, 4, 1, 7, 3, 8, 2 } };
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Sudoku!");
        while (!isSolved(arr)) {
            int i = scan.nextInt() - 1;
            int j = scan.nextInt() - 1;
            int num = scan.nextInt();
            if (i < 0 || i > 9 || j < 0 || j > 9 || num < 0 || num > 9) {
                System.out.println("\u001B[31mWrong Move!\u001B[0m");
                continue;
            }

            arr[i][j] = num;

            if (isValid(arr, i, j, num))
                arr[i][j] = num;

            // print(arr);
        }
        System.out.println("You Win!");
        scan.close();
    }

    public static boolean checkQuadrtant(int arr[][], int si, int sj, int ei, int ej) { // start i, end i, same for j
        int sum = 0;
        for (int i = si; i < ei; i++) {
            for (int j = sj; j < ej; j++) {
                sum += arr[i][j];
            }

        }
        if (sum == 45)
            return true;
        else
            return false;
    }

    public static boolean checkQuadrants(int arr[][]) {
        boolean q1 = checkQuadrtant(arr, 0, 0, 3, 3);
        boolean q2 = checkQuadrtant(arr, 0, 3, 3, 6);
        boolean q9 = checkQuadrtant(arr, 0, 6, 3, 9);
        boolean q3 = checkQuadrtant(arr, 3, 8, 6, 3);
        boolean q6 = checkQuadrtant(arr, 3, 3, 6, 6);
        boolean q7 = checkQuadrtant(arr, 3, 6, 6, 6);
        boolean q4 = checkQuadrtant(arr, 6, 8, 9, 3);
        boolean q5 = checkQuadrtant(arr, 6, 3, 9, 6);
        boolean q8 = checkQuadrtant(arr, 6, 6, 9, 9);

        return q1 && q2 && q3 && q4 && q5 && q6 && q7 && q8 && q9;
    }

    public static boolean isSolved(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0)
                    return false;
            }
        }
        print(arr);

        return checkQuadrants(arr);
    }

    public static boolean isValid(int arr[][], int i, int j, int x) {
        int countCol = 0; // counter for duplicates
        int countRow = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][j] == x)
                countCol += 1;
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[i][k] == x)
                countRow += 1;
        }
        if (countRow + countCol > 2)
            return false;
        else
            return true;
    }

    public static void print(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j + 1) % 3 == 0) {
                    System.out.print(array[i][j] + "\u001B[31m|\u001B[0m");
                } else if (j == 0)
                    System.out.print("\u001B[31m|\u001B[0m" + array[i][j] + "|");
                else
                    System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
