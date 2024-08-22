import java.math.BigInteger;


public class Questao52_ApostaRei {

    public class ApostaRei{
        public BigInteger calculo;
        public BigInteger numeroGraos;
        public BigInteger numeroCasa;

        public ApostaRei(){

            int cont = 1;
            numeroGraos = new BigInteger("1"); 
            numeroCasa = new BigInteger("1"); 
            while (cont<=64) {


                calculo = numeroGraos.multiply(numeroCasa); 
               
                numeroGraos = calculo; 
                numeroCasa = numeroCasa.add(new BigInteger("1"));

                cont++;
            }
            System.out.println("Esse codigo mostra o resultado de uma aposta entre um rico e um pobre");
            System.out.println("O rico tera que pagar ao pobre o valor em graos de arroz de :");
            System.out.println(calculo);


        }
    }
    public static void main(String[] args) throws Exception {
        Questao52 app = new Questao52();
        app.new ApostaRei();

    }
}
