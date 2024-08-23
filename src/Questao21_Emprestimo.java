import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Questao21_Emprestimo {


    public class Emprestimo{
        Scanner scan= new Scanner(System.in);
        //cargo
        //salario
        //exibe o valor - validador de cargo
        //validar cargo comparar o valor digitado com os cargos 
        
        private final String[] CARGOS = {"diretoria", "gerencia", "operacional"};

        private final String DIRETORIA = "diretoria";
        private final String GERENCIA = "gerencia";
        private final String OPERACIONAL = "operacional";

        private final int DRVALOR = 30;
        private final int GRVALOR = 25;
        private final int ORVALOR = 20;


        
        public void Emprestimo(){
            String cargo;
            double salario;
            System.out.println("Insira seu cargo, para verificar o valor de emprestimo disponivel");
            System.out.println("As palavras aceitas nesse programa são diretoria. gerencia e operacional");
            System.out.println("insira a palavra correspondente ao seu setor");

            cargo = scan.nextLine();
            System.out.println("Insira seu salario, pode conter , Ex: 125,75 * use virgual e nao ponto");

            salario = scan.nextDouble();
            double calculo;
            int resultadoArredondado;
            switch(cargo){
                case DIRETORIA:
                    calculo = (DRVALOR * salario) / 100;
                    resultadoArredondado = (int) calculo;
                    System.out.println(resultadoArredondado);
                    break;
                case GERENCIA:
                    calculo = (GRVALOR * salario) / 100;
                    resultadoArredondado = (int) calculo;
                    System.out.println(resultadoArredondado);
                    break;
                case OPERACIONAL:
                    calculo = (ORVALOR * salario) / 100;
                    resultadoArredondado = (int) calculo;
                    System.out.println(resultadoArredondado);
                    break;
                default:
                    System.out.println("Esse cargo não é valido");

            }


           /* for(int i = 0; i < CARGOS.length() ;i++){
                
     
                System.out.println("seu cargo é " + CARGOS[cont]);
                System.out.println(cont);
                if(cargo == CARGOS[cont]){
                    System.out.println("seu cargo é " + CARGOS[cont]);
                    break;
                }
  
            }*/



        }

    }

    public static void main(String[] args) throws Exception {
        Questao21 app = new Questao21();
        app.new Emprestimo().Emprestimo();
    }
}
