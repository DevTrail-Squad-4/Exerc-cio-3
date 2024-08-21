import java.util.Scanner;
import java.util.ArrayList;


public class Questao45RetornaMaiorDaLista {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> lista100 = new ArrayList<Double>();
        double maior = 0;

        for (int i = 0; i < 100; i++){
            System.out.println("Insira um número inteiro para a lista: ");
            lista100.add(scanner.nextDouble());

        }

        for(int i = 0; i < 100; i++){
            if (lista100.get(i) > maior){
                maior = lista100.get(i);
            }
        }

        System.out.println("O maior número da lista é: " + maior);
        scanner.close();

    }
    
}
