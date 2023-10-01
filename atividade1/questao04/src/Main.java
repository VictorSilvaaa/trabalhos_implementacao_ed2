import java.util.Arrays;
import java.util.Random;

import algoritmos_ordenacao.*;
import algoritmos_ordenacao.Utils;
public class Main {
    public static void main(String[] args) {
        int tamanho = 9;
        Integer[] numbers = new Integer[tamanho];
        Utils.gerarVetorAleatorio(tamanho, numbers);
        System.out.println("Vetor Inicial: \n"+Arrays.toString(numbers));
        BHSI_Sort.bhsisort(numbers);
        System.out.println("Vetor final: \n"+Arrays.toString(numbers));
    }
}