
import java.util.Scanner;


public class Questao43_MediaAritmetica500 {

    

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double numeros = 500, soma = 0,entrada = 0, media = 0;

        for(int i = 0; i < 500; i++){

            System.out.println("Insira um numero até chegar a 500 números para saber a media aritmetica: ");
            entrada = scanner.nextDouble();
            soma += entrada;
            

        
        
        }

        media = soma/numeros;

        System.out.println("A media aritmetica dos numeros inseridos é: " + media);
        scanner.close();



    }
}
