import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao08_RacionalParaReal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerador = 0;
        int denominador = 0;

        while (true) {
            try {
                System.out.print("Digite o numerador: ");
                numerador = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o denominador: ");
                denominador = scanner.nextInt();
                if (denominador == 0) {
                    System.out.println("Erro: O denominador não pode ser zero. Por favor, digite um número diferente de zero.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        double resultado = (double) numerador / denominador;
        System.out.println("O número real correspondente é: " + resultado);

        scanner.close();
    }
}
