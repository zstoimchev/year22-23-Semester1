import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First name: ");
        String name = scan.nextLine();

        System.out.print("Last name: ");
        String surname = scan.nextLine();

        String namesurname = "" + name + " " + surname;
        String[] splited = namesurname.split(" ");

        for (int i = 0; i < splited.length; i++) {
            for (int j = 0; j < splited[i].length(); j++) {
                for (int k = 0; k < splited[i].length(); k++) {
                    if (j == k)
                        System.out.print(splited[i].charAt(j));
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
