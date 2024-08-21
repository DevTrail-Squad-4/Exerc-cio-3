import java.util.*;

public class Questao35_SorteioDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int quantidade = 0;
        int faixaMin = 0;
        int faixaMax = 0;

        while (true) {
            try {
                System.out.print("Digite a quantidade de números a serem sorteados: ");
                quantidade = scanner.nextInt();
                if (quantidade <= 0) {
                    System.out.println("A quantidade deve ser um número positivo.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o valor mínimo da faixa: ");
                faixaMin = scanner.nextInt();
                System.out.print("Digite o valor máximo da faixa: ");
                faixaMax = scanner.nextInt();

                if (faixaMin >= faixaMax) {
                    System.out.println("O valor mínimo deve ser menor que o valor máximo.");
                    continue;
                }
                if (quantidade > (faixaMax - faixaMin + 1)) {
                    System.out.println("Não é possível sortear mais números do que a faixa disponível.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite números inteiros.");
                scanner.next();
            }
        }

        List<Integer> numerosSorteados = new ArrayList<>();

        while (numerosSorteados.size() < quantidade) {
            int numero = random.nextInt(faixaMax - faixaMin + 1) + faixaMin;
            if (!numerosSorteados.contains(numero)) {
                numerosSorteados.add(numero);
            }
        }

        System.out.println("Números sorteados: ");
        for (int numero : numerosSorteados) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
