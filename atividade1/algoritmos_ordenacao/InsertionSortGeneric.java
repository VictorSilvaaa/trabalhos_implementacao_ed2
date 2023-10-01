package algoritmos_ordenacao;
import java.lang.Comparable;
public class InsertionSortGeneric<T extends Comparable<? super T>> {
    public T[] insertionSort(T[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int currentIndex = i;
            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
        return array;
    }
}