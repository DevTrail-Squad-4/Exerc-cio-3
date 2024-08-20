import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao10_VerificaEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBruto = 0;
        double descontos = 0;
        double valorEmprestimo = 0;

        while (true) {
            try {
                System.out.print("Digite o valor do salário bruto: ");
                salarioBruto = scanner.nextDouble();
                if (salarioBruto < 0) {
                    System.out.println("Erro: O salário bruto não pode ser negativo. Tente novamente.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número válido para o salário bruto.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o valor dos descontos: ");
                descontos = scanner.nextDouble();
                if (descontos < 0) {
                    System.out.println("Erro: Os descontos não podem ser negativos. Tente novamente.");
                } else if (descontos > salarioBruto) {
                    System.out.println("Erro: Os descontos não podem ser maiores que o salário bruto. Tente novamente.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número válido para os descontos.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o valor do possível empréstimo: ");
                valorEmprestimo = scanner.nextDouble();
                if (valorEmprestimo < 0) {
                    System.out.println("Erro: O valor do empréstimo não pode ser negativo. Tente novamente.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número válido para o valor do empréstimo.");
                scanner.next();
            }
        }

        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = 0.30 * salarioLiquido;

        if (valorEmprestimo <= valorMaximoEmprestimo) {
            System.out.println("O empréstimo pode ser concedido.");
        } else {
            System.out.println("O empréstimo não pode ser concedido. O valor solicitado excede o limite de 30% do seu salário líquido.");
        }

        scanner.close();
    }
}
