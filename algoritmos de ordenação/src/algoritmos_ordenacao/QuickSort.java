package algoritmos_ordenacao;

public class QuickSort {
    private int [] numbers;
    public QuickSort(int [] numbers){
        this.numbers = numbers;
    }
    public void printNumbers(){
        for(int n: this.numbers){
            System.out.println(n);
        }
    }

    public void orderNumbers(){
        int [] array = this.numbers;
        recursiveQuick(array, 0, array.length-1);
    }

    public void recursiveQuick(int [] array, int esq, int dir){
        int pivo,i,j,temp;

        if(dir>esq){
            pivo = array[dir];
            i = esq;
            j= dir-1;

            while(i<=j){
                if(array[i]<=pivo){
                    i++;
                }else if(array[j]>pivo){
                    j--;
                }else{
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            temp = array[i];
            array[i] = array[dir];
            array[dir] = temp;

            recursiveQuick(array,esq, i-1);
            recursiveQuick(array,i+1, dir);
        }
    }
}
