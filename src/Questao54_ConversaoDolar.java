import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Questao54_ConversaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("Digite o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Digite o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.println("Digite o valor do incremento em reais: ");
        double incremento = scanner.nextDouble();

        System.out.println("Digite o valor de 1 dólar em reais: ");
        double valorDoDolar = scanner.nextDouble();

        System.out.println();
        System.out.println("Tabela de Conversão de Reais para Dólares:");
        System.out.println("Reais\tDólares");

        for (double reais = valorInicial; reais <= valorFinal; reais += incremento) {
            double dolares = reais / valorDoDolar;
            System.out.printf("%s\t%s%n", formatoMoeda.format(reais), formatoMoeda.format(dolares));
        }

        scanner.close();
    }
}
