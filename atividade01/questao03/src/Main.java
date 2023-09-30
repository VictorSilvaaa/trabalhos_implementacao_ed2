import algoritmos_ordenacao_generic.MergeSortGeneric;

public class Main {
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
        MergeSortGeneric<Integer> merge = new MergeSortGeneric<>();
        merge.mergeSort(v, 0, v.length-1);

        //realiza busca binaria
        BuscaBinariaGenerica buscaBinaria = new BuscaBinariaGenerica();
        int elementoProcurado,result;
        for (int i = 0; i < v.length; i++) {
            elementoProcurado = v[i] + t;
            result = buscaBinaria.buscaBinaria(v, elementoProcurado);
            if (result!= -1){
                return new Integer[]{v[i],v[result]}; //retorna os dois elementos
            }
        }
        return new Integer[]{-1};
    }

    public static void main(String[] args) {
        Integer[] v = {1,2,3,10,5,7};
        int t = 5;

        System.out.println("Questão 3 - resolução n^2:");
        Integer []result1 = existTwoNumbersN2(v, t);
        if(result1[0]!=-1){
            System.out.println("Existe: "+ result1[0]+ " - " + result1[1]+ " = "+ t);
        }else{
            System.out.println("Não Existe");
        };

        System.out.println("Questão 3 - resolução nlogn:");
        Integer []result2 = existTwoNumbersNLogn(v, t);
        if(result2[0]!=-1){
            System.out.println("Existe: "+ result2[1]+ " - " + result2[0]+ " = "+ t);
        }else{
            System.out.println("Não Existe");
        };



    }
}