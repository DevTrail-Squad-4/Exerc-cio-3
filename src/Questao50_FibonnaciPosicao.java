import java.util.Scanner;

public class Questao50_FibonnaciPosicao {
    public class FibonnaciPosicao{
        Scanner scan = new Scanner(System.in);
        private long n1 = 1;
        private long n2 = 1;

        public FibonnaciPosicao(){
            System.out.println("Esse codigo encontra a posicao n-esima na sequencia fibonnaci ");
            System.out.println("Insira a posicao desejada");
            int posicao = scan.nextInt();
            int cont = 1;

            for( cont = 2; cont <= posicao; cont++){
                long temp = 0 + n1;
                n1 = n2;
                n2= temp+n2;
                if(cont + 1 == posicao){
                    System.out.println(cont + 1 + " - " + n2);
                }


            }

        }
       
    }

    public static void main(String[] args) throws Exception {
        Questao50_FibonnaciPosicao app = new Questao50_FibonnaciPosicao();
        app.new FibonnaciPosicao();

    }
}
