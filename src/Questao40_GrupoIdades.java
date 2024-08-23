import java.util.Scanner;

public class Questao40_GrupoIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas no grupo: ");
        int quantidadePessoas = scanner.nextInt();

        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int quantidadeMaiorDeIdade = 0;
        boolean todasIdadesIguais = true;
        int idadeAnterior = -1; 

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;

            if (i == 1) { 
                idadeAnterior = idade;
            } else if (idade != idadeAnterior) {
                todasIdadesIguais = false;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade >= 18) {
                quantidadeMaiorDeIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.printf("Média das idades: %.2f\n", mediaIdades);

        if (todasIdadesIguais) {
            System.out.println("Todas as idades são iguais, portanto não há maior ou menor idade.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
        }

        System.out.println("Quantidade de pessoas maior de idade: " + quantidadeMaiorDeIdade);

        scanner.close();
    }
}
