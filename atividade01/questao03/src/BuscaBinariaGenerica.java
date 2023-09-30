
public class BuscaBinariaGenerica<T extends Comparable<T>> {
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
}
