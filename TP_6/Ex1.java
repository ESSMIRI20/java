import java.util.Scanner;

class Ex1{

    static void affiche(float[] t, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(t[i]);
        }
    }
    public static void main(String[] args)
    {
        float[] array = new float[5];
        Scanner n = new Scanner(System.in);
        System.out.println("entrer les elements du tableau .");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("entrer l'element N" + i + " :");
            array[i] = n.nextFloat();
        }
        Ex1.affiche(array, 5);
    }
}