import java.util.Scanner;

public class Questao64_ImprimirTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de triângulos:");
        int quantidadeTriangulos = scanner.nextInt();

        for (int i = 1; i <= quantidadeTriangulos; i++) {
            for (int t = 1; t <= i; t++) {
                for (int j = 1; j <= t; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
