import java.lang.Math;



public class Questao06_Area {
    public class Area{
        private final double RAIO = 5;
        private final double PI = Math.PI;

        public Area(){
            double resultado = PI * (RAIO * RAIO);
            System.out.println(resultado);



        }
    }
    public static void main(String[] args) throws Exception {
        Questao06_Area app = new Questao06_Area();
        Area area = app.new Area();
    }
}
