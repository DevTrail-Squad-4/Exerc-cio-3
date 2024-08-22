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
        Questao6_Area app = new Questao6_Area();
        Area area = app.new Area();
    }
}
