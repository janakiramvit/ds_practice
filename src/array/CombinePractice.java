package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/11/17.
 */

/*My Approach during the interview:
    * backtracking is the way to go
    * I started out with having a recursion within a 'for' loop to achieve backtracking
    * Got digressed later thinking about how to add elements to arraylist and list subsequently
*/

public class CombinePractice {

    public List<List<Integer>> combine(int[] n){
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(),0,n);
        list.remove(0);                         //Remove blank array list at the beginning of the list
        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> temp,int start, int n[]){
        list.add(new ArrayList<>(temp));        //Add array values to the list - David was trying to help me with this. e.g:list = {{},{1} ..}
        for(int i = start;i<n.length;i++){      //Starts with 0 and increments till length
            temp.add(n[i]);                     //Adds array values to array list e.g: temp = {1}
            backTrack(list,temp, i+1,n);        //Increment the 'start' value during recursion to attach consecutive values to existing values
            temp.remove(temp.size()-1);         //Removes old values in temp through the recursion
        }
    }

    public static void main(String[] args){
        CombinePractice combinePractice = new CombinePractice();
        int[] n = {1,2};                        //input array
        System.out.println(combinePractice.combine(n));
    }
}
