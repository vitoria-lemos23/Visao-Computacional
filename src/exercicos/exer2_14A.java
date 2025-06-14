package exercicos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class exer2_14A {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int[][] s1 = new int[4][4];
        int[][] s2 = new int[4][4];


        ler(s1);
        ler(s2);


        imprimir(s1);
        System.out.println();
        imprimir(s2);


        int cont = FuncaoAuxAdjacencia(s1,s2,0);

        if(cont > 0)
        {
            System.out.println("S1 e S2 são 4-adjacentes");
        }
        else
        {
            System.out.println("S1 e S2 NÃO são 4-adjacentes");
        }

    }

    int n;
    public static void ler(int matriz[][]) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\Users\\vitor\\IdeaProjects\\Visao-computacional\\src\\entrada.txt"));
        for(int i = 0 ;i < 4; i++)
        {
            for(int j = 0 ; j < 4; j++)
            {
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    public static void imprimir(int matriz[][]) throws FileNotFoundException {

        for(int i = 0 ;i < 4; i++)
        {
            for(int j = 0 ; j < 4; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int verificarAdjacencia(int[][] matriz2, int x, int y)
    {
        int cont = 0;
        if((y - 1) >= 0 && matriz2[x][y - 1] == 1)
        {
            cont++;
        }

        if((y + 1) < 4 && matriz2[x][y + 1] == 1)
        {
            cont++;
        }

        if((x - 1) >= 0 && matriz2[x - 1][y] == 1)
        {
            cont++;
        }

        if((x + 1) < 4 && matriz2[x + 1][y] == 1)
        {
            cont++;
        }


        return cont;
    }
    public static int FuncaoAuxAdjacencia(int matriz1[][], int matriz2[][], int cont)
    {
        int x, y;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(matriz1[i][j] == 1)
                {
                    x = i;
                    y = j;
                    cont += verificarAdjacencia(matriz2, x, y);
                }
            }
        }
        return cont;
    }





}
