import java.util.Scanner;


public class Questao02_QuantidadeDeSalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o valor do salário mínimo atual: ");
        float salarioMinimo = scanner.nextFloat();

        float qtdSalarioMinimo = salario/salarioMinimo;

        System.out.println("A quantidade de salário mínimo que voce recebe é "+ qtdSalarioMinimo + " salários");


        System.out.println("Programa encerrado");
        scanner.close();
    }
}
