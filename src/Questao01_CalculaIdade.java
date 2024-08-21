import java.util.Scanner;

public class Questao01_CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoNascimento;
        int anoAtual;

        while (true) {
            System.out.print("Digite seu ano de nascimento: ");
            anoNascimento = scanner.nextInt();

            System.out.print("Digite o ano atual: ");
            anoAtual = scanner.nextInt();

            if (anoNascimento > anoAtual) {
                System.out.println("Erro: O ano de nascimento não pode ser maior que o ano atual. Tente novamente.");
            } else {
                break;
            }
        }

        int idade = anoAtual - anoNascimento;

        System.out.println("Você fará " + idade + " anos em " + anoAtual + ".");

        scanner.close();
    }
}
