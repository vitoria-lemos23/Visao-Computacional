package exercicos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exer2_15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/entrada.txt"));
        int linha = scan.nextInt();
        int coluna = scan.nextInt();
        int[][] matriz = new int[linha][coluna];
        int[][] copiaMatriz = new int[linha][coluna];






        // Leitura da matriz S1
        for(int i = 0 ;i < linha; i++) {
            for(int j = 0 ; j < coluna; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        //copia matria
        for(int i = 0 ;i < linha; i++) {
            for(int j = 0 ; j < coluna; j++) {
                copiaMatriz[i][j] = matriz[i][j];
            }
        }


        System.out.println("Imprimir copia");
        imprimir(copiaMatriz, linha, coluna);




        System.out.println();
        FunçaoAuxiliar(matriz,copiaMatriz,linha,coluna);
        imprimir(copiaMatriz, linha, coluna);

    }


    public static void imprimir(int matrix[][], int linha, int coluna) throws FileNotFoundException {

        for(int i = 0; i < linha; i++)
        {
            for (int j = 0; j < coluna; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void verificarAdjacencia(int matrizCopia[][], int matrizOriginal[][], int x, int y, int linha, int coluna)
    {

        boolean horizontal = false;
        boolean vertical = false;

        //diagonais

        if((x + 1) < linha && (y + 1) < coluna  && (matrizOriginal[x + 1][y + 1]) == 1 )
        {
            horizontal = (matrizOriginal[x+1][y]== 1);
            vertical = (matrizOriginal[x][y+1] == 1);

            if(!horizontal && !vertical)
            {
                matrizCopia[x + 1][y] = 1;
                matrizCopia[x][y+1] = 1;
            }


        }
        if((x + 1) < linha && (y - 1) >= 0  && (matrizOriginal[x + 1][y - 1]) == 1 )
        {
            horizontal = (matrizOriginal[x+1][y]== 1);
            vertical = (matrizOriginal[x][y-1] == 1);

            if(!horizontal && !vertical)
            {
                matrizCopia[x + 1][y ] = 1;
                matrizCopia[x][y-1] = 1;
            }

        }
        if((x - 1) >= 0 && (y + 1) < coluna  && (matrizOriginal[x - 1][y + 1]) == 1 )
        {

            horizontal = (matrizOriginal[x][y + 1]== 1);
            vertical = (matrizOriginal[x - 1][y] == 1);

            if(!horizontal && !vertical)
            {
                matrizCopia[x][y + 1]= 1;
                matrizCopia[x - 1][y] = 1;
            }

        }
        if((x - 1) >= 0 && (y - 1) >= 0  && (matrizOriginal[x - 1][y - 1]) == 1 )
        {
            horizontal = (matrizOriginal[x - 1][y]== 1);
            vertical = (matrizOriginal[x ][y - 1] == 1);

            if(!horizontal && !vertical)
            {
                matrizCopia[x - 1][y] = 1;
                matrizCopia[x ][y - 1] = 1;
            }

        }




    }


    public static void FunçaoAuxiliar(int matriz[][],int copiaMatriz[][], int linha, int coluna)
    {
        for(int i = 0; i < linha; i++)
        {
            for(int j = 0; j < coluna; j++)
            {
                if(matriz[i][j] == 1)
                {

                    verificarAdjacencia(copiaMatriz, matriz, i, j, linha, coluna);
                }

            }
        }


    }


}
