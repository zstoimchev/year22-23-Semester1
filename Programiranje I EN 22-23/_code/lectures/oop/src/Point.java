public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }
    }

    public double distance(Point p) {
        double first = Math.pow(this.x - p.getx(), 2);
        double second = Math.pow(this.y - p.gety(), 2);
        return Math.sqrt(first + second);

    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        if (x > 0)
            this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        if (y > 0)
            this.y = y;
    }

}
