package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/10/17.
 */
public class parentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        System.out.println("bt( list ,str , open , close , max )");
        System.out.println("bt("+ list + "," +str + "," + open + "," + close+ "," + max+ ")");

        if(str.length() == max*2){
            System.out.println("**");
            System.out.println("str is " + str);
            System.out.println("list is " + list);
            list.add(str);
            return;
        }

        if(open < max) {
            System.out.println("^ new recursion");
            System.out.println("if open < max " + open + "<" + max);
            backtrack(list, str + "(", open + 1, close, max);
        }

        if(close < open) {
            System.out.println("if close < open " + close + "<" + open);
            backtrack(list, str + ")", open, close + 1, max);
            System.out.println("^ end recursion");
        }
    }

    public static void main(String[] args){
        parentheses parentheses = new parentheses();
        int n = 2;
        System.out.println(parentheses.generateParenthesis(n));
    }
}
