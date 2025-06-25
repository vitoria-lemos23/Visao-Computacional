package exercicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exer3_18B {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scan = new Scanner(new File("src/entrada.txt") );


        int linha = scan.nextInt();
        int coluna = scan.nextInt();
        int a = (linha - 1 ) / 2;
        int b = (coluna - 1) / 2;
        linha += a;
        coluna+= b;




        int[][] matriz = new int[linha][coluna];
        int [][] matrizCopia  = new int[linha][coluna];


        //preencher de zeros
        for(int i = 0 ; i < linha ; i++)
        {
            for(int j = 0; j < coluna; j++ )
            {
                matrizCopia[i][j] = 0;
            }
        }



        //ler matriz
        ler(matriz,linha - a,coluna - b,scan);
        //imprimir(matriz,linha,coluna);
        System.out.println();

        //ler mascara
        int linhaMask = scan.nextInt();
        int colunaMask = scan.nextInt();
        int [][] mask = new int[linha][coluna];
        ler(mask,linhaMask,colunaMask,scan);

        int [][] maskCopia = new int[linhaMask][linhaMask];

        //inverter matriz de mascara
        System.out.println("Mascara invertida");
        for(int i = 0; i < linhaMask; i++)
        {
            for(int j = 0; j < colunaMask; j++)
            {
                maskCopia[i][j] = mask[linhaMask - i - 1][colunaMask - j - 1];
            }
        }
        //imprimir(maskCopia, linhaMask, colunaMask);
//        System.out.println("Mascara");
      //  imprimir(mask,linhaMask,colunaMask);
//        System.out.println();

        //System.out.println("Matriz Original");
        //imprimir(matriz,linha - a, coluna - b);



        //inserir a matriz Original na matrizCopia com padding de zeros
        for(int i = 1; i < linha - a ; i++)
        {
            for (int j = 1; j <  coluna - b ; j++)
                matrizCopia[i][j] = matriz[i - 1][j - 1];
        }
        System.out.println();
        imprimir(matrizCopia,linha,coluna);
        System.out.println();



        int t = area(matrizCopia,mask,linha,coluna,2 -1,3 -1,0);

        //System.out.printf("Total: %d\n", t);




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
