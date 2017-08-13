package array;

import java.util.*;

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

        //Fix for Duplicates test-case
        Set<List> hs = new HashSet<>();
        hs.addAll(list);                        //Removes duplicate lists within HashSet
        list.clear();                           //Clear the list
        for(List h: hs)
            list.add(h);                        //Add back non-duplicate lists from Set to 'list'

        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> temp,int start, int n[]){
        list.add(new ArrayList<>(temp));        //David was trying to help me with this.
                                                //Add empty 'arraylist' to final result 'list'; add 'temp' to this empty arraylist; e.g:list = {{},{1} ..}
        for(int i = start;i<n.length;i++){
            temp.add(n[i]);                     //Adds 'input array values' to 'temp' arraylist e.g: temp = {1}
            backTrack(list,temp, i+1,n);        //Start recursion; Increment the 'start' value i+1, to attach consecutive values to existing values
                                                //e.g.attach '2' to existing {1} -> {1,2}
            temp.remove(temp.size()-1);         //Removes old values in temp through the recursion
        }
    }

    public static void main(String[] args){

        CombinePractice combinePractice = new CombinePractice();
        int[] n = {0,0,0};                        //input array

        /*Test cases include:
        * 1. Ideal case: n = {1,2} Result: Ideal
        * 2. Negatives: n = {-1,-2} Result: Ideal
        * 3. Duplicates: n = {0,0}/{3,1,2,1} Result: Duplicate results will be produced; fix present in code above
        * 4. Size of array: Due to recursion there could be a possibility of Stack overflow error if array size is very large
        * */

        /*Time complexity:
        *
        * */

        System.out.println(combinePractice.combine(n));
    }
}
