import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09_VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Digite a sua idade: ");
                int idade = scanner.nextInt();
                if(idade >= 18){
                    System.out.println("Voce é maior de idade");
                }else{
                    System.out.println("Voce não é maior de idade");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        System.out.println("Programa encerrado");
        scanner.close();
    }
}
