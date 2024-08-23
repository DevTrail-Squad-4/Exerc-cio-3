import java.util.Scanner;

public class Questao25_ValidaHora {


    public class ValidaHora{
        Scanner scan = new Scanner(System.in);
        private int horas;
        private int minutos;
        private int segundos;

        public ValidaHora(){
            System.out.println("Esse programa valida se o horario informado é correto");
            System.out.println("informe a hora");

            horas = scan.nextInt();
            System.out.println("informe os minutos");
            minutos = scan.nextInt();
            System.out.println("informe os segundos");
            segundos = scan.nextInt();
            int cont = 0;
            while(cont < 1){
                if(horas < 0 || minutos < 0 || segundos < 0){
                    System.out.println("Hora incorreta");
                    break;
                }
                if(horas <= 23){ 
                    if(minutos <= 59){
                        if(segundos <=59){
                            System.out.println("Hora correta");
                        }else{
                            System.out.println("Hora incorreta");
                        }
                    }else{
                        System.out.println("Hora incorreta");
                    }
                }else{
                    System.out.println("Hora incorreta");
                }
                cont++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Questao25_ValidaHora app = new Questao25_ValidaHora();
        app.new ValidaHora();

    }
}
