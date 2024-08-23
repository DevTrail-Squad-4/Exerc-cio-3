import java.util.Scanner;

public class Questao07_ComissaoGarcom {

    private double valorDespesa;

    public Questao07_ComissaoGarcom(double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public double calcularComissao() {
        return valorDespesa * 0.10;
    }

    public void exibirComissao() {
        double comissao = calcularComissao();
        System.out.printf("A comissão do garçom é: R$ %.2f%n", comissao);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da despesa: R$ ");
        double valorDespesa = scanner.nextDouble();

        Questao07_ComissaoGarcom comissaoGarcom = new Questao07_ComissaoGarcom(valorDespesa);
        comissaoGarcom.exibirComissao();

        scanner.close();
    }
}
