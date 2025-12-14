// package TP_6;
import java.util.Scanner;


public class Ex3 {
    static int[][] transpar(int[][] array){
            int[][] transpar = new int[3][2];
            for (int i= 0; i < 2; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    transpar[j][i] = array[i][j];
                }
            }
            return transpar;
        }
    public static void main(String[] args)
    {
        
        Scanner n = new Scanner(System.in);
        int[][] array = new int[2][3];
        for (int i= 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("entrer l'element N" + i + " : ");
                array[i][j] = n.nextInt();
            }
        }
        for (int i= 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpar = Ex3.transpar(array);
        for (int i= 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(transpar[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
