import java.math.BigInteger;

public class Questao52_ApostaRei {
    public static void main(String[] args) {
        BigInteger totalGraos = BigInteger.ZERO; // Inicializar com BigInteger.ZERO
        for (int i = 0; i < 64; i++) {
            totalGraos = totalGraos.add(BigInteger.valueOf(2).pow(i)); // Usar BigInteger para adição e potência
        }
        
        // Estimativa de grãos por saco de arroz
        BigInteger grãosPorSaco = BigInteger.valueOf(200_000);
        
        // Calcular o número de sacos
        BigInteger númeroDeSacos = totalGraos.divide(grãosPorSaco);
        
        System.out.println("Total de grãos: " + totalGraos);
        System.out.println("Número de sacos de arroz: " + númeroDeSacos);
    }
}