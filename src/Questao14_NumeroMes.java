import java.util.Scanner;

public class Questao14_NumeroMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do mês: ");
        String nomeMes = scanner.nextLine().trim();  

        
        int numeroMes = 0;
        boolean mesValido = true;

        switch (nomeMes.toLowerCase()) { 
            case "janeiro":
                numeroMes = 1;
                break;
            case "fevereiro":
                numeroMes = 2;
                break;
            case "março":
                numeroMes = 3;
                break;
            case "abril":
                numeroMes = 4;
                break;
            case "maio":
                numeroMes = 5;
                break;
            case "junho":
                numeroMes = 6;
                break;
            case "julho":
                numeroMes = 7;
                break;
            case "agosto":
                numeroMes = 8;
                break;
            case "setembro":
                numeroMes = 9;
                break;
            case "outubro":
                numeroMes = 10;
                break;
            case "novembro":
                numeroMes = 11;
                break;
            case "dezembro":
                numeroMes = 12;
                break;
            default:
                mesValido = false;
                System.out.println("Nome do mês inválido.");
                break;
        }
        

        
        if (mesValido) {
            System.out.printf("O número equivalente ao mês \"%s\" é: %d\n", nomeMes, numeroMes);
        }

        scanner.close();
    }
}
