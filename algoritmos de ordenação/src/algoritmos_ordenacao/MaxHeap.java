package algoritmos_ordenacao;

public class MaxHeap {
    public MaxHeap(){

    }
    public void maxheap(int []vetor, int i, int n) {
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
            MaxHeap(vetor, raiz, n);
        }
    }
}
