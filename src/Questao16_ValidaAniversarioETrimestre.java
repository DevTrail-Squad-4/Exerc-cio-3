import java.util.Scanner;
import java.util.Arrays;

public class Questao16_ValidaAniversarioETrimestre {

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
            if(mesNascimento >0 && mesNascimento <4){

                System.out.println("Você nasceu no primeiro trimestre do ano!");
                
            }else if(mesNascimento >3 && mesNascimento <7){

                System.out.println("Você nasceu no segundo trimestre do ano!");
                
            }else if(mesNascimento >6 && mesNascimento <10){

                System.out.println("Você nasceu no terceiro trimestre do ano!");
                
            }else{

                System.out.println("Você nasceu no quarto trimestre do ano!");

            }

        }

        scanner.close();

        }
    }




