import java.util.Scanner;

public class Questao62_PiramedeNumerica {
    public class PiramedeNumerica{
        Scanner scan = new Scanner(System.in);
        public int quantidadeLinhas;
        public String zeroBase = "0";


        public PiramedeNumerica(){
            
            System.out.println("Esse programa desenha uma piramide feita com a sequencia de numeros");
            System.out.println("infome a quantidade de linhas que voce deseja");
            quantidadeLinhas = scan.nextInt();
            int cont = 1;

            while(cont <= quantidadeLinhas){
                
                String numero = zeroBase + cont + " ";
                

                if(cont >= 10){
                    numero = cont + " ";
                }
                String resultado = numero.repeat(cont);

                System.out.println(resultado);
                
                cont++;

            }
        }
    }
    public static void main(String[] args) throws Exception {
        Questao62 app = new Questao62();
        app.new PiramedeNumerica();

    

    }
}
