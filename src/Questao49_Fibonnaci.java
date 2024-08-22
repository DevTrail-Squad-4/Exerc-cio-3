
public class Questao49_Fibonnaci {

    public class Fibonnaci{
        private long n1 = 1;
        private long n2 = 1;

        public Fibonnaci(){
            System.out.println("Esse codigo exibe os 50 primeiros números da seqüência de Fibonacci");
            int cont = 1;
            System.out.println(cont + " - " + n1);
            for( cont = 2; cont <= 50; cont++){


                long temp = 0 + n1;
                
                System.out.println(cont + " - " + n2);
                n1 = n2;

                n2= temp+n2;

            }

        }
       
    }

    public static void main(String[] args) throws Exception {
        Questao49 app = new Questao49();
        app.new Fibonnaci();

    }
}
