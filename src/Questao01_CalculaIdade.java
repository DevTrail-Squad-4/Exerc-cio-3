import java.util.Scanner;

public class Questao01_CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você fará " + idade + " anos em " + anoAtual + ".");

        scanner.close();
    }
}
