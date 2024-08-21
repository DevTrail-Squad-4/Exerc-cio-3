import java.util.Scanner;

public class Questao39_NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número para verificar se é perfeito: ");
        int numero = scanner.nextInt();

        
        int somaDivisores = 0;

        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.printf("O número %d é um número perfeito.\n", numero);
        } else {
            System.out.printf("O número %d não é um número perfeito.\n", numero);
        }

        scanner.close();
    }
}
