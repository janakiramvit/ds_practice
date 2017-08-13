package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/12/17.
 */
public class GenParentheses {

    public List<String> generateParenthesis(int n){
        List<String> list = new ArrayList<>();
        backTrack(list,"",0,n);
        return list;
    }

    public void backTrack(List<String> list,String str,int start, int n){
        for(int i = start; i<n;i++) {
            str = str + "(";
            backTrack(list,str,i+1, n);
            i = start;
            str = str + ")";
            backTrack(list,str,i+1, n);
        }

    }
    public static void main(String[] args){
        GenParentheses genParentheses = new GenParentheses();
        int n =2;
        genParentheses.generateParenthesis(n);
    }
}
