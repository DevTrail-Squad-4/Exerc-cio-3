import java.util.Scanner;

public class Questao38_NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.printf("O número %d é primo.\n", numero);
        } else {
            System.out.printf("O número %d não é primo.\n", numero);
        }

        scanner.close();
    }
}

