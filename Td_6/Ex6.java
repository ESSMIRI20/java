class Personne {
//    private String s;
    // public Personne(String s)
    // {
    //     this.s = s;
    // }
    public void travailler()
    {
        System.out.println("test");
    }
}

class Menuisier extends Personne {
    public void travailler()
    {
        System.out.println("Menuisier");
    }
}

class Plambie extends Personne {
    public void travailler()
    {
        System.out.println("Plambie");
    }
}

public class Ex6 {
    public static void main(String[] args)
    {
        Personne f[] = new Personne[3];
        f[0] = new Plambie();
        f[1] = new Menuisier();
        f[2] = new Plambie();
        for (int i = 0;i < 3; i++)
            {
                f[i].travailler();
            }
    }
}
