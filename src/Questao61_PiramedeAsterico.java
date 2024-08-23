import java.util.Scanner;
public class Questao61_PiramedeAsterico {

    public class PiramedeAsterisco{
        Scanner scan = new Scanner(System.in);
        public int quantidadeLinhas;
        public String asterisco = "*";
        public final String asteriscoFixo = "*";
        public PiramedeAsterisco(){
            System.out.println("Esse programa desenha uma piramide feita com *");
            System.out.println("infome a quantidade de linhas que voce deseja");
            quantidadeLinhas = scan.nextInt();
            int cont = 1;
            while(cont <= quantidadeLinhas){
                String temp = asterisco + asteriscoFixo;
                System.out.println(asterisco);
                asterisco = temp;
                cont++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Questao61 app = new Questao61();
        app.new PiramedeAsterisco();

    

    }
}
