import java.util.Random;

public class Questao34_SorteioDeNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int quantidadeDeNumeros = 50;
        int limiteInferior = 1;
        int limiteSuperior = 100;

        System.out.println("Números sorteados:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {

            int numeroSorteado = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
            System.out.println("Número " + (i + 1 ) + ": " + numeroSorteado);
        }
    }
}
