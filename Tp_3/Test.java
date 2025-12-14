public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // No toString() method here!
}

public class Test {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);
    }
}
