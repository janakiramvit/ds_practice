package recursion;

/**
 * Created by jpulipati on 7/14/17.
 */
public class fibonacci {
    public int calculate(int n){
        if(n == 0)
            return 0;
        if(n==1)
            return 1;

        int result = calculate(n-1) + calculate(n-2);
        return result;
    }
    public static void main(String[] args){
        fibonacci fibonacci = new fibonacci();
        System.out.println(fibonacci.calculate(7));
    }
}
