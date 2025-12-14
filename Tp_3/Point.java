public class Point {
    private double x;
    private double y;

    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public void translater(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public void affiche(){
        System.out.println("voila la valeur de x: " + this.x + "\nvoila la valeur de y: " + this.y);
    }

    public static void main(String[] args)
    {
        Point p = new Point(1, 2);
        p.translater(1, 1);
        p.affiche();
    }
}
