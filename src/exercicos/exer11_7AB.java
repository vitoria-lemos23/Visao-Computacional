package exercicos;

public class exer11_7AB {
    public static double calcularTortuosidadeQuadrado(double l) {
        // O perímetro de um quadrado é 4 * lado.
        double perimetro = 4 * l;

        // O diâmetro de um quadrado é sua diagonal, calculada por Pitágoras: sqrt(d^2 + d^2).
        double diametro = Math.sqrt(l*l + l*l);

        // Tortuosidade é a razão entre o perímetro e o diâmetro.
        return perimetro / diametro;
    }

    public static double calcularTortuosidadeCirculo(double r) {
        // O perímetro de um círculo (circunferência) é 2 * PI * raio.
        double perimetro = 2 * Math.PI * r;

        // O diâmetro de um círculo é 2 * raio.
        double diametro = 2 * r;

        // Tortuosidade é a razão entre o perímetro e o diâmetro.
        return perimetro / diametro;
    }
    public static void main(String[] args) {

        // letra A
        double ladoQuadrado = 10.0;
        double tortuosidadeQuadrado = calcularTortuosidadeQuadrado(ladoQuadrado);
        System.out.println("--- Quadrado ---");
        System.out.printf("Para um quadrado de lado %.2f:\n", ladoQuadrado);
        System.out.printf("A tortuosidade calculada é: %.5f\n", tortuosidadeQuadrado);


        // Letra B
        double raioCirculo = 5.0;
        double tortuosidadeCirculo = calcularTortuosidadeCirculo(raioCirculo);
        System.out.println("--- Círculo ---");
        System.out.printf("Para um círculo de raio %.2f:\n", raioCirculo);
        System.out.printf("A tortuosidade calculada é: %.5f\n", tortuosidadeCirculo);
    }
}
