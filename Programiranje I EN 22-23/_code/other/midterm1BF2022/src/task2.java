
//read an string and print all words ending with "g"
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++)
            if (strArr[i].endsWith("g"))
                System.out.println(strArr[i]);

        scan.close();
    }
}
