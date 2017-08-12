package sort;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * Created by jpulipati on 7/16/17.
 */
public class quicksort {

    public void sort(int[] arr, int beg, int end){
        if(beg<end) {
            int split = partition(arr, beg, end);
            sort(arr, beg, split-1);
            sort(arr, split, end);
        }
    }

    public int partition(int[] arr, int low, int high ){
        int i = low-1;
        int temp;
        int pivot = arr[high];
            for(int j = low; j<arr.length;j++){
                if(arr[j]<pivot){
                    i++;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public void print(int[] arr){
        for(int i = 0; i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args){
        int[] arr = {10,1,100,4};
        int n = arr.length;
        quicksort sort = new quicksort();

        sort.sort(arr,0,n-1);
        sort.print(arr);
    }
}
