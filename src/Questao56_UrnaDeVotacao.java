import java.util.Scanner;

public class Questao56_UrnaDeVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro candidato: ");
        String candidato1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo candidato: ");
        String candidato2 = scanner.nextLine();

        System.out.println("Digite o nome do terceiro candidato: ");
        String candidato3 = scanner.nextLine();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.println("Digite o voto (1 para " + candidato1 + ", 2 para " + candidato2 + ", 3 para " + candidato3 + ", 0 para voto em branco ou -1 para encerrar): ");
            int voto = scanner.nextInt();

            if (voto == -1) {
                break;
            }

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 0:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    continue;
            }

            totalVotos++;
        }

        double percentualCandidato1 = (votosCandidato1 * 100.0) / totalVotos;
        double percentualCandidato2 = (votosCandidato2 * 100.0) / totalVotos;
        double percentualCandidato3 = (votosCandidato3 * 100.0) / totalVotos;
        double percentualBranco = (votosEmBranco * 100.0) / totalVotos;

        System.out.println("\nResultados da eleição:");
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato1, votosCandidato1, percentualCandidato1);
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato2, votosCandidato2, percentualCandidato2);
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato3, votosCandidato3, percentualCandidato3);
        System.out.printf("Votos em branco: %d votos (%.2f%%)\n", votosEmBranco, percentualBranco);

        int maxVotos = Math.max(Math.max(votosCandidato1, votosCandidato2), votosCandidato3);
        String ganhador = "";
        if (votosCandidato1 == maxVotos) {
            ganhador = candidato1;
        } else if (votosCandidato2 == maxVotos) {
            ganhador = candidato2;
        } else if (votosCandidato3 == maxVotos) {
            ganhador = candidato3;
        }

        System.out.println("Ganhador da eleição: " + ganhador);

        scanner.close();
    }
}
