package exercicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exer3_18 {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scan = new Scanner(new File("src/entrada.txt") );

        int linha = scan.nextInt();
        int coluna = scan.nextInt();

        int[][] matriz = new int[linha][coluna];
        int [][] matrizCopia  = new int[linha][coluna];
        int [][] mask = new int[linha][coluna];

        //ler matriz
        ler(matriz,linha,coluna,scan);
        imprimir(matriz,linha,coluna);
        System.out.println();

        //ler mascara
        linha = scan.nextInt();
        coluna = scan.nextInt();
        ler(mask,linha,coluna,scan);
        System.out.println("Mascara");
        imprimir(mask,linha,coluna);
        System.out.println();


        //fazer copia da matriz
        for(int i =0; i < linha ; i++)
        {
            for (int j =0; j <  coluna ; j++)
                matrizCopia[i][j] = matriz[i][j];
        }

      int t = area(matrizCopia,mask,linha,coluna,2 -1,3 -1,0);

        System.out.printf("Total: %d\n", t);




    }

    public static void ler(int[][] matriz, int linha, int coluna, Scanner scan) {
        for (int i = 0; i < linha ; i++) {
            for (int j = 0; j < coluna ; j++) {
                matriz[i ][j ] = scan.nextInt();
            }
        }
    }

    public static void imprimir(int[][] matriz, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }



    public static int area(int matrizCopia[][] , int mask[][] , int linha, int coluna, int x, int y, int tot)
    {

//        //matrizCopia[x- 1][y - 1]
//        System.out.printf("(%d) ", matrizCopia[x- 1][y - 1] );
//
//
//        //matrizCopia[x- 1][y] = 0;
//        System.out.printf("(%d) ", matrizCopia[x- 1][y] );
//
//        //matrizCopia[x- 1][y + 1] = 0;
//        System.out.printf("(%d)\n", matrizCopia[x- 1][y + 1] );
//
//        //matrizCopia[x][y - 1] = 0;
//        System.out.printf("(%d) ",matrizCopia[x][y - 1]);
//
//        //matriz[x][y] = 0;
//        System.out.printf("(%d) ", matrizCopia[x][y] );
//
//        //matrizCopia[x][y + 1] = 0;
//        System.out.printf("(%d)\n",matrizCopia[x][y + 1] );
//
//        //matrizCopia[x + 1][y - 1] = 0;
//        System.out.printf("(%d) ", matrizCopia[x + 1][y - 1] );
//
//
//        //matrizCopia[x + 1][y] = 0;
//        System.out.printf("(%d) ", matrizCopia[x + 1][y]);
//
//        //matrizCopia[x + 1][y + 1] = 0;
//        System.out.printf("(%d)\n", matrizCopia[x + 1][y + 1] );


        System.out.println("Area afetada");
        for(int i = x  ; i <= x + 2; i++)
        {
            for(int j = y  ; j <=  y + 2; j++)
            {
                System.out.printf("(%d,%d)", i, j);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0; j < 3 ; j++)
            {
                System.out.printf("(%d)",  matrizCopia[x-1+i][y-1+j]);
                //System.out.printf("%d ", mask[i][j]);
                tot +=  matrizCopia[x-1+i][y-1+j]  * mask[i][j];
            }
            System.out.println();
        }

        return tot;
    }


}
