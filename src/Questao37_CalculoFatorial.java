import java.util.Scanner;

public class Questao37_CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é: %d\n", numero, fatorial);

        scanner.close();
    }
}

