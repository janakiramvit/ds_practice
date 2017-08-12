package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/11/17.
 */

public class CombinePractice {

    public List<List<Integer>> combine(int[] n){
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(),0,n);
        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> temp,int start, int n[]){
        list.add(new ArrayList<>(temp));
        for(int i = start;i<n.length;i++){
            temp.add(n[i]);
            backTrack(list,temp, i+1,n);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        CombinePractice combinePractice = new CombinePractice();
        int[] n = {1,2};
        System.out.println(combinePractice.combine(n));
    }
}
