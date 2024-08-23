import java.util.Scanner;

class Ponto {
    int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Retangulo {
    Ponto verticeSuperiorEsquerdo;
    Ponto verticeInferiorDireito;

    public Retangulo(Ponto verticeSuperiorEsquerdo, Ponto verticeInferiorDireito) {
        this.verticeSuperiorEsquerdo = verticeSuperiorEsquerdo;
        this.verticeInferiorDireito = verticeInferiorDireito;
    }

    public boolean eRetangulo() {
        return verticeSuperiorEsquerdo.x < verticeInferiorDireito.x &&
                verticeSuperiorEsquerdo.y > verticeInferiorDireito.y;
    }

    public boolean eRetaHorizontal() {
        return verticeSuperiorEsquerdo.y == verticeInferiorDireito.y &&
                verticeSuperiorEsquerdo.x != verticeInferiorDireito.x;
    }

    public boolean eRetaVertical() {
        return verticeSuperiorEsquerdo.x == verticeInferiorDireito.x &&
                verticeSuperiorEsquerdo.y != verticeInferiorDireito.y;
    }

    public boolean ePonto() {
        return verticeSuperiorEsquerdo.x == verticeInferiorDireito.x &&
                verticeSuperiorEsquerdo.y == verticeInferiorDireito.y;
    }

    public int calcularArea() {
        if (eRetangulo()) {
            int largura = verticeInferiorDireito.x - verticeSuperiorEsquerdo.x;
            int altura = verticeSuperiorEsquerdo.y - verticeInferiorDireito.y;
            return largura * altura;
        }
        return 0;
    }

    public String posicaoDoPonto(Ponto ponto) {
        if (ponto.x < verticeSuperiorEsquerdo.x && ponto.y > verticeSuperiorEsquerdo.y) {
            return "acima e à esquerda";
        } else if (ponto.x >= verticeSuperiorEsquerdo.x && ponto.x <= verticeInferiorDireito.x && ponto.y > verticeSuperiorEsquerdo.y) {
            return "acima";
        } else if (ponto.x > verticeInferiorDireito.x && ponto.y > verticeSuperiorEsquerdo.y) {
            return "acima e à direita";
        } else if (ponto.x < verticeSuperiorEsquerdo.x && ponto.y < verticeInferiorDireito.y) {
            return "embaixo e à esquerda";
        } else if (ponto.x >= verticeSuperiorEsquerdo.x && ponto.x <= verticeInferiorDireito.x && ponto.y < verticeInferiorDireito.y) {
            return "embaixo";
        } else if (ponto.x > verticeInferiorDireito.x && ponto.y < verticeInferiorDireito.y) {
            return "embaixo e à direita";
        } else if (ponto.x < verticeSuperiorEsquerdo.x && ponto.y <= verticeSuperiorEsquerdo.y && ponto.y >= verticeInferiorDireito.y) {
            return "à esquerda";
        } else if (ponto.x > verticeInferiorDireito.x && ponto.y <= verticeSuperiorEsquerdo.y && ponto.y >= verticeInferiorDireito.y) {
            return "à direita";
        } else if (ponto.x > verticeSuperiorEsquerdo.x && ponto.x < verticeInferiorDireito.x &&
                ponto.y < verticeSuperiorEsquerdo.y && ponto.y > verticeInferiorDireito.y) {
            return "dentro do retângulo";
        } else {
            return "na linha do retângulo";
        }
    }
}

public class Questao29_PlanoCartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice superior esquerdo (x y): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        Ponto verticeSuperiorEsquerdo = new Ponto(x1, y1);

        System.out.println("Digite as coordenadas do vértice inferior direito (x y): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Ponto verticeInferiorDireito = new Ponto(x2, y2);

        Retangulo retangulo = new Retangulo(verticeSuperiorEsquerdo, verticeInferiorDireito);

        if (retangulo.eRetangulo()) {
            System.out.println("Os pontos formam um retângulo.");
        } else if (retangulo.eRetaHorizontal()) {
            System.out.println("Os pontos formam uma reta horizontal.");
        } else if (retangulo.eRetaVertical()) {
            System.out.println("Os pontos formam uma reta vertical.");
        } else if (retangulo.ePonto()) {
            System.out.println("Os pontos formam um ponto.");
        } else {
            System.out.println("Os pontos não formam uma figura válida.");
        }

        if (retangulo.eRetangulo()) {
            System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        }

        System.out.println("Digite as coordenadas de outro ponto (x y): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        Ponto outroPonto = new Ponto(x3, y3);

        System.out.println("A posição do ponto em relação ao retângulo é: " + retangulo.posicaoDoPonto(outroPonto));

        scanner.close();
    }
}
