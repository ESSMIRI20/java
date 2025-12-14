import java.util.Scanner;

class Ex2{

    // static void search(String[] t, int n, String m)
    // {
    //     for (int i = 0; i < n; i++)
    //     {
    //         if (t[i].equals(m)){
    //             System.out.println("exist !");
    //             return;
    //         }
    //     }
    //         System.out.println("il exist pas!");
    // }

    static boolean search(String[] t, int n, String m)
    {
        for (int i = 0; i < n; i++)
        {
            if (t[i].equals(m)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int taille;
        Scanner n = new Scanner(System.in);
        System.out.print("entrer la taille du tableau .");
        taille = n.nextInt();
        String[] array = new String[taille];
        String mot;
        System.out.println("entrer les elements du tableau .");
        for (int i = 0; i < taille; i++)
        {
            System.out.print("entrer l'element N" + i + " :");
            array[i] = n.next();
        }
        // while(true)
        // {
        //     System.out.print("entrer un mot tu veut recherche (entrer quit si tu veu quit).");
        //     mot = n.next();
        //     if(mot.equals("quit"))
        //         break;
        //     Ex2.search(array, taille, mot);
        // }
        mot = "";
        while(!mot.equals("Quitter"))
        {
            System.out.print("entrer le mot a chercher .");
            mot = n.next();
            boolean b = Ex2.search(array, taille, mot);
            if (b)
            {
                System.out.print("exist !");
            }
            else
                System.out.print("n'est pas exist !");
        }
    }
}