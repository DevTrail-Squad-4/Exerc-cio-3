import java.lang.Math;



public class Questao6_Area {
    public class Area{
        private final double RAIO = 5;
        private final double PI = Math.PI;

        public Area(){
            double resultado = PI * (RAIO * RAIO);
            System.out.println(resultado);



        }
    }
    public static void main(String[] args) throws Exception {
        Questao6 app = new Questao6();
        Area area = app.new Area();
    }
}
