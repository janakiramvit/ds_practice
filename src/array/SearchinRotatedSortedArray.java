package array;

/**
 * Created by jpulipati on 8/8/17.
 */
public class SearchinRotatedSortedArray {

    public int search(int[] s, int n){
        int pivot = 0;
        int pivot_index = 0;
        int i = 0;
        while(i<s.length){
            if(s[i+1] <s[i]){
                pivot = s[i];
                pivot_index = i;
                break;
            }
            i++;

        }

        if(n<pivot){
            for(int j = 0; j<=pivot_index; j++){
                if(s[j] == n)
                    return j;
            }
        }
        else {
            for(int j =pivot_index+1; j<s.length;j++){
                if(s[j] == n)
                    return j;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        int s[] = {4,5,6,7,0,1,2};
        System.out.println(searchinRotatedSortedArray.search(s,5));
    }
}
