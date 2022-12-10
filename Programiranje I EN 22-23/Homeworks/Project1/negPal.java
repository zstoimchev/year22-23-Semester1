import java.util.Arrays;

public class negPal {
    public static void main(String[] args) {
        int[] arr = { -324, -234, -344, -98 };
        int result = 0;

        if (largest(arr) > 0) {
            for (int i = largest(arr); i > 0; i++) {
                if (reversedPositive(i) == i) {
                    result = reversedPositive(i);
                    break;
                }
            }
            System.out.println(result);
        } else {
            for (int i = largest(arr); i < 0; i++) {
                if (reversedNegative(i) == i) {
                    result = reversedNegative(i);
                    break;
                }
            }
            System.out.println(result);
        }

    }

    public static int largest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int reversedPositive(int n) {
        int temp = n, reversed = 0;
        if (temp > 0)
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
        return reversed;
    }

    public static int reversedNegative(int n) {
        int temp = n, reversed = 0;
        while (temp < 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed;
    }

}
