package exercicos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exer2_15 {
    public static void main(String[] args) throws FileNotFoundException {

        int[][] s1 = new int[4][4];
        int[][] s2 = new int[4][4];

        ler(s1);
        ler(s2);

        imprimir(s1);
        System.out.println();
        imprimir(s2);

    }


    public static void ler(int matrix[][]) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/entrada.txt"));

        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
    }


    public static void imprimir(int matrix[][]) throws FileNotFoundException {

        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}
