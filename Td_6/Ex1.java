public class Ex1 {
    public static void main(String[] args)
    {
        int s = 0;
        int array[] = {5, 6, 7, 8, 9};
        // for (int i = 0; i < array.length; i++)
        // {
        //     s += array[i];
        //     System.out.println(array[i]);
        // }
        for(int n : array)
        {
            s += n;
            System.out.println(n);
        }
        System.out.println("la somme des elements du tableau est : " + s);
    }
}
