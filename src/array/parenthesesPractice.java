package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/10/17.
 */
public class parenthesesPractice {

    public List<String> print(int n){
        List<String> list = new ArrayList<>();

        backtrack(list,"", 0,0,n );
        return list;
    }

    public void backtrack(List<String> list, String str,int open, int close, int n ){
        if(str.length() == n*2){
            list.add(str);
            return;
        }

        if(open<n)
            backtrack(list, str+"(",open+1, close, n );
        if(close<open)
            backtrack(list, str+")",open, close+1, n );
    }

    public static void main(String[] args){
        parenthesesPractice parenthesesPractice = new parenthesesPractice();
        int n = 2;
        System.out.println(parenthesesPractice.print(n));
    }
}
