import java.util.Arrays;
import java.util.Scanner; 

public class Questao20NomePessoaMaisVelha{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String pessoas[] = new String[2];
        int idade[] = new int[2];

        System.out.println("Insira o nome da primeira pessoa: ");
        pessoas[0] = scanner.nextLine();

        System.out.println("Insira da idade dessa pessoa: ");
        idade[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o nome da outra pessoa: ");
        pessoas[1] = scanner.nextLine();

        System.out.println("Insira da idade dessa pessoa: ");
        idade[1] = scanner.nextInt();

        if (idade[0] > idade[1]){

            System.out.printf("A pessoa mais velha é %s e a mais nova é %s \n", pessoas[0], pessoas[1]);

        }else if(idade[0]<idade[1]){

            System.out.printf("A pessoa mais velha é %s e a mais nova é %s \n", pessoas[1], pessoas[0]);

        }else{
            System.out.println("A duas pessoas tem a mesma idade");
        }

        scanner.close();


    }




}