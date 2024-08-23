import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questao23_MaisVelho {
    Scanner scan = new Scanner(System.in);

    public class MaisVelho{
        private String nome;
        private String nomeDois;
        private int data;
        private int dataDois;
        private String mes;
        private String mesDois;
        private ArrayList <String> ano = new ArrayList<>();

        public MaisVelho(){
            Collections.addAll(ano,"Janeiro", "Fevereiro","Marco", "Abril", "Maio", "Junho","Julho","Agosto","Setembro","Outubro", "Novembro", "Dezembro");
            System.out.println("Esse programa verifica duas datas de aniversário, e informa quem faz aniversário primeiro");

            System.out.println("informe o nome do primeiro aniversariante");
            nome = scan.nextLine();
            System.out.println("informe a data do primeiro aniversariante");
            data = scan.nextInt();
            System.out.println("informe o mes do primeiro aniversariante");
            System.out.println("digite o mes usando seu o nome. Ex: ");
            System.out.println("Janeiro, Fevereiro, Marco, Abril, Maio, Junho, Julho, Agosto, Setembro, Outubro, Novembro, Dezembro");
            scan.nextLine();
            mes = scan.nextLine();


            System.out.println("informe o nome do segundo aniversariante");
            nomeDois = scan.nextLine();
            System.out.println("informe a data do segundo aniversariante");
            dataDois = scan.nextInt();
            System.out.println("informe o mes do segundo aniversariante");
            scan.nextLine();
            mesDois = scan.nextLine();
            int indice = 0;
            int indiceDois = 0;
            for(String i : ano){
                if(i.equalsIgnoreCase(mes)){
                    indice = ano.indexOf(i);
                    System.out.println(indice);
                    System.out.println(i);
                }

            }
            for(String i : ano){
                if(i.equalsIgnoreCase(mesDois)){
                indiceDois = ano.indexOf(i);
                System.out.println(indiceDois);
                System.out.println(i);
                }

            }
            if(indice < indiceDois){
                System.out.println("O " + nome + " faz aniversario primeiro");

            }else if(indice == indiceDois){
                if(data < dataDois){
                    System.out.println(nome + " faz aniversario primeiro");

                }else if(data == dataDois){
                    System.out.println(nome + " faz aniversario no mesmo dia que " + nomeDois);
                }
                else{
                    System.out.println( nomeDois + " faz aniversario primeiro");
                }


            }else{
                System.out.println( nomeDois + " faz aniversario primeiro");

            }



        }
    }   

    public static void main(String[] args){ 
        Questao23_MaisVelho app = new Questao23_MaisVelho();
        app.new MaisVelho();

    }


}
