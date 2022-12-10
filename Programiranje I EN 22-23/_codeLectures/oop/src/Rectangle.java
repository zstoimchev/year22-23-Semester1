public class Rectangle {

    Side diagonal;
    Point A;
    Point B;
    Point C;
    Point D;
    Side AB;
    Side BC;
    Side CD;
    Side DA;

    public Rectangle(Side diagonal) {
        this.diagonal = diagonal;
        this.A = diagonal.A;
        this.C = diagonal.B;
        this.B = new Point(C.getx(), A.gety());
        this.D = new Point(A.getx(), C.gety());

        AB = new Side(A, B);
        BC = new Side(B, C);
        CD = new Side(C, D);
        DA = new Side(D, A);

    }

    public double area() {
        return AB.length() + DB.length();
    }

    public double perimeter() {
        return (AB.length() + BC.length()) * 2;
    }

}
