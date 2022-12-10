import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Point a = new Point(5, 3); // object
        Point b = new Point(2, 6);

        // System.out.println(p2.getx());
        // p2.setx(-92);
        // System.out.println(p2.distance(point));

        Side AB = new Side(a, b);
        System.out.println();
        Rectangle rectangle = new Rectangle(AB);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}
