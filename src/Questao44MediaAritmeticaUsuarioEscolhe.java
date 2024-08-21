
import java.util.Scanner;


public class Questao44MediaAritmeticaUsuarioEscolhe{

    

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double numeros, soma = 0,entrada = 0, media = 0;

        System.out.println("Insira a quantidade de numero que você deseja saber a media aritmética: ");
        numeros = scanner.nextDouble();

        for(int i = 0; i < numeros; i++){

            System.out.println("Insira um numero até chegar a 500 números para saber a media aritmetica: ");
            entrada = scanner.nextDouble();
            soma += entrada;
            

        
        
        }

        media = soma/numeros;

        System.out.println("A media aritmetica dos numeros inseridos é: " + media);
        scanner.close();



    }
}
