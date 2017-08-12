package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/10/17.
 */
public class PermutePractice {

    public List<List<Integer>> permute(int n[]){

        List<List<Integer>> list = new ArrayList<>();
        backTrack(list,new ArrayList<>(),0, n);
        return list;

    }

    public void backTrack(List<List<Integer>> list, List<Integer> temp, int start, int n[]){
        list.add(new ArrayList<>(temp));
        for(int i = start; i<n.length;i++){
            temp.add(n[i]);
            System.out.println("backTrack(" + list +","+ temp +","+ Integer.valueOf(start+1) +","+ n+")");
            backTrack(list, temp, i+1, n);
            System.out.println("temp.remove(" + Integer.valueOf(temp.size()-1) + ")");
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args){
        PermutePractice permutePractice = new PermutePractice();
        int n[] = {1,2};
        System.out.println(permutePractice.permute(n));
    }
}
