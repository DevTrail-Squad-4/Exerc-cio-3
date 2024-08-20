import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao36_NumerosImparesNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = 0;
        int fim = 0;

        while (true) {
            try {
                System.out.print("Digite o início do intervalo: ");
                inicio = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o fim do intervalo: ");
                fim = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        System.out.println("Números ímpares no intervalo:");

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
