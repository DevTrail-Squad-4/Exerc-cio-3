import java.util.Scanner;

public class Questao13_SituacaoAlunoComProvaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        
        double media = (nota1 + nota2 + nota3) / 3;

        
        System.out.printf("A média do aluno é: %.2f\n", media);

        
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media <= 5.0) {
            System.out.println("Situação: Recuperação");

            
            System.out.print("O aluno fez a prova final? (s/n): ");
            char fezProvaFinal = scanner.next().charAt(0);

            if (fezProvaFinal == 's' || fezProvaFinal == 'S') {
                
                System.out.print("Digite a nota da prova final: ");
                double notaProvaFinal = scanner.nextDouble();

                
                media = (media + notaProvaFinal) / 2;

                
                System.out.printf("A nova média do aluno é: %.2f\n", media);

                
                if (media >= 5.0) {
                    System.out.println("Situação: Aprovado após prova final");
                } else {
                    System.out.println("Situação: Reprovado após prova final");
                }
            } else {
                System.out.println("Situação: Reprovado");
            }
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}

    
