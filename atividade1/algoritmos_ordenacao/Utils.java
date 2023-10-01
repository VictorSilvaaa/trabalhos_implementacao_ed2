package algoritmos_ordenacao;

import java.util.Random;

public class Utils<T extends Comparable<T>> {
    public static void maxHeap(Integer []vetor, int i, int n) {
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        int raiz = i;
        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
        if (raiz != i) {
            int aux = vetor[raiz];
            vetor[raiz] = vetor[i];
            vetor[i] = aux;
            maxHeap(vetor, raiz, n);
        }
    }
    public int buscaBinaria(T[] arr, T alvo) {
        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            int comparacao = alvo.compareTo(arr[meio]);

            // Verifica se o elemento do meio é igual ao alvo
            if (comparacao == 0) {
                return meio; // Elemento encontrado, retorna o índice
            }

            // Se o alvo for menor, continue na metade esquerda do intervalo
            if (comparacao < 0) {
                direita = meio - 1;
            }
            // Se o alvo for maior, continue na metade direita do intervalo
            else {
                esquerda = meio + 1;
            }
        }

        return -1; // Elemento não encontrado
    }
    public static <T> T[] gerarVetorAleatorio(int tamanho, T[] vetor) {
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {

            int valorAleatorio = random.nextInt(100) + 1;
            vetor[i] = (T) Integer.valueOf(valorAleatorio);
        }

        return vetor;
    }
}
