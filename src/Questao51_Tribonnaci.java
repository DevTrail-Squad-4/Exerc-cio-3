import java.util.Scanner;

public class Questao51_Tribonnaci {

        public class Tribonnaci{
        Scanner scan = new Scanner(System.in);
        private long n1 = 1;
        private long n2 = 1;
        private long n3 = 2;
        public Tribonnaci(){
            System.out.println("Esse codigo encontra a posicao n-esima na sequencia fibonnaci ");
            System.out.println("Insira a posicao desejada");
            int posicao = scan.nextInt();
            int cont = 1;
            
            System.out.println("posicao " + cont + " - " + n1);
            System.out.println("posicao " + (cont + 1) +  " - " + 1);
            System.out.println("posicao " + (cont + 2) +  " - " + 2);
            for( cont = 3; cont <= (posicao-1); cont++){
                long temp = 0 + n1;
                long temp2 = 0 + n2;
                n1 = n2; // 1 // 2
                n2= temp+n2; // 2 // 3 
                n3= temp2+n3; // 3 // 
                System.out.println("posicao " + (cont + 1) + " - " + n3);



            }

        }
       
    }

    public static void main(String[] args) throws Exception {
        Questao51 app = new Questao51();
        app.new Tribonnaci();

    }
    

}
