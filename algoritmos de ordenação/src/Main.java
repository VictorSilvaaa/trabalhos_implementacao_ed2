import algoritmos_ordenacao.InsertSort;
import algoritmos_ordenacao.QuickSort;
import algoritmos_ordenacao.SelectSort;
import algoritmos_ordenacao.ShellSort;

public class Main {
    public static void main(String[] args){
        int [] numbers = {9,1,7,4,3,2};

        //algortimos_ordenacao.SelectSort
        System.out.println("---algortimos_ordenacao.SelectSort-----");
        SelectSort select = new SelectSort(numbers);
        select.orderNumbers();
        select.printNumbers();
        System.out.println("-------------------");

        //algortimos_ordenacao.InsertSort
        System.out.println("---algortimos_ordenacao.InsertSort-----");
        InsertSort insert = new InsertSort(numbers);
        insert.orderNumbers();
        insert.printNumbers();
        System.out.println("-------------------");

        //algortimos_ordenacao.ShellSort
        System.out.println("---algortimos_ordenacao.ShellSort-----");
        ShellSort shell = new ShellSort(numbers);
        shell.orderNumbers();
        shell.printNumbers();
        System.out.println("-------------------");

        //algortimos_ordenacao.QuickSort
        System.out.println("---algortimos_ordenacao.QuickSort-----");
        QuickSort quick = new QuickSort(numbers);
        quick.orderNumbers();
        quick.printNumbers();
        System.out.println("-------------------");
    }
}
