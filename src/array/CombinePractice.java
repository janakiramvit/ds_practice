package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/11/17.
 */

/*My Approach during the interview:
    * backtracking is the way to go for this
    * I started out with having a recursion within a 'for' loop to achieve backtracking
    * Got digressed later thinking about how to add elements to arraylist and list subsequently
*/

public class CombinePractice {

    public List<List<Integer>> combine(int[] n){
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(),0,n);
        list.remove(0);                         //Remove blank array list thats present at the beginning of the final result list
        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> temp,int start, int n[]){
        list.add(new ArrayList<>(temp));        //Add new 'arraylist' to final result 'list'; add 'values' to this arraylist; e.g:list = {{},{1} ..}
                                                //David was trying to help me with this.
        for(int i = start;i<n.length;i++){
            temp.add(n[i]);                     //Adds 'input array values' to 'temp' arraylist e.g: temp = {1}
            backTrack(list,temp, i+1,n);        //Start recursion; Increment the 'start' value i+1, to attach consecutive values to existing values
            temp.remove(temp.size()-1);         //Removes old values in temp through the recursion
        }
    }

    public static void main(String[] args){
        CombinePractice combinePractice = new CombinePractice();
        int[] n = {-3,2};                        //input array
        /*Test cases include:
        * Ideal case: n = {1,2}
        * All zeroes: n = {0,0}
        * Negatives: n = {-1,-2}
        * Test 'size' of the array with larger array size
        * */
        System.out.println(combinePractice.combine(n));
    }
}
