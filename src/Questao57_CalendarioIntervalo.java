import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Questao57_CalendarioIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataInicio = null;
        LocalDate dataFim = null;

        while (dataInicio == null) {
            System.out.println("Digite a data inicial (dd/MM/yyyy):");
            String dataInicioStr = scanner.nextLine();
            try {
                dataInicio = LocalDate.parse(dataInicioStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        while (dataFim == null) {
            System.out.println("Digite a data final (dd/MM/yyyy):");
            String dataFimStr = scanner.nextLine();
            try {
                dataFim = LocalDate.parse(dataFimStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        if (dataFim.isBefore(dataInicio)) {
            System.out.println("A data final deve ser posterior à data inicial.");
        } else {
            LocalDate dataAtual = dataInicio;
            System.out.println("\nDatas entre " + dataInicio.format(formatter) + " e " + dataFim.format(formatter) + ":");
            while (!dataAtual.isAfter(dataFim)) {
                System.out.println(dataAtual.format(formatter));
                dataAtual = dataAtual.plusDays(1);
            }
        }

        scanner.close();
    }
}
