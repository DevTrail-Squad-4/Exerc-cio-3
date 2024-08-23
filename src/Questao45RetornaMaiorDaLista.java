import java.util.Scanner;
import java.util.ArrayList;


public class Questao45RetornaMaiorDaLista {

    public static boolean eIgual(ArrayList<Double> lista){
        double verificador = lista.get(0);
        for (int i = 1; i < lista.size(); i++){
            if (verificador != lista.get(i) ){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> lista100 = new ArrayList<Double>();
        double maior = 0;

        for (int i = 0; i < 100; i++){
            System.out.println("Insira um número inteiro para a lista: ");
            lista100.add(scanner.nextDouble());

        }

        if(eIgual(lista100)){
            System.out.println("Todos os números da lista são iguais!");
            return;
         } else {
            for(int i = 0; i < 100; i++){
                if (lista100.get(i) > maior){
                    maior = lista100.get(i);
                }
            }
    
            System.out.println("O maior número da lista é: " + maior);
        }

        

        
        scanner.close();

    }
    
}
