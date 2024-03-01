import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> encontrarSubconjuntos(int[] conjunto, int n) {
        List<List<Integer>> result = new ArrayList<>();
        encontrarSubconjuntos(conjunto, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void encontrarSubconjuntos(int[] conjunto, int n, int index, List<Integer> atual, List<List<Integer>> result) {
        if (atual.size() == n) {
            result.add(new ArrayList<>(atual));
            return;
        }

        for (int i = index; i < conjunto.length; i++) {
            atual.add(conjunto[i]);
            encontrarSubconjuntos(conjunto, n, i + 1, atual, result);
            atual.remove(atual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] conjunto1 = {1, 2, 3};
        int n1 = 2;
        List<List<Integer>> subconjuntos1 = encontrarSubconjuntos(conjunto1, n1);
        System.out.println("Subconjuntos de tamanho " + n1 + " para o conjunto " + java.util.Arrays.toString(conjunto1) + ":");
        for (List<Integer> subconjunto : subconjuntos1) {
            System.out.println(subconjunto);
        }

        int[] conjunto2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> subconjuntos2 = encontrarSubconjuntos(conjunto2, n2);
        System.out.println("\nSubconjuntos de tamanho " + n2 + " para o conjunto " + java.util.Arrays.toString(conjunto2) + ":");
        for (List<Integer> subconjunto : subconjuntos2) {
            System.out.println(subconjunto);
        }
    }
}

// Esta implementação utiliza recursão para gerar todos os subconjuntos possíveis de tamanho n do conjunto dado.
//A função encontrarSubconjuntos é uma função auxiliar que realiza a lógica do backtracking. A função main demonstra o uso desta função com os exemplos fornecidos.