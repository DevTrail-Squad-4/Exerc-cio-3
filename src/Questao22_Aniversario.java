import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Questao22_Aniversario {
    public class Aniversario{
        Scanner scan = new Scanner(System.in);

 

        private String niverUm;
        private String niverDois;

        public Aniversario(){

            

            System.out.println("Este programa compara duas datas de aniversario");
            System.out.println("Insira no formato DATA/MES/ANO");
            System.out.println("Digite a primeira data de aniversario");

            niverUm = scan.nextLine();
            System.out.println("Digite a segunda data de aniversario");

            niverDois = scan.nextLine();
            if(niverUm.equals(niverDois)){
                System.out.println("As datas de aniversario sao iguais");
            }else{
                System.out.println("As datas sao diferentes");
            }
            

            scan.close();
        }


    }
    
    public static void main(String[] args) throws Exception {

        Questao22 app = new Questao22();
        app.new Aniversario();
    }
}
