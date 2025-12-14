public class Ex4 {
    public static int[] reverse(int t[])
    {
        int n = t.length;
        int array[] = new int[n];
        int j = 0;
        for (int i = t.length - 1; i >= 0; i--)
        {
            array[j] = t[i];
            j++;
        }
        return (array);
    }
    public static void main(String[] args)
    {
        int t[] = {1, 3, 6, 0};
        int arr[] = new int[4];
        arr = reverse(t);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
