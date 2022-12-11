import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        String text = scan.nextLine();
        System.out.println(text.split(" ").length);

        /*
        String words[] = text.split(" ");
        System.out.println(words);


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        System.out.println("words: " + (count + 1));
        */
        scan.close();
    }
}
