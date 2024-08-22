import java.util.Scanner;

public class Questao03_PercentualHomensMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de homens na turma: ");
        int qtdHomens = scanner.nextInt();

        System.out.print("Digite a quantidade de mulheres na turma: ");
        int qtdMulheres = scanner.nextInt();

        
        int totalAlunos = qtdHomens + qtdMulheres;

        
        double percentualHomens = ((double) qtdHomens / totalAlunos) * 100;
        double percentualMulheres = ((double) qtdMulheres / totalAlunos) * 100;

        
        System.out.printf("Percentual de homens: %.2f%%\n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f%%\n", percentualMulheres);

        scanner.close();
    }
}
