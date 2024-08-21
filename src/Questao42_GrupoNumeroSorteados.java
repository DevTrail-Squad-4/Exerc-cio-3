import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Questao42_GrupoNumeroSorteados {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUM_GRUPOS = 40;
        final int NUMEROS_POR_GRUPO = 3;
        final int MAX_NUMERO = 59;
        
        ArrayList<ArrayList<Integer>> grupos = new ArrayList<>();

        for (int i = 0; i < NUM_GRUPOS; i++) {
            Set<Integer> numerosUnicos = new HashSet<>();
            
            while (numerosUnicos.size() < NUMEROS_POR_GRUPO) {
                numerosUnicos.add(random.nextInt(MAX_NUMERO + 1));
            }

            ArrayList<Integer> grupo = new ArrayList<>(numerosUnicos);
            Collections.sort(grupo);
            grupos.add(grupo);
        }

        System.out.println("Grupos de números sorteados:");
        for (int i = 0; i < grupos.size(); i++) {
            System.out.printf("Grupo %2d: %s\n", i + 1, grupos.get(i));
        }
    }
}
