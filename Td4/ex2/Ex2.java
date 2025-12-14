class Point {

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
}

class Point3D extends Point {
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Coordonnees : " + z);
    }
    private int z;
}

public class Ex2{
    public static void main(String[] args)
    {
        Point p = new Point(2, 1);
        Point3D p3d = new Point3D(3, 2, 2);
        p.affiche();
        p3d.affiche();
    }
}