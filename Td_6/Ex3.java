import java.util.Scanner;

public class Ex3 {
    public static boolean recherche(char t[], char n)
    {
        for (char x : t)
        {
            if(n == x)
                return (true);
        }
        return (false);
    }

    public static void main(String[] args)
    {
        char array[] = new char[4];
        int i;
        Scanner s = new Scanner(System.in);

        System.out.println("entrer les characteres .");
        for (i = 0; i < 4; i++)
        {
            System.out.print("char "+ (i + 1) + " :");
            array[i] = s.next().charAt(0);
        }
    
        if(recherche(array, 'a'))
            System.out.println("le character a exist");
        else
            System.out.println("le character a n'est exist pas.");
    }
}
