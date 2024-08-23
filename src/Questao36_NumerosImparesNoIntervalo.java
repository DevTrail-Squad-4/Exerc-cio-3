import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao36_NumerosImparesNoIntervalo {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int fim = scanner.nextInt();

        scanner.close();

        if (inicio > fim) {
            System.out.println("O número inicial deve ser menor ou igual ao número final.");
            return;
        }

        int primeiroImpar = (inicio % 2 == 0) ? inicio + 1 : inicio;

        for (int i = primeiroImpar; i <= fim; i += 2) {
            System.out.println(i);
        }
    }
}
