package recursion;

/**
 * Created by jpulipati on 7/14/17.
 */
public class bunnyEars {

    public int calcluate(int n){

        int result = n+n;
        return result;
    }

    public static void main(String[] args){
        bunnyEars bunnyEars = new bunnyEars();
        System.out.println(bunnyEars.calcluate(10));
    }
}
