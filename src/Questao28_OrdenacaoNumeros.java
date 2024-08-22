import java.util.Scanner;

public class Questao28_OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Digite um numero inteiro:");
        a = scanner.nextInt();

        System.out.println("Digite um numero inteiro:");
        b = scanner.nextInt();

        System.out.println("Digite um numero inteiro:");
        c = scanner.nextInt();

        if (a > b) { int temp = a; a = b; b = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        if (a > b) { int temp = a; a = b; b = temp; }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}
