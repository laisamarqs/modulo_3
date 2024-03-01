import java.util.*;

public class TrocoMinimo {

    public static List<Integer> darTroco(int quantia, List<Integer> moedas) {
        List<Integer> troco = new ArrayList<>();
        Collections.sort(moedas, Collections.reverseOrder()); // Ordena as moedas em ordem decrescente

        for (int i = 0; i < moedas.size(); i++) {
            while (quantia >= moedas.get(i)) {
                troco.add(moedas.get(i));
                quantia -= moedas.get(i);
            }
        }

        return troco;
    }

    public static void main(String[] args) {
        int quantia = 18;
        List<Integer> moedasDisponiveis = Arrays.asList(5, 2, 1);

        List<Integer> troco = darTroco(quantia, moedasDisponiveis);

        System.out.println("Troco: " + troco);
    }
}

// A função darTroco recebe a quantia a ser trocada e a lista de moedas disponíveis.
//As moedas são ordenadas em ordem decrescente para que possamos sempre escolher a maior moeda disponível.
//Iteramos sobre as moedas disponíveis e, enquanto a quantia for maior ou igual ao valor da moeda atual, adicionamos essa moeda ao troco e subtraímos seu valor da quantia.
//No final, retornamos a lista de moedas que representam o troco.
//O exemplo de saída será:
//Troco: [5, 5, 5, 2, 1]
