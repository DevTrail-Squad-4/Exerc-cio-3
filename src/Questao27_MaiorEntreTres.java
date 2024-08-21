import java.util.Scanner;

public class Questao27_MaiorEntreTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número:");
            String numero = scanner.nextLine();
            try {
                numeros[i] = Integer.parseInt(numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                i--;
            }
        }

        int maior = numeros[0];
        boolean temIgual = false;

        for (int i = 1; i < 3; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                temIgual = false;
            } else if (numeros[i] == maior) {
                temIgual = true;
            }
        }

        if (temIgual) {
            System.out.println("Existem números iguais ao maior valor.");
        } else {
            System.out.println("O maior número é: " + maior);
        }
    }
}
