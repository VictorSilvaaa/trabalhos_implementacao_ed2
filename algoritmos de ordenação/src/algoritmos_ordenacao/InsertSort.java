package algoritmos_ordenacao;

public class InsertSort {
    private int [] numbers;
    public InsertSort(int [] numbers){
        this.numbers = numbers;
    }
    public void printNumbers(){
        for(int n: this.numbers){
            System.out.println(n);
        }
    }

    public void orderNumbers(){
        int i,sizeArray, chave;
        int [] array;

        array = this.numbers;
        sizeArray = array.length;

        for(int j = 1; j<sizeArray; j++){
            chave = array[j];
            i = j - 1;

            while(i>=0 && array[i]>chave){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = chave;
        }

        this.numbers = array;
    }
}
