package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jpulipati on 8/8/17.
 */
public class MinMoves {

    public void min(int s[]){
        System.out.println("Hello");
        Arrays.sort(s);
        //s = {1,2,3,4}
        int  diff,target;
        int i = 1;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(i<s.length-1){
            System.out.println("target is " + s[i]);
            target = s[i];
            diff = 0;
            j=0;
            while(j<s.length){
                diff = diff + Math.abs(target-s[j]);
                System.out.println("diff is " + diff);
                j++;
            }

            System.out.println("j-1 is " + (j-1));
            list.add(diff);
            i++;
        }

            System.out.println(list);
    }


    public static void main(String[] args) {
        MinMoves main = new MinMoves();
        int s[] = {2,15,10};
        main.min(s);
    }
}
