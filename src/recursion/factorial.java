package recursion;

/**
 * Created by jpulipati on 7/14/17.
 */
public class factorial {
    public int calculate(int n){
        if(n==1){
            return 1;
        }
        else {
            int result = n * calculate(n - 1);
            return result;
        }
    }
    public static void main(String[] args){
        factorial factorial= new factorial();
        System.out.println(factorial.calculate(5));
    }
}
