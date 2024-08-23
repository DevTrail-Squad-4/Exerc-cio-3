import java.util.Random;
import java.util.Scanner;

public class Questao41_JogoNumeroSorteado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            
            System.out.print("Digite o seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            
            if (tentativa < numeroSorteado) {
                System.out.println("O número é maior que " + tentativa + ".");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor que " + tentativa + ".");
            } else {
                
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + "!");
                System.out.println("Você conseguiu em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroSorteado);

        scanner.close();
    }
}
