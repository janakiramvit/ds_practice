package sort;

/**
 * Created by jpulipati on 7/16/17.
 */
public class mergesort {
    public void sorted(int[] arr){
        //divide
        divide(arr);
        //compare

        //merge

    }

    public int[] divide(int[] arr){
        if(arr.length == 1 )
            return arr;
        int a[] = new int[arr.length/2];
        for(int i=0;i<arr.length/2;i++){
             a[i] = arr[i];
        }

        int b[] = new int[arr.length/2];
        for(int i=arr.length/2;i<arr.length;i++){
            b[i]= arr[i];
        }
        int m[] = divide(a);
        int n[] = divide(b);

        int i,j;
         i=j=0;

        while(i<=m.length && j<=n.length){
            if(m[i]<n[j]){

            }

        }


        return arr;
    }




    public static void main(String[] args){
        mergesort mergesort = new mergesort();
        int[] arr = {10,1,100,4};
        mergesort.sorted(arr);
    }
}
