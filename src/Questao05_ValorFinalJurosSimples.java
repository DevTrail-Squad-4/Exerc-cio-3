import java.util.Scanner;

public class Questao05_ValorFinalJurosSimples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double divida,juros, taxaJuros, dividaComJuros, valorFinalDivida;
        
        
        System.out.print("Digite o valor da dívida: ");
        divida = scanner.nextDouble();
        
        System.out.print("Digite o valor do juros: ");
        juros = scanner.nextDouble();
        
        System.out.print("Digite o tempo em meses: ");
        int meses = scanner.nextInt();
        
        taxaJuros  = juros / 100;
        
        
        dividaComJuros = divida * taxaJuros * meses;
        valorFinalDivida = dividaComJuros + divida;
         
        
        System.out.printf("O valor final da dívida com juros é: %.2f%n", valorFinalDivida);
    }
}