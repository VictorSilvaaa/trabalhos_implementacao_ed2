package algoritmos_ordenacao;

public class ShellSort {
    private int [] numbers;
    public ShellSort(int [] numbers){
        this.numbers = numbers;
    }
    public void printNumbers(){
        for(int n: this.numbers){
            System.out.println(n);
        }
    }

    public void orderNumbers(){
        int h, temp, j, sizeArray;
        int [] array;
        array= this.numbers;
        sizeArray = array.length;


        for(h=1; h<sizeArray; h = (3*h)+1);

        while (h>0){
            System.out.println("valor de h: " + h);
            h = (h-1)/3;
            for (int i= h; i< sizeArray; i++){
                temp = array[i];
                j = i;

                while (array[j-h]>temp){
                    array[j] = array[j-h];
                    j = j-h;
                    if (j<h) break;
                }
                array[j] = temp;
            }
        }

    }
}
