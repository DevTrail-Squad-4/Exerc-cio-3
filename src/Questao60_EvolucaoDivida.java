import java.util.Scanner;

public class Questao60_EvolucaoDivida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida (em R$): ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (em %): "); //A taxa de correção é convertida de percentual para decimal!!!
        double taxaCorrecao = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        double taxaDecimal = taxaCorrecao / 100;

        
        System.out.println("\nTabela de Evolução da Dívida:");
        System.out.println("Ano   Jan   Fev   Mar   Abr   Mai   Jun   Jul   Ago   Set   Out   Nov   Dez");

    
        double valorAtual = valorDivida;

        
        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.printf("%d ", ano);

            
            for (int mes = 0; mes < 12; mes++) {
                
                System.out.printf("%6.2f ", valorAtual);

                
                valorAtual += valorAtual * taxaDecimal;
            }
            System.out.println();
        }

        scanner.close();
    }
}

