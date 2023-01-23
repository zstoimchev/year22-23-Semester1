import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String orgArr = scan.nextLine();
        String[] newArr = orgArr.split(" ");

        for(int i=0; i<newArr.length; i++){
            if(newArr[i].charAt(0)=='a')
                System.out.println(newArr[i]);
        }

    }
}

//String[] arr = scan.nextLine().split(" );