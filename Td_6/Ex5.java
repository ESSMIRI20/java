class Forme {
    public double calculerSurface()
    {
        return 0;
    }
}

class Cercle extends Forme {
    private double r;
    public Cercle(double r)
    {
        this.r = r;
    }
    @Override
    public double calculerSurface()
    {
        return (r * r * 3.14);
    }
}

class Rectangle extends Forme {
    private double a;
    private double b;
    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculerSurface()
    {
        return (a * b);
    }
}

public class Ex5 {
    public static void main(String[] args)
    {
        Forme f[] = new Forme[3];
        f[0] = new Cercle(3);
        f[1] = new Rectangle(1, 3);
        f[2] = new Cercle(4);
        for (int i = 0;i < 3; i++)
            {
                System.out.println(f[i].calculerSurface());
            }
    }
}
