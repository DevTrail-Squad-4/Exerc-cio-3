import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Questao58_CalendarioIterar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data = null;
        int quantidadeDias = 0;

        // Leitura e validação da data
        while (data == null) {
            System.out.println("Digite a data (dd/MM/yyyy):");
            String dataStr = scanner.nextLine();
            try {
                data = LocalDate.parse(dataStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        // Leitura e validação da quantidade de dias
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite a quantidade de dias a adicionar:");
            String quantidadeDiasStr = scanner.nextLine();
            try {
                quantidadeDias = Integer.parseInt(quantidadeDiasStr);
                if (quantidadeDias >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("A quantidade de dias deve ser um número inteiro não negativo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }

        // Adição dos dias à data
        LocalDate novaData = data.plusDays(quantidadeDias);

        // Exibição da nova data
        System.out.println("Data original: " + data.format(formatter));
        System.out.println("Nova data: " + novaData.format(formatter));

        scanner.close();
    }
}
