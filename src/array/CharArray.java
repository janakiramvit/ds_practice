package array;

/**
 * Created by jpulipati on 8/10/17.
 */
public class CharArray {
    public static void main(String[] args){
        char[][] word = {{'A','B'},{'C','D'}};
        for(int i = 0; i<word.length;i++){
            for(int j = 0; j<word.length;j++)
            System.out.println(word[i][j]);
        }
    }
}
