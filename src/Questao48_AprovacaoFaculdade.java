import java.util.Scanner;
public class Questao48_AprovacaoFaculdade {

    public static double presencaFinal(int presenca){
        double perCentagemFinal = 0.0;
        perCentagemFinal = Math.round(((double)presenca / 40) *100);
        return perCentagemFinal;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, notaFinal;
        int presenca;

        System.out.println("Digite a primeira nota das suas avaliações: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota das suas avaliações: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota das suas avaliações: ");
        nota3 = scanner.nextDouble();

        System.err.println("Insira quantas aulas das 40 você esteve presente: ");
        presenca = scanner.nextInt();

        notaFinal = (nota1 + nota2 + nota3)/3;
        

        if(notaFinal >=5 && presencaFinal(presenca) >= 70){

            System.out.println("Parabéns! Você foi aprovado.");

        }else if (notaFinal <5 && presencaFinal(presenca) >= 70){       

            System.out.println("Você foi reprovado por não atingir a media necessária de 5 pontos");

        }else if(notaFinal >=5 && presencaFinal(presenca) < 70){

            System.out.println("Você foi reprovado por falta de frequência");
        }else{
            System.out.println("Você foi reprovado por não atingir a media e por não atingir a frequência necessária");
        }

        scanner.close();

    }
    
}
