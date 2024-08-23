import java.util.Scanner;

public class Questao61_LinhasAsteriscos {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String base = "*", padrao= "*";
        int quantidade;

        System.out.print("Digite a quantidade de linhas que você deseja que o programa te retorne: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();
        
        if(quantidade < 0){

            System.out.println("Valor Inválido");

        }else if(quantidade == 0) {
            System.out.println(" ");
        }else if(quantidade == 1){
            System.out.println(padrao);
        }else{
            for(int i = 0; i<quantidade; i++){

                System.out.println(padrao);
                padrao += base;

            } 
        }
    }
    
}
