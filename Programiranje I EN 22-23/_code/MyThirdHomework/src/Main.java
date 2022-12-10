import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        String surname=scan.nextLine();
        int id=scan.nextInt();

        System.out.println(name+" "+surname+": "+id);
    }
}
