public class Methods {

    public static int length(int[] arr) {
        return arr.length;
    }

    public static int diffNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                counter++;
        }
        return counter;
    }

    public static int evenNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] / 2 * 2 == arr[i])
                counter++;
        return counter;
    }

    public static int oddNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] / 2 * 2 != arr[i])
                counter++;
        return counter;
    }

    public static String frequencyOfRepetition(int[] arr) { // to explain plus change flag
        String rwsult = "";
        String[] temparr = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
            temparr[i] = Integer.toString(arr[i]);
        for (int i = 0; i < temparr.length; i++) {
            if (temparr[i] != "*") {
                int repeatNumber = 1;
                for (int j = i + 1; j < temparr.length; j++) {
                    if (Integer.parseInt(temparr[i]) == Integer.parseInt(temparr[j])) {
                        repeatNumber++;
                        temparr[j] = "*";
                    }
                }
                rwsult += "\n\tNumber " + arr[i] + ": \t" + (((float) repeatNumber / arr.length) * 100) + "%";
            }
        }
        temparr = null;
        return rwsult;
    }

    public static String maximumOccurence(int[] arr) {
        int maxcount = 1;
        int frequ = 0;
        String RESULT = "/"; // '/' stands for no repeating numbers
        if (arr.length == 1)
            RESULT = "" + arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                else
                    continue;
            }
            if (count > maxcount) {
                maxcount = count;
                frequ = arr[i];
                RESULT = "" + frequ;
            }
        }
        return RESULT;
    }

    public static int largestNumber(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int secondSmallestNumber(int[] arr) {
        int i;
        for (i = 1; i < arr.length; i++)
            if (arr[i] != arr[i - 1])
                return arr[i];
        return arr[i];
    }

    public static float averageNumber(int[] arr) { // round decimals
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return (float) sum / (arr.length);
    }

    public static double standardDeviation(int[] arr) {
        double diviation = 0;
        for (int i = 0; i < arr.length; i++)
            diviation += Math.pow((arr[i] - averageNumber(arr)), 2);
        return Math.sqrt(diviation / (arr.length - 1));
    }

    public static double median(int[] arr) {// ======================================
        double result = 0;
        if (arr.length % 2 == 0)
            result = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        else
            result = arr[((arr.length + 1) / 2) - 1];
        return result;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    // this function is later used in checking palindromes, because it is needed in
    // more than one place, i decided to make it as a function not to write
    // repeating code many times. It only returns reversed numbers, does not check
    // anything
    public static int reversed(int n) {
        int temp = n, reversed = 0;
        if (temp > 0)
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
        return reversed;
    }

    public static int sumOfPalindromicNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (reversed(arr[i]) == arr[i])
                counter++;
        return counter;
    }

    public static String largestPalindrom(int[] arr) {
        String RESULT = "/";
        // boolean flag = false;

        if (largestNumber(arr) > 0) {
            for (int i = (arr.length - 2); i >= 0; i--) {
                if (reversed(arr[i]) == arr[i]) {
                    RESULT = "" + arr[i];
                    // flag = true;
                    break;
                }
            }
            // if (flag == false) {
            // for (int i = largestNumber(arr) - 1; i >= 0; i--)
            // if (reversed(i) == i) {
            // RESULT = "" + i;
            // break;
            // }
            // }
        }
        return RESULT;
    }

    public static void printReversed(int[] arr) {
        int i;
        for (i = arr.length - 1; i > 0; i--)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[0]);
    }
}
