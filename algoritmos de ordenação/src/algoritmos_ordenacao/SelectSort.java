package algoritmos_ordenacao;

public class SelectSort {
    private int [] numbers;
    public SelectSort(int [] numbers){
        this.numbers = numbers;
    }public SelectSort(){

    }
    public void printNumbers(){
        for(int n: this.numbers){
            System.out.println(n);
        }
    }

    public int[] orderNumbers(){
        int min, sizeArray, temp;
        int [] array;

        array= this.numbers;
        sizeArray = array.length;

        for(int i=0; i < sizeArray-1; i++){
            min = i;
            for(int j = i+1; j<sizeArray; j++){
                if(array[i]>array[j]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        this.numbers = array;
        return this.numbers;
    }
}
