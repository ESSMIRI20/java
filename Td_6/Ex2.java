public class Ex2 {
    public static boolean recherche(int t[], int n)
    {
        for (int x : t)
        {
            if(n == x)
                return (true);
        }
        return (false);
    }
    public static void main(String[] args){
        int t[] = {2, 3, 6, 3, 9, 1};
        if (recherche(t, 13)){
            System.out.println("la valeur est exist en tableau t[] .");
        }
        else
            System.out.println("ne exist pas en tableau t[] .");
    }
}
