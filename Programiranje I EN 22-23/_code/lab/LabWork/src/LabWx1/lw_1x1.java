package LabWx1;

import java.util.Scanner;
import java.math.*;

class lw_1x1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter triangle sides: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s = (a + b + c) / 2;
        double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("P = " + p + ",\t P = " + p);

    }
}
