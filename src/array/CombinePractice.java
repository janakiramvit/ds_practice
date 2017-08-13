package array;

import java.util.*;

/**
 * Created by jpulipati on 8/11/17.
 */

/**
 * Question:
 *  Write a program to print combinations of a given array of integers. The output should be a list of lists.
 */

/*My Approach during the interview:
    * Backtracking is the way to go for this
    * I started out with having a recursion within a 'for' loop to achieve backtracking
    * Got digressed later thinking about how to add elements to arraylist and list subsequently
 */

/*
* The following solution code includes:
* 1. All relevant methods and logic required to produce combination of elements
*   Note: Combination of elements for {3,1,1} = [[1], [1, 1], [3], [1, 1, 3], [1, 3]].
*   It doesnt contain any duplicate lists such as [1,3],[3,1], as it's not a permutation
* 2. Test Cases
* 3. Time complexity
 */

public class CombinePractice {

    public List<List<Integer>> combine(int[] n){

        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(),0,n);

        list.remove(0);                         //Remove blank array list thats present at the beginning of the final result list

        //Fix for Duplicates test-case
        for(List h: list)                       //Sort elements within list to remove redundant lists
            Collections.sort(h);                //e.g.: To remove {1,3},{3,1}. Since this is a combination rather than permutation, one list can be removed
        Set<List> hs = new HashSet<>();
        hs.addAll(list);                        //Removes duplicate/redundant lists within HashSet
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
        int[] n = {3,1,1};                        //input array

        /*Test cases include:
        * 1. Ideal case: n = {1,2} Result: Ideal
        * 2. Negatives: n = {-1,-2} Result: Ideal
        * 3. Duplicates: n = {0,0}/{3,1,2,1} Result: Duplicate results will be produced e.g: [3,1],[1,3]; fix present in code above
        * 4. Size of array: Have to check for the size of array, whether array size is very large or not
        * */

        /*Time complexity:
        * The function 'backTrack(list, new ArrayList<>(),0,n)' produces combinations similar to nc0 + nc1 + nc2 + .. + ncn
        * nc0 + nc1 + nc2 + .. + ncn = 2(power)n
        * So the time complexity of the backTrack() = 2pn
        * Time complexity of Sort of n elements, internally quick sort for Arrays.sort() = nlogn
        * There are totally 2pn elements produced in the final list
        * Time complexity of sort for 2pn set with n elements in each set = 2pn *nlogn
        * Therefore, total time complexity of program = t(backTrack) + t(sort) = 2pn + 2pn*nlogn =~ 2pn*nlogn
        * */

        System.out.println(combinePractice.combine(n));
    }
}
