
import java.util.Scanner;
import java.util.Arrays;


public class Questao15_ValidaAniversario {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int diaNascimento, mesNascimento;
    String entrada;
    String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    


    System.out.println("Insira o dia e mes que você nasceu (DD/MM)");
    entrada = scanner.nextLine();
    String[] dataNascimento = entrada.split("/");
    diaNascimento = Integer.parseInt(dataNascimento[0]);
    mesNascimento = Integer.parseInt(dataNascimento[1]);
    
        if(diaNascimento > 31 || diaNascimento < 1){ 
            System.out.println("Data Inválida!");
        }else if(mesNascimento > 12 || mesNascimento<1){
            System.out.println("Data Inválida!");
        }else if ((mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9 || mesNascimento == 11) && diaNascimento > 30) {
            System.out.println("Data Inválida!");
        }else if(mesNascimento == 2 && diaNascimento > 28){
            System.out.println("Data Inválida!");
        }else{
            System.out.println("Sua data de aniversário está ok, você nasceu no mes "+ mes[mesNascimento-1]);
        }
}
    
}
