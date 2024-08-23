import java.util.Scanner;
public class Questao53_Tabuada {
        public class Tabuada{
            private int numero;
            private int resultado;

            public Tabuada(){
                
                Scanner scan = new Scanner(System.in);
                System.out.println("Esse programa exibe a tabuada do numero informado, insira um numero");
                
                numero  = scan.nextInt();
                for(int cont = 1; cont <= 10; cont++){
                    resultado = numero * cont;
                    System.out.println(numero + " x " + cont + " = " + resultado);

                }
            }
        }
    public static void main(String[] args) throws Exception {
        Questao53_Tabuada app = new Questao53_Tabuada();
        app.new Tabuada();

    }
}
