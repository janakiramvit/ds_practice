package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jpulipati on 8/8/17.
 */


public class DuplicatesInArray {

    //nlogn time
    public void findDupes1(int s[]){
        System.out.println("nlogn time");
        int i = 0;
        int j = 1;
        Arrays.sort(s);
        while(i<s.length){
            if (i != s.length-1 && s[i] == s[i+1]){
                 System.out.println(s[i]);
               }
            i++;
            }
        }

    //n time
    public List<Integer> findDupes2(int nums[]){
        System.out.println("N time");

//{1,2,2,3};

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            System.out.println("index " + index);
            if (nums[index] < 0) {
                System.out.println("found dupe " );
                res.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
            System.out.println("nums[index] " + nums[index]);
        }
        return res;
    }

    //n2 time
    public void findDupes3(int s[]){
        System.out.println("\nN2 time");
        for(int i = 0;i<s.length;i++ ){
            for(int j = i+1;j<s.length;j++){
                if(s[i] == s[j])
                    System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args){
        int s[] = {1,2,3};
        DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
        //DuplicatesInArray.findDupes1(s);
        System.out.println(duplicatesInArray.findDupes2(s));
        //DuplicatesInArray.findDupes3(s);
    }
}
