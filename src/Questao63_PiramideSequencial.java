import java.util.Scanner;

public class Questao63_PiramideSequencial {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String padrao= " 0", sequencia = "", espaco = " ";

        int quantidade, base = 1;

        System.out.print("Digite a quantidade de linhas que você deseja que o programa te retorne: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();

        if(quantidade < 0){

            System.out.println("Valor Inválido");

        }else if(quantidade == 0) {
            System.out.println(" ");
        }else if(quantidade == 1){
            System.out.println(padrao+base);
        }else{
            for(int i = 1; i<=quantidade; i++){
                    if(i < 10){
                        String novopadrao = padrao+i;
                        sequencia += novopadrao;


                    }else{
                        sequencia += espaco + i;

                    }

                    System.out.println(sequencia);
            }



        } 
    }
}