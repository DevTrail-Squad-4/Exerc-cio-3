import java.util.Scanner;

class PontoGeometria {
    int x, y;

    public PontoGeometria(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RetanguloGeometria {
    PontoGeometria verticeSuperiorEsquerdo;
    PontoGeometria verticeInferiorDireito;

    public RetanguloGeometria(PontoGeometria v1, PontoGeometria v2, PontoGeometria v3, PontoGeometria v4) {
        PontoGeometria[] vertices = {v1, v2, v3, v4};
        calcularVertices(vertices);
    }

    private void calcularVertices(PontoGeometria[] vertices) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (PontoGeometria p : vertices) {
            if (p.x < minX) minX = p.x;
            if (p.x > maxX) maxX = p.x;
            if (p.y < minY) minY = p.y;
            if (p.y > maxY) maxY = p.y;
        }

        this.verticeSuperiorEsquerdo = new PontoGeometria(minX, maxY);
        this.verticeInferiorDireito = new PontoGeometria(maxX, minY);
    }

    public boolean seSobrepoeCom(RetanguloGeometria outro) {
        return !(verticeInferiorDireito.x < outro.verticeSuperiorEsquerdo.x ||
                verticeSuperiorEsquerdo.x > outro.verticeInferiorDireito.x ||
                verticeInferiorDireito.y > outro.verticeSuperiorEsquerdo.y ||
                verticeSuperiorEsquerdo.y < outro.verticeInferiorDireito.y);
    }
}

public class Questao30_Retangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas dos 4 vértices do primeiro retângulo (x y): ");
        PontoGeometria r1v1 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r1v2 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r1v3 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r1v4 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        RetanguloGeometria retangulo1 = new RetanguloGeometria(r1v1, r1v2, r1v3, r1v4);

        System.out.println("Digite as coordenadas dos 4 vértices do segundo retângulo (x y): ");
        PontoGeometria r2v1 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r2v2 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r2v3 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        PontoGeometria r2v4 = new PontoGeometria(scanner.nextInt(), scanner.nextInt());
        RetanguloGeometria retangulo2 = new RetanguloGeometria(r2v1, r2v2, r2v3, r2v4);

        if (retangulo1.seSobrepoeCom(retangulo2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }

        scanner.close();
    }
}
