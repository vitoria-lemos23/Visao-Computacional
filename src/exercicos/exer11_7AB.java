package exercicos;

public class exer11_7AB {
    public static double calcularTortuosidadeQuadrado(double l) {
        // O per�metro de um quadrado � 4 * lado.
        double perimetro = 4 * l;

        // O di�metro de um quadrado � sua diagonal, calculada por Pit�goras: sqrt(d^2 + d^2).
        double diametro = Math.sqrt(l*l + l*l);

        // Tortuosidade � a raz�o entre o per�metro e o di�metro.
        return perimetro / diametro;
    }

    public static double calcularTortuosidadeCirculo(double r) {
        // O per�metro de um c�rculo (circunfer�ncia) � 2 * PI * raio.
        double perimetro = 2 * Math.PI * r;

        // O di�metro de um c�rculo � 2 * raio.
        double diametro = 2 * r;

        // Tortuosidade � a raz�o entre o per�metro e o di�metro.
        return perimetro / diametro;
    }
    public static void main(String[] args) {

        // letra A
        double ladoQuadrado = 10.0;
        double tortuosidadeQuadrado = calcularTortuosidadeQuadrado(ladoQuadrado);
        System.out.println("--- Quadrado ---");
        System.out.printf("Para um quadrado de lado %.2f:\n", ladoQuadrado);
        System.out.printf("A tortuosidade calculada �: %.5f\n", tortuosidadeQuadrado);


        // Letra B
        double raioCirculo = 5.0;
        double tortuosidadeCirculo = calcularTortuosidadeCirculo(raioCirculo);
        System.out.println("--- C�rculo ---");
        System.out.printf("Para um c�rculo de raio %.2f:\n", raioCirculo);
        System.out.printf("A tortuosidade calculada �: %.5f\n", tortuosidadeCirculo);
    }
}
