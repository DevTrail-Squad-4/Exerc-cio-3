import java.util.Scanner;

public class Questao19RetornaEmOrdem {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextDouble();

        if (numero1 < numero2){ 
            System.out.printf( "%.2f, %.2f", numero1, numero2);
        }else if(numero1 > numero2){ 
            System.out.printf( "%.2f, %.2f", numero2, numero1);        
        }else{
            System.out.println("Os números são iguais.");
        }
    }
    
}
