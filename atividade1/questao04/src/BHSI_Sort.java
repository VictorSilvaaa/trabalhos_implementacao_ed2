import algoritmos_ordenacao.*;

import java.util.Arrays;

public class BHSI_Sort {
        public static Integer[] bhsisort(Integer[] vec) {
            int n = vec.length;
            SelectionSortGeneric<Integer> intSelectionSort = new SelectionSortGeneric<>();
            InsertionSortGeneric<Integer> intInsertionSort = new InsertionSortGeneric<>();

            for (int i = n / 2 - 1; i >= 0; i--) {
                Utils.maxHeap(vec, i, n);
            }
            System.out.println("Vetor pos maxheap:\n"+Arrays.toString(vec));

            int size_part = vec.length/3;
            Integer[] aux_vec1 = new Integer[size_part];
            Integer[] aux_vec2 = new Integer[vec.length-2*size_part];
            Integer[] aux_vec3 = new Integer[size_part];
            int j;
            for (int i = 0; i < size_part; i++) {
                aux_vec1[i] = vec[i];
            }
            j=0;
            for (int i = size_part; i < vec.length-size_part; i++) {
                aux_vec2[j] = vec[i];
                j++;
            }
            j=0;
            for (int i = vec.length-size_part; i < vec.length; i++) {
                aux_vec3[j] = vec[i];
                j++;
            }

            aux_vec1 = intSelectionSort.selectionSort(aux_vec1);
            aux_vec2 = intInsertionSort.insertionSort(aux_vec2);
            aux_vec3 = intSelectionSort.selectionSort(aux_vec3);
            System.out.println("Primeira parte pos selection sort:\n"+Arrays.toString(aux_vec1));
            System.out.println("Parte do meio pos insert sort: \n"+Arrays.toString(aux_vec2));
            System.out.println("Parte final pos selection sort: \n"+Arrays.toString(aux_vec3));



            for (int i = 0; i < aux_vec1.length; i++) {
                vec[i] = aux_vec1[i];
            }
            j=size_part;
            for (int i = 0; i < aux_vec2.length; i++) {
                vec[j++] = aux_vec2[i];
            }
            j= vec.length-size_part;
            for (int i = 0; i < aux_vec3.length; i++) {
                vec[j++] = aux_vec3[i];
            }
            return vec;
        }
}
