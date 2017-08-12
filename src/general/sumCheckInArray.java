package general;

/**
 * Created by jpulipati on 8/4/17.
 */
public class sumCheckInArray {

    public String sumCheck(int[] arr, int n){
        int i = 0;
        int j = arr.length-1;
        return findElement(arr, n,i,j);
    }

    public String findElement(int[] arr, int n, int i, int j){
        String status = null;
        while(i<j) {
            System.out.println(i + " iter");
            if (arr[i] + arr[j] == n) {
                System.out.println(" match");
                i++;
                status = "true";
            }
            if(arr[i] + arr[j] <n)
                i++;
            if(arr[i] + arr[j] >n)
                j--;

        }
        return status;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = 6;

        sumCheckInArray sumCheckInArray = new sumCheckInArray();
        //boolean flag =sumCheckInArray.sumCheck(arr,n);
        System.out.println(sumCheckInArray.sumCheck(arr,n));

    }
}
