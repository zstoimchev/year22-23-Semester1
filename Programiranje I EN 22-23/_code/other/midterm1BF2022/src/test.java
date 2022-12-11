import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++)
            System.out.println(strArr[i]);

        scan.close();

        System.out.println(strArr[0].charAt(strArr.length - 1));
    }

}
