import java.util.Scanner;

public class Questao55_ControlePlanoVaiVai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorMensal = 50.00;
        int minutosIncluidos = 100;
        int minutosVaiVai = 50;
        double custoExcedenteOutrasOperadoras = 0.65;
        double custoExcedenteVaiVai = 0.20;
        double custoTelefoneFixo = 0.325;
        double saldo = valorMensal;
        int minutosRestantes = minutosIncluidos + minutosVaiVai;

        while (true) {
            System.out.println("Digite o tipo de ligação ('o' para outras operadoras, 'v' para a própria Vai-Vai, 'f' para telefone fixo): ");
            char tipoLigacao = scanner.next().charAt(0);

            if (tipoLigacao == 's') {
                break;
            }

            System.out.println("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();

            double valorAPagar = 0.0;

            switch (tipoLigacao) {
                case 'o':
                    if (minutos > minutosRestantes) {
                        valorAPagar = (minutos - minutosRestantes) * custoExcedenteOutrasOperadoras;
                        minutosRestantes = 0;
                    } else {
                        minutosRestantes -= minutos;
                    }
                    break;
                case 'v':
                    if (minutos > minutosRestantes) {
                        valorAPagar = (minutos - minutosRestantes) * custoExcedenteVaiVai;
                        minutosRestantes = 0;
                    } else {
                        minutosRestantes -= minutos;
                    }
                    break;
                case 'f':
                    if (minutos > minutosRestantes) {
                        valorAPagar = ((minutos - minutosRestantes) * custoTelefoneFixo) / 2;
                        minutosRestantes = 0;
                    } else {
                        minutosRestantes -= minutos;
                    }
                    break;
                default:
                    System.out.println("Tipo de ligação inválido.");
                    continue;
            }

            saldo -= valorAPagar;
            System.out.printf("Valor a pagar: %.2f\n", valorAPagar);
            System.out.printf("Saldo restante: %.2f\n", saldo);
            System.out.println("Digite 's' para sair ou qualquer outra tecla para continuar.");
        }

        scanner.close();
    }
}
