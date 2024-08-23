import java.util.Scanner;
import java.util.Arrays;

public class Questao18AniversarioCompletoMAisIdade {

    public static String saberSigno(int mesNascimento, int diaNascimento){

        switch (mesNascimento) {
            case 1:
                return (diaNascimento >= 20) ? "Aquário" : "Capricórnio";
            case 2:
                return (diaNascimento >= 19) ? "Peixes" : "Aquário";
            case 3:
                return (diaNascimento >= 21) ? "Áries" : "Peixes";
            case 4:
                return (diaNascimento >= 20) ? "Touro" : "Áries";
            case 5:
                return (diaNascimento >= 21) ? "Gêmeos" : "Touro";
            case 6:
                return (diaNascimento >= 21) ? "Câncer" : "Gêmeos";
            case 7:
                return (diaNascimento >= 23) ? "Leão" : "Câncer";
            case 8:
                return (diaNascimento >= 23) ? "Virgem" : "Leão";
            case 9:
                return (diaNascimento >= 23) ? "Libra" : "Virgem";
            case 10:
                return (diaNascimento >= 23) ? "Escorpião" : "Libra";
            case 11:
                return (diaNascimento >= 22) ? "Sagitário" : "Escorpião";
            case 12:
                return (diaNascimento >= 22) ? "Capricórnio" : "Sagitário";
            default:
                return "Data inválida";
        }

    }

    public static int saberIDade( int diaNascimento, int mesNascimento, int anoNascimento, int diaAtual, int mesAtual, int anoAtual){
        int diferencaAnos = anoAtual-anoNascimento;

        if(mesAtual > mesNascimento){
            return diferencaAnos;
        }else if(mesAtual < mesNascimento){
            return diferencaAnos-1;

        }else if(mesAtual == mesNascimento && diaAtual >= mesNascimento){
            return diferencaAnos;

        }else{
            return diferencaAnos - 1;
        }

    }
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual, idade;
    String entrada, entrada2;
    String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    


    System.out.println("Insira o dia e mes que você nasceu (DD/MM/AAAA)");
    entrada = scanner.nextLine();
    System.out.println("Insira a data de hoje (DD/MM/AAAA)");
    entrada2 = scanner.nextLine();
    String[] dataNascimento = entrada.split("/");
    String[] dataAtual = entrada2.split("/");
    diaNascimento = Integer.parseInt(dataNascimento[0]);
    mesNascimento = Integer.parseInt(dataNascimento[1]);
    anoNascimento = Integer.parseInt(dataNascimento[2]);

    diaAtual = Integer.parseInt(dataAtual[0]);
    mesAtual = Integer.parseInt(dataAtual[1]);
    anoAtual = Integer.parseInt(dataAtual[2]);

    
    
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
            idade = saberIDade(diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual);
            System.out.println("Você é do signo de " + saberSigno(mesNascimento, diaNascimento));
            System.out.println("Sua idade é: " + idade + " anos");



        }

        scanner.close();

        }
    }