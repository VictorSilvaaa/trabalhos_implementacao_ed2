import algoritmos_ordenacao.*;

import java.util.Arrays;

class Main {
    public static Integer[] existTwoNumbersN2(Integer [] v, int t){
        for(int i=0; i<v.length; i++){
            for (int j = 0; j<v.length; j++){
                if(v[i]-v[j]==t){
                    return new Integer[]{v[i],v[j]};
                }
            }
        }
        return new Integer[]{-1};
    }
    public static Integer[] existTwoNumbersNLogn(Integer [] v, int t){
        //ordena os vetores com merge sort
        MergeSortGeneric<Integer> intMergeSort = new MergeSortGeneric<>();
        intMergeSort.mergeSort(v, 0, v.length-1);

        //realiza busca binaria
        Utils<Integer> utils = new Utils<>();
        int elementoProcurado,result;
        for (int i = 0; i < v.length; i++) {
            elementoProcurado = v[i] + t;
            result = utils.buscaBinaria(v, elementoProcurado);
            if (result!= -1){
                return new Integer[]{v[i],v[result]}; //retorna os dois elementos
            }
        }
        return new Integer[]{-1};
    }

    public static void main(String[] args) {
        //Integer[] v = {1,2,3,10,5,7}; //vetor de entrada
        int tamanho = 1000;
        Integer[] v = new Integer[tamanho]; //vetor de entrada
        Utils.gerarVetorAleatorio(tamanho, v);
        int t = 98; //distancia
        System.out.println("Vetor de entrada: \n"+ Arrays.toString(v)+"\n");
        System.out.println("Questão 3 - resolução n^2:");

        long init1 = System.currentTimeMillis();
        Integer []result1 = existTwoNumbersN2(v, t);
        long end1 = System.currentTimeMillis();

        if(result1[0]!=-1){
            System.out.println("Existe: "+ result1[0]+ " - " + result1[1]+ " = "+ t);
        }else{
            System.out.println("Não Existe");
        };
        System.out.println("Tempo de execução para n^2: " + (end1-init1) + " ms");

        System.out.println("\nQuestão 3 - resolução nlogn:");
        long init2 = System.currentTimeMillis();
        Integer []result2 = existTwoNumbersNLogn(v, t);
        long end2 = System.currentTimeMillis();
        System.out.println("Tempo de execução para nlogn: " + (end2-init2) + " ms");
        if(result2[0]!=-1){
            System.out.println("Existe: "+ result2[1]+ " - " + result2[0]+ " = "+ t);
        }else{
            System.out.println("Não Existe");
        };

    }
}