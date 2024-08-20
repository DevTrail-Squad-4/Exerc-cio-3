import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao11_StatusVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1;

        while (true) {
            try {
                System.out.print("Digite a idade: ");
                idade = scanner.nextInt();
                if (idade < 0) {
                    System.out.println("Erro: A idade não pode ser negativa. Tente novamente.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro para a idade.");
                scanner.next();
            }
        }

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 16 && idade <= 17) || idade >= 65) {
            System.out.println("O voto é facultativo.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("O voto é obrigatório.");
        }

        System.out.println("Programa encerrado");
        scanner.close();
    }
}
