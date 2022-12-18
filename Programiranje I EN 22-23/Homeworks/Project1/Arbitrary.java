import java.util.Scanner;

public class Arbitrary {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);//.useDelimiter(" *");

        String x="";

        while(scan.hasNextInt()){
            //int m=scan.nextInt();
            x=x+scan.nextInt()+" ";
        }

        String[] splitted = x.split(" ");
        for (int i = 0; i < splitted.length; i++)
            System.out.println("." + splitted[i] + ".");
    }

}
