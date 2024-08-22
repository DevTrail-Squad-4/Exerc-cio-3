import java.util.Scanner;

public class Questao65_ImprimirPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas:");
        int linhas = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
